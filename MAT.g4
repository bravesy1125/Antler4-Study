grammar MAT;

start: defs+;

defs:
	defpinmaps
	| defpingroups
	| deffunc
	| deftimeset
	| defvoltagelevels;
defpinmaps: 'pinmaps' '{' map (',' map)* '}';
defpingroups: 'pingroups' '{' pingroup (';' pingroup)* '}';
deftimeset: 'timeset' '{' timeset (';' timeset)* '}';
defvoltagelevels:
	'voltagelevels' '{' voltagelevel (';' voltagelevel)* '}';
deffunc: 'def' ID '()' '{' (labeled_statement)* '}';

labeled_statement: (ID ':')* stmt;
stmt:
	stmtset
	| stmtread
	| stmtif
	| stmtrepeat
	| stmtloop
	| stmtgoto
	| stmtcall
	| stmtinc
	| stmtdec
	| stmttimeset
	| stmtwhile;

stmttimeset: 'timeset' ID ';';
stmtset: 'set' setexp (',' setexp)* ';';
stmtread: 'read' readexp (',' readexp)* ';';
stmtinc: 'inc' ID ',' NUMBER ':' NUMBER ';';
stmtdec: 'dec' ID ',' NUMBER ':' NUMBER ';';
stmtgoto: 'goto' ID ';';
stmtcall: ID '()' ';';
stmtrepeat: 'repeat' NUMBER ':' (stmtset | stmtread);
stmtloop: 'loop' NUMBER '{' (labeled_statement)* '}';
stmtif:
	'if' setexp (',' setexp)* '{' (labeled_statement)* '}' (
		stmtelse
	)?;
stmtelse: 'else' '{' (labeled_statement)* '}';
stmtwhile:
	'while' setexp (',' setexp)* '{' (labeled_statement)* '}';

map: ID ':' CHANNEL;
pingroup: ID ':' CHANNEL (',' CHANNEL)*;
timeset: ID ':' FLOATNUMBER 's';
voltagelevel:
	ID ':' ID '=' FLOATNUMBER (',' ID '=' FLOATNUMBER)*;
setexp: ID '=' NUMBER;
readexp: ID;

CHANNEL: 'DIO' NUMBER;
ID:
	[a-zA-Z] [a-zA-Z0-9_]*; // Define token INT as one or more digits
NUMBER: [0-9]+;
FLOATNUMBER: [0-9]+ '.' [0-9]+;

WS: [ \t\r\n]+ -> skip; // Define whitespace rule, toss it out
LINE_COMMENT:
	'//' .*? '\r'? '\n' -> skip; // match"//" stuff '\n'
COMMENT: '/*' .*? '*/' -> skip; // match"/*" stuff "*/"