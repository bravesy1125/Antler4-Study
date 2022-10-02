import sys
from antlr4 import *
from mat_py.MATLexer import MATLexer
from mat_py.MATParser import MATParser
from mat_py.MATListener import MATListener

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
    def enterDefpinmap(self, ctx:MATParser.DefpinmapContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

    # Exit a parse tree produced by MATParser#defpinmap.
    def exitDefpinmap(self, ctx:MATParser.DefpinmapContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#defpingroups.
    def enterDefpingroups(self, ctx:MATParser.DefpingroupsContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

    # Exit a parse tree produced by MATParser#defpingroups.
    def exitDefpingroups(self, ctx:MATParser.DefpingroupsContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#deffunc.
    def enterDeffunc(self, ctx:MATParser.DeffuncContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

    # Exit a parse tree produced by MATParser#deffunc.
    def exitDeffunc(self, ctx:MATParser.DeffuncContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#labeled_statement.
    def enterLabeled_statement(self, ctx:MATParser.Labeled_statementContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

    # Exit a parse tree produced by MATParser#labeled_statement.
    def exitLabeled_statement(self, ctx:MATParser.Labeled_statementContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#stmt.
    def enterStmt(self, ctx:MATParser.StmtContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

    # Exit a parse tree produced by MATParser#stmt.
    def exitStmt(self, ctx:MATParser.StmtContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#stmtset.
    def enterStmtset(self, ctx:MATParser.StmtsetContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

    # Exit a parse tree produced by MATParser#stmtset.
    def exitStmtset(self, ctx:MATParser.StmtsetContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#stmtread.
    def enterStmtread(self, ctx:MATParser.StmtreadContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

    # Exit a parse tree produced by MATParser#stmtread.
    def exitStmtread(self, ctx:MATParser.StmtreadContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#stmtif.
    def enterStmtif(self, ctx:MATParser.StmtifContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

    # Exit a parse tree produced by MATParser#stmtif.
    def exitStmtif(self, ctx:MATParser.StmtifContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#stmtloop.
    def enterStmtloop(self, ctx:MATParser.StmtloopContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

    # Exit a parse tree produced by MATParser#stmtloop.
    def exitStmtloop(self, ctx:MATParser.StmtloopContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#stmtgoto.
    def enterStmtgoto(self, ctx:MATParser.StmtgotoContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

    # Exit a parse tree produced by MATParser#stmtgoto.
    def exitStmtgoto(self, ctx:MATParser.StmtgotoContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#stmtcall.
    def enterStmtcall(self, ctx:MATParser.StmtcallContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

    # Exit a parse tree produced by MATParser#stmtcall.
    def exitStmtcall(self, ctx:MATParser.StmtcallContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#stmtinc.
    def enterStmtinc(self, ctx:MATParser.StmtincContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

    # Exit a parse tree produced by MATParser#stmtinc.
    def exitStmtinc(self, ctx:MATParser.StmtincContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")


    # Enter a parse tree produced by MATParser#stmtdec.
    def enterStmtdec(self, ctx:MATParser.StmtdecContext):
        print(f"OK,Now {sys._getframe().f_code.co_name} at line:{sys._getframe().f_lineno}")

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
    input_stream = FileStream(argv[1])
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