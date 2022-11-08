from asyncio.windows_events import NULL
import os,sys
import xml.dom.minidom as dom
from antlr4 import *
from mat_py.MATLexer import MATLexer
from mat_py.MATParser import MATParser
from mat_py.MATListener import MATListener
import nidigital

pinmaps = {}
pingroups = {}
pinmaps_groups = []
timesets = {}
voltagelevels = {}

vector_table = []
current_tset = ''
if__end__label_counter =  0
if__end__label_stack = []
class listener(MATListener):     
  
    
    # Enter a parse tree produced by MATParser#complete.
    def enterStart(self, ctx:MATParser.StartContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

    # Exit a parse tree produced by MATParser#complete.
    def exitStart(self, ctx:MATParser.StartContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#defs.
    def enterDefs(self, ctx:MATParser.DefsContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

    # Exit a parse tree produced by MATParser#defs.
    def exitDefs(self, ctx:MATParser.DefsContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#defpinmap.
    def enterDefpinmaps(self, ctx:MATParser.DefpinmapsContext):
        for i in range(2,len(ctx.children),2):
            pinmaps_groups.append(ctx.children[i].children[0].symbol.text)
            pinmaps[ctx.children[i].children[0].symbol.text] = ctx.children[i].children[2].symbol.text #only for .pinmap

    # Exit a parse tree produced by MATParser#defpinmap.
    def exitDefpinmaps(self, ctx:MATParser.DefpinmapsContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#defpingroups.
    def enterDefpingroups(self, ctx:MATParser.DefpingroupsContext):
        for i in range(2,len(ctx.children),2):
            pinmaps_groups.append(ctx.children[i].children[0].symbol.text)
            tmp = []
            for pos in range(2,len(ctx.children[i].children),2):
                tmp.append(ctx.children[i].children[pos].symbol.text)
            pingroups[ctx.children[i].children[0].symbol.text] = tmp

    # Exit a parse tree produced by MATParser#defpingroups.
    def exitDefpingroups(self, ctx:MATParser.DefpingroupsContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

    # Enter a parse tree produced by MATParser#deftimeset.
    def enterDeftimeset(self, ctx:MATParser.DeftimesetContext):
        for i in range(2,len(ctx.children),2):
            timesets[ctx.children[i].children[0].symbol.text] = ctx.children[i].children[2].symbol.text + '.'+ ctx.children[i].children[3].symbol.text

    # Exit a parse tree produced by MATParser#deftimeset.
    def exitDeftimeset(self, ctx:MATParser.DeftimesetContext):
        pass

    def enterDefvoltagelevels(self, ctx:MATParser.DefvoltagelevelsContext):
        for i in range(2,len(ctx.children),2):
            voltagelevels[ctx.children[i].children[0].symbol.text] = {}
            for j in range(2,len(ctx.children[i].children),4):
                voltagelevels[ctx.children[i].children[0].symbol.text][ctx.children[i].children[j].symbol.text] = ctx.children[i].children[j + 2].symbol.text

    # Exit a parse tree produced by MATParser#defvoltagelevels.
    def exitDefvoltagelevels(self, ctx:MATParser.DefvoltagelevelsContext):
        pass

    # Enter a parse tree produced by MATParser#deffunc.
    def enterDeffunc(self, ctx:MATParser.DeffuncContext):
        vector_table.append(f'\n//////////////define function {ctx.children[1].symbol.text }///////////////')
        vector = [f'   -    '] #timeset
        for i in pinmaps_groups:
            vector.append('-    ')
        vector_table.append(f'{ctx.children[1].symbol.text}: ' + ''.join(vector) + ';')

    # Exit a parse tree produced by MATParser#deffunc.
    def exitDeffunc(self, ctx:MATParser.DeffuncContext):
        vector = [f'   {current_tset}    '] #timeset
        for i in pinmaps_groups:
            vector.append('-    ')
        vector_table.append(f'return' + ''.join(vector) + ';')


    # Enter a parse tree produced by MATParser#labeled_statement.
    def enterLabeled_statement(self, ctx:MATParser.Labeled_statementContext):
        if len(ctx.children) > 1:
            vector_table.append(ctx.children[0].symbol.text + ':')

    # Exit a parse tree produced by MATParser#labeled_statement.
    def exitLabeled_statement(self, ctx:MATParser.Labeled_statementContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#stmt.
    def enterStmt(self, ctx:MATParser.StmtContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

    # Exit a parse tree produced by MATParser#stmt.
    def exitStmt(self, ctx:MATParser.StmtContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

    def enterStmttimeset(self, ctx:MATParser.StmttimesetContext):
        global current_tset
        current_tset = ctx.children[1].symbol.text

    # Exit a parse tree produced by MATParser#stmttimeset.
    def exitStmttimeset(self, ctx:MATParser.StmttimesetContext):
        pass

    # Enter a parse tree produced by MATParser#stmtset.
    def enterStmtset(self, ctx:MATParser.StmtsetContext):
        vector = []
            
        vector.append(f'   {current_tset} ') #timeset
        for i in pinmaps_groups:
            vector.append('-    ')

        for i in range(1,len(ctx.children),2):
            for count, value in enumerate(pinmaps_groups):
                if ctx.children[i].children[0].symbol.text == pinmaps_groups[count]:
                    vector[count+1] = ctx.children[i].children[2].symbol.text + '    '

        if isinstance(ctx.parentCtx , MATParser.StmtrepeatContext):
            vector.insert(0,f'repeat({ctx.parentCtx.children[1].symbol.text}) ') #timeset
        vector_table.append(''.join(vector) + ';')

    # Exit a parse tree produced by MATParser#stmtset.
    def exitStmtset(self, ctx:MATParser.StmtsetContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#stmtread.
    def enterStmtread(self, ctx:MATParser.StmtreadContext):
        vector = []
        if isinstance(ctx.parentCtx , MATParser.StmtrepeatContext):
            vector.append(f'repeat({ctx.parentCtx.children[1].symbol.text}) ') #timeset
        
        vector.append(f'   {current_tset} ') #timeset
        for i in pinmaps_groups:
            vector.append('-    ')

        for i in range(1,len(ctx.children),2):
            for count, value in enumerate(pinmaps_groups):
                if ctx.children[i].children[0].symbol.text == pinmaps_groups[count]:
                    vector[count+2] = 'V    '

        vector_table.append(''.join(vector) + ';')

    # Exit a parse tree produced by MATParser#stmtread.
    def exitStmtread(self, ctx:MATParser.StmtreadContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#stmtif.
    def enterStmtif(self, ctx:MATParser.StmtifContext):
        vector_table.append(f'\n//define if statement //')
        vector = []  
        vector.append(f'match {current_tset} ') #timeset
        for i in pinmaps_groups:
            vector.append('-    ')

        for i in range(1,len(ctx.children),2):
            if isinstance(ctx.children[i] , MATParser.SetexpContext):
                for count, value in enumerate(pinmaps_groups):
                    if ctx.children[i].children[0].symbol.text == pinmaps_groups[count]:
                        if(ctx.children[i].children[2].symbol.text == '0'):
                            vector[count+1] = '  L    '
                        else:
                            vector[count+1] = '  H    '

        vector_table.append(''.join(vector) + ';')
        
        vector = []  
        vector.append(f'   {current_tset} ') #timeset
        for i in pinmaps_groups:
            vector.append('-    ')
        vector_table.append('repeat(79) ' + ''.join(vector) + ';')

        global if__end__label_counter
        if isinstance(ctx.children[-1] , MATParser.StmtelseContext): #if there is 'else' statement, jump to there. if not, jump to the end
          vector_table.append(f'jump_if(!matched, __else__label{if__end__label_counter})' + ''.join(vector) + ';')  
        else:
          vector_table.append(f'jump_if(!matched, __end__label{if__end__label_counter})' + ''.join(vector) + ';')  

        if__end__label_stack.append(if__end__label_counter)
        if__end__label_counter = if__end__label_counter + 1 

    # Exit a parse tree produced by MATParser#stmtif.
    def exitStmtif(self, ctx:MATParser.StmtifContext):
        vector = []  
        vector.append(f'   {current_tset} ') #timeset
        for i in pinmaps_groups:
            vector.append('-    ')
        vector_table.append(f'__end__label{if__end__label_stack.pop()}:' + ''.join(vector) + ';\n')

    # Enter a parse tree produced by MATParser#stmtelse.
    def enterStmtelse(self, ctx:MATParser.StmtelseContext):
        vector_table.append(f'//else statement in if statement//')
        vector = []  
        vector.append(f'   {current_tset} ') #timeset
        for i in pinmaps_groups:
            vector.append('-    ')
        vector_table.append(f'jump(__end__label{if__end__label_stack[-1]})' + ''.join(vector) + ';') 
        vector_table.append(f'__else__label{if__end__label_stack[-1]}:' + ''.join(vector) + ';\n') 

    # Exit a parse tree produced by MATParser#stmtelse.
    def exitStmtelse(self, ctx:MATParser.StmtelseContext):
        pass

    # Enter a parse tree produced by MATParser#stmtwhile.
    def enterStmtwhile(self, ctx:MATParser.StmtwhileContext):
        vector_table.append(f'\n//define while statement //')
        vector = []  
        
        global if__end__label_counter
        vector.append(f'__while__label{if__end__label_counter}:match {current_tset} ') #timeset   

        for i in pinmaps_groups:
            vector.append('-    ')

        for i in range(1,len(ctx.children),2):
            if isinstance(ctx.children[i] , MATParser.SetexpContext):
                for count, value in enumerate(pinmaps_groups):
                    if ctx.children[i].children[0].symbol.text == pinmaps_groups[count]:
                        if(ctx.children[i].children[2].symbol.text == '0'):
                            vector[count+1] = '  L    '
                        else:
                            vector[count+1] = '  H    '

        vector_table.append(''.join(vector) + ';')
        
        vector = []  
        vector.append(f'   {current_tset} ') #timeset
        for i in pinmaps_groups:
            vector.append('-    ')
        vector_table.append('repeat(79) ' + ''.join(vector) + ';')
        vector_table.append(f'jump_if(!matched, __end__label{if__end__label_counter})' + ''.join(vector) + ';') 
        if__end__label_stack.append(if__end__label_counter)
        if__end__label_counter = if__end__label_counter + 1 

    # Exit a parse tree produced by MATParser#stmtwhile.
    def exitStmtwhile(self, ctx:MATParser.StmtwhileContext):
        vector = []  
        vector.append(f'   {current_tset} ') #timeset
        for i in pinmaps_groups:
            vector.append('-    ')
        vector_table.append(f'jump(__while__label{if__end__label_stack[-1]})' + ''.join(vector)+ ';')
        vector_table.append(f'__end__label{if__end__label_stack.pop()}:' + ''.join(vector) + ';\n')

    # Enter a parse tree produced by MATParser#stmtrepeat.
    def enterStmtrepeat(self, ctx:MATParser.StmtrepeatContext):
        vector_table.append(f'\n//define repeat statement //')
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

    # Exit a parse tree produced by MATParser#stmtrepeat.
    def exitStmtrepeat(self, ctx:MATParser.StmtrepeatContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

     # Enter a parse tree produced by MATParser#stmtloop.
    def enterStmtloop(self, ctx:MATParser.StmtloopContext):
        vector_table.append(f'\n//define loop statement //')
        vector = []  
        vector.append(f'   {current_tset} ') #timeset
        for i in pinmaps_groups:
            vector.append('-    ')
        vector_table.append(f'\nset_loop({ctx.children[1].symbol.text}) ' + ''.join(vector) + ';')

        global if__end__label_counter
        vector_table.append(f'__end__label{if__end__label_counter}:' + ''.join(vector) + ';')  
        if__end__label_stack.append(if__end__label_counter)
        if__end__label_counter = if__end__label_counter + 1 

    # Exit a parse tree produced by MATParser#stmtloop.
    def exitStmtloop(self, ctx:MATParser.StmtloopContext):
        vector = []  
        vector.append(f'   {current_tset} ') #timeset
        for i in pinmaps_groups:
            vector.append('-    ')
        vector_table.append(f'end_loop(__end__label{if__end__label_stack.pop()})' + ''.join(vector) + ';\n')

    # Enter a parse tree produced by MATParser#stmtgoto.
    def enterStmtgoto(self, ctx:MATParser.StmtgotoContext):
        vector = [f'   {current_tset}    '] #timeset
        for i in pinmaps_groups:
            vector.append('-    ')
        vector_table.append(f'jump({ctx.children[1].symbol.text})' + ''.join(vector) + ';')

    # Exit a parse tree produced by MATParser#stmtgoto.
    def exitStmtgoto(self, ctx:MATParser.StmtgotoContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#stmtcall.
    def enterStmtcall(self, ctx:MATParser.StmtcallContext):
        vector = [f'{current_tset}    '] #timeset
        for i in pinmaps_groups:
            vector.append('-    ')
        vector_table.append(f''.join(vector) + ';')
        vector_table.append(f'call({ctx.children[0].symbol.text})' + ''.join(vector) + ';')

    # Exit a parse tree produced by MATParser#stmtcall.
    def exitStmtcall(self, ctx:MATParser.StmtcallContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#stmtinc.
    def enterStmtinc(self, ctx:MATParser.StmtincContext):
        vector = [f'   {current_tset}    '] #timeset
        for i in pinmaps_groups:
            vector.append('-    ')

        for number in range( int(ctx.children[3].symbol.text,2), int(ctx.children[5].symbol.text,2) + 1):
                for count, value in enumerate(pinmaps_groups):
                    if ctx.children[1].symbol.text == pinmaps_groups[count]:
                        str_format = '{:0>' + str(len(ctx.children[5].symbol.text)) + 'b}'
                        vector[count+1] = str_format.format(number) + '    '
                        vector_table.append(''.join(vector) + ';')
                        continue
        
        
    # Exit a parse tree produced by MATParser#stmtinc.
    def exitStmtinc(self, ctx:MATParser.StmtincContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#stmtdec.
    def enterStmtdec(self, ctx:MATParser.StmtdecContext):
        vector = [f'   {current_tset}    '] #timeset
        for i in pinmaps_groups:
            vector.append('-    ')

        for number in range( int(ctx.children[3].symbol.text,2), int(ctx.children[5].symbol.text,2) - 1, -1):
                for count, value in enumerate(pinmaps_groups):
                    if ctx.children[1].symbol.text == pinmaps_groups[count]:
                        str_format = '{:0>' + str(len(ctx.children[5].symbol.text)) + 'b}'
                        vector[count+1] = str_format.format(number) + '    '
                        vector_table.append(''.join(vector) + ';')
                        continue
        
    # Exit a parse tree produced by MATParser#stmtdec.
    def exitStmtdec(self, ctx:MATParser.StmtdecContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#map.
    def enterMap(self, ctx:MATParser.MapContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

    # Exit a parse tree produced by MATParser#map.
    def exitMap(self, ctx:MATParser.MapContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#pingroup.
    def enterPingroup(self, ctx:MATParser.PingroupContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

    # Exit a parse tree produced by MATParser#pingroup.
    def exitPingroup(self, ctx:MATParser.PingroupContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#setexp.
    def enterSetexp(self, ctx:MATParser.SetexpContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

    # Exit a parse tree produced by MATParser#setexp.
    def exitSetexp(self, ctx:MATParser.SetexpContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#readexp.
    def enterReadexp(self, ctx:MATParser.ReadexpContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

    # Exit a parse tree produced by MATParser#readexp.
    def exitReadexp(self, ctx:MATParser.ReadexpContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

    # Exit a parse tree produced by MATParser#readexp.
    def exitReadexp(self, ctx:MATParser.ReadexpContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


        
def main(argv):
    input_stream = FileStream('mattest.mat')
    lexer = MATLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = MATParser(stream)
    tree = parser.start()
    
    print(tree.toStringTree(recog=parser))
    listen = listener()
    walker = ParseTreeWalker()
    walker.walk(listen, tree)

 
if __name__ == '__main__':
    main(sys.argv)
    ####everything is sopposed to be done from here!

    ###########################################################      pinmap   ################################
    #generate TMP.pinmap to rename the pins 
    tree = dom.parse('MAT_CONFIG_NI_STS_DIGITAL_SKELETON.pinmap') #load
    
    pin_children = tree.getElementsByTagName("DUTPin")
    connection_children = tree.getElementsByTagName("Connection")
    pingroup_children = tree.getElementsByTagName("PinGroups")

    for name,pin in pinmaps.items():
        found_flag = False
        for each in pin_children:
            if each.getAttribute('name') == pin:
                each.setAttribute('name',name) #change pin name
                found_flag = True
        
        if found_flag == False:
            raise Exception(f'Could not find {pin}, please check the pin_name_map.')
    
        for each in connection_children:
            if each.getAttribute('pin') == pin:
                each.setAttribute('pin',name) #change connection to the new name

    for name,pins in pingroups.items():
        
        pingroup_children[0].appendChild(tree.createTextNode("\n\t\t"))
        
        group_node = tree.createElement('PinGroup') 
        group_node.setAttribute("name",f"{name}")
        pingroup_children[0].appendChild(group_node)#only 1 pingroups element
        
        for pin in pins:     
            pin_node = tree.createElement(f'PinReference pin="{pin}"')
            group_node.appendChild(tree.createTextNode("\n\t\t\t"))
            group_node.appendChild(pin_node)
        group_node.appendChild(tree.createTextNode("\n\t\t\t"))    
    pingroup_children[0].appendChild(tree.createTextNode("\n\t\t"))

        

    with open('__TMP.pinmap', 'w') as fp:
        tree.writexml(fp)


    ###########################################################      digipatsrc -> digipat ################################
    jumpmain_start = 'call(main)    -    '
    halt_end = 'halt    -    '
    for i in pinmaps_groups:
            halt_end = halt_end + '-    '
            jumpmain_start = jumpmain_start + '-    '
    vector_table.insert(0,jumpmain_start + ';') 
    vector_table.insert(1,halt_end + ';')
    vector_table.append('')
    with open('./__TMP.digipatsrc', 'w') as fp:

        vector_str = '\n'.join(vector_table)
        vector_seq = [f'//Auto-generated by Translator.(In {__file__})\n',f'file_format_version 1.1;\n', f"export mattest;\n", f"timeset {','.join(timesets.keys())};\n",'\n',f"pattern mattest({','.join(pinmaps_groups)})"'\n''{''\n',vector_str,'}']
        fp.writelines(vector_seq)

    #compile the new generated .digipatsrc with the new pinmap
    with os.popen('C:\\"Program Files"\\"National Instruments"\\"Digital Pattern Compiler"\\DigitalPatternCompiler.exe -pinmap __TMP.pinmap __TMP.digipatsrc') as p:
        res = p.read()
        if 'Error' in res:
            raise Exception(res)

    ######################################### EXECUTE DIGIPAT #############################################
    with nidigital.Session('HSD_6571_C1_S03,HSD_6571_C1_S04,HSD_6571_C1_S05') as session:


        session.load_pin_map('__TMP.pinmap')

        ################################ Configure voltage levels and terminal voltage through driver API ################################
        for channel, voltlevels in voltagelevels.items():

            session.channels[channel].configure_voltage_levels(**voltlevels)          
        
            termination_mode = 'High_Z'
            if termination_mode == 'High_Z':
                session.channels[channel].termination_mode = nidigital.TerminationMode.HIGH_Z
            elif termination_mode == 'Active_Load':
                session.channels[channel].termination_mode = nidigital.TerminationMode.ACTIVE_LOAD
                session.channels[channel].configure_active_load_levels(0.002, 0.002, 0)
            else:
                session.channels[channel].termination_mode = nidigital.TerminationMode.VTERM
            
      
            ################################ Configure time set through driver API ################################
            for name, period in timesets.items():
                session.create_time_set(name)  # Must match time set name in pattern file
                session.configure_time_set_period(name, float(period))
                session.channels[','.join(pinmaps_groups)].configure_time_set_drive_edges(name, nidigital.DriveFormat.NR,
                                                                        0, 0,
                                                                        period*3/4, float(period))
                session.channels[','.join(pinmaps_groups)].configure_time_set_compare_edges_strobe(name, float(period)/2)


            # Loading the pattern file (.digipat) auto-generated 
            session.load_pattern('__TMP.digipat')

            
            print('Start bursting pattern')
            

            # If start trigger is configured, waiting for the trigger to start bursting and then blocks until the pattern is done bursting
            # Else just start bursting and block until the pattern is done bursting
            session.burst_pattern(start_label='new_pattern')

            # Disconnect all channels using programmable onboard switching
            session.selected_function = SelectedFunction.DISCONNECT
            print('Done bursting pattern')