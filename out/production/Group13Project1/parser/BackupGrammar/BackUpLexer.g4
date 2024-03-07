lexer grammar BlockTexLexer;

// Keywords that start statements
CREATE       : 'Create' WS* -> mode(BLOCK_MODE);
SET          : 'Set' WS* -> mode(IDENTIFIER_MODE);
LOOP_START   : 'Loop' WS* -> mode(IDENTIFER_MODE);
RENDER_START : 'Render' WS* -> mode(RENDER_MODE);

// Misc.
THIS         : 'This' WS* -> mode(DEFAULT_MODE);
ASSIGN       : '<-' WS* -> mode(ASSIGN_MODE);
DOT          : '.' -> mode(PROPERTY_MODE);
COMMA        : ',';
LOOP_END     : 'End' WS*;
MULTIPLY     : '*' WS* -> mode(ASSIGN_MODE);
SUBTRACT     : '-' WS* -> mode(ASSIGN_MODE);
DIVIDE       : '/' WS* -> mode(ASSIGN_MODE);
ADD          : '+' WS* -> mode(ASSIGN_MODE);
WS           : [ \r\n\t]+ -> channel(HIDDEN); // Consolidated whitespace handling

//mode LOOP_MODE;
//LOOP_IDENTIFIER : [a-zA-Z_][a-zA-Z_]* WS* -> mode(LOOP_MODE);

mode ASSIGN_MODE;
NUM           : [0-9]+ WS* -> mode(DEFAULT_MODE);
A_IDENTIFIER  : [a-zA-Z_][a-zA-Z_]* WS* -> mode(DEFAULT_MODE);
ROW           : 'Row' WS* -> mode(DEFAULT_MODE);
COL           : 'Col' WS* -> mode(DEFAULT_MODE);
COORDINATE_START : '(' WS* -> mode(COORDINATE_MODE);

mode RENDER_MODE;
RENDER_END    : [\n] -> mode(DEFAULT_MODE);
R_IDENTIFIER  : [a-zA-Z_][a-zA-Z_]* -> mode(RENDER_MODE);

mode BLOCK_MODE;
LATEX         : 'Latex' WS* -> mode(IDENTIFIER_MODE);
FRACTION      : 'Fraction' WS* -> mode(IDENTIFIER_MODE);
INTEGRAL      : 'Integral' WS* -> mode(IDENTIFIER_MODE);
SUMMATION     : 'Summation' WS* -> mode(IDENTIFIER_MODE);
DERIVATIVE    : 'Derivative' WS* -> mode(IDENTIFIER_MODE);
MATRIX        : 'Matrix' WS* -> mode(IDENTIFIER_MODE);

mode PROPERTY_MODE;
NUMERATOR     : 'numerator' -> mode(DEFAULT_MODE);
DENOMINATOR   : 'denominator' -> mode(DEFAULT_MODE);
START         : 'start' -> mode(DEFAULT_MODE);
END           : 'end' -> mode(DEFAULT_MODE);
EQUATION      : 'equation' -> mode(DEFAULT_MODE);
METHOD        : 'method' -> mode(DEFAULT_MODE);
TYPE          : 'type' -> mode(DEFAULT_MODE);
ORDER         : 'order' -> mode(DEFAULT_MODE);
TARGETVAR     : 'targetVar' -> mode(DEFAULT_MODE);
MATRIX_SHAPE  : 'shape' -> mode(DEFAULT_MODE);
MATRIX_ELEMENT: 'element' -> mode(DEFAULT_MODE);

mode IDENTIFIER_MODE;
IDENTIFIER    : [a-zA-Z_][a-zA-Z_]* WS*-> mode(DEFAULT_MODE);

mode COORDINATE_MODE;
COORDINATE_END: WS* ')' -> mode(DEFAULT_MODE);
COORD_NUM     : [0-9]+ -> mode(COORDINATE_MODE);
SEP           : WS* COMMA WS* -> mode(COORDINATE_MODE);
