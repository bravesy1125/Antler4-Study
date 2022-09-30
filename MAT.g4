// Define a grammar called Hello
grammar MAT;

complete : defs+ ;

    defs : defpinmap | defpingroups | deffunc | stmt;
    defpinmap : 'pinmap{' map (',' map)*   '}' ;
    defpingroups : 'pingroups{'  pingroup (';' pingroup)*  '}' ;
    deffunc : 'def'PINNAME'()''{'(stmt)*'}' ;

        stmt : stmtset | stmtread | stmtif | stmtloop | stmtgoto | stmtcall | stmtinc ;
        
        stmtset : 'set' setexp (',' setexp)*  ';' ;
        stmtread : 'read' readexp (',' readexp)*  ';' ;
        stmtif : 'if' setexp (',' setexp)*  '{'stmt '}' ;
        stmtloop : 'loop' NUMBER '{'(stmt)*'}' ;
        stmtgoto : 'goto' PINNAME ';' ;
        stmtcall :  PINNAME '()'';' ;
        stmtinc :  'increment' '(' NUMBER ',' NUMBER')'';' ;

 
            map : PINNAME ':' CHANNEL ;
            pingroup : PINNAME ':' CHANNEL (',' CHANNEL)* ;
            setexp : PINNAME '=' NUMBER ;
            readexp : PINNAME ;

            CHANNEL : 'DIO0' | 'DIO1' | 'DIO2' ;
            PINNAME : [a-zA-Z]+ [a-zA-Z0-9_]* ; // Define token INT as one or more digits
            NUMBER : [0-9]+ ;

WS : [ \t\r\n]+ -> skip ; // Define whitespace rule, toss it out
