grammar MAT;

start: defs+;

defs: defpinmap | defpingroups | deffunc;
defpinmap: 'pinmap' '{' map (',' map)* '}';
defpingroups: 'pingroups' '{' pingroup (';' pingroup)* '}';
deffunc: 'def' ID '()' '{' (labeled_statement)* '}';

labeled_statement: (ID ':')* stmt;
stmt:
	stmtset
	| stmtread
	| stmtif
	| stmtloop
	| stmtgoto
	| stmtcall
	| stmtinc
	| stmtdec;

stmtset: 'set' setexp (',' setexp)* ';';
stmtread: 'read' readexp (',' readexp)* ';';
stmtif: 'if' setexp (',' setexp)* '{' (labeled_statement)* '}';
stmtloop: 'loop' NUMBER '{' (labeled_statement)* '}';
stmtgoto: 'goto' ID ';';
stmtcall: ID '()' ';';
stmtinc: 'inc' '(' ID ',' NUMBER ':' NUMBER ')' ';';
stmtdec: 'dec' '(' ID ',' NUMBER ':' NUMBER ')' ';';

map: ID ':' CHANNEL;
pingroup: ID ':' CHANNEL (',' CHANNEL)*;
setexp: ID '=' NUMBER;
readexp: ID;

CHANNEL:
	'DIO0'
	| 'DIO1'
	| 'DIO2'
	| 'DIO3'
	| 'DIO4'
	| 'DIO5'
	| 'DIO6'
	| 'DIO7'
	| 'DIO8'
	| 'DIO9'
	| 'DIO10'
	| 'DIO11'
	| 'DIO12'
	| 'DIO13'
	| 'DIO14'
	| 'DIO15'
	| 'DIO16'
	| 'DIO17'
	| 'DIO18'
	| 'DIO19'
	| 'DIO20'
	| 'DIO21'
	| 'DIO22'
	| 'DIO23'
	| 'DIO24'
	| 'DIO25'
	| 'DIO26'
	| 'DIO27'
	| 'DIO28'
	| 'DIO29'
	| 'DIO30'
	| 'DIO31'
	| 'DIO32'
	| 'DIO33'
	| 'DIO34'
	| 'DIO35'
	| 'DIO36'
	| 'DIO37'
	| 'DIO38'
	| 'DIO39'
	| 'DIO40'
	| 'DIO41'
	| 'DIO42'
	| 'DIO43'
	| 'DIO44'
	| 'DIO45'
	| 'DIO46'
	| 'DIO47'
	| 'DIO48'
	| 'DIO49'
	| 'DIO50'
	| 'DIO51'
	| 'DIO52'
	| 'DIO53'
	| 'DIO54'
	| 'DIO55'
	| 'DIO56'
	| 'DIO57'
	| 'DIO58'
	| 'DIO59'
	| 'DIO60'
	| 'DIO61'
	| 'DIO62'
	| 'DIO63'
	| 'DIO64'
	| 'DIO65'
	| 'DIO66'
	| 'DIO67'
	| 'DIO68'
	| 'DIO69'
	| 'DIO70'
	| 'DIO71'
	| 'DIO72'
	| 'DIO73'
	| 'DIO74'
	| 'DIO75'
	| 'DIO76'
	| 'DIO77'
	| 'DIO78'
	| 'DIO79'
	| 'DIO80'
	| 'DIO81'
	| 'DIO82'
	| 'DIO83'
	| 'DIO84'
	| 'DIO85'
	| 'DIO86'
	| 'DIO87'
	| 'DIO88'
	| 'DIO89'
	| 'DIO90'
	| 'DIO91'
	| 'DIO92'
	| 'DIO93'
	| 'DIO94'
	| 'DIO95';
ID:
	[a-zA-Z]+ [a-zA-Z0-9_]*; // Define token INT as one or more digits
NUMBER: [0-9]+;

WS: [ \t\r\n]+ -> skip; // Define whitespace rule, toss it out
LINE_COMMENT:
	'//' .*? '\r'? '\n' -> skip; // match"//" stuff '\n'
COMMENT: '/*' .*? '*/' -> skip; // match"/*" stuff "*/"