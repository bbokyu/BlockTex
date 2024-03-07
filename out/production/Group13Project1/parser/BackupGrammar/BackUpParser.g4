//parser grammar BlockTexParser;
//options { tokenVocab=BlockTexLexer; }
//
//program :  equationObjects+ RENDER_START renderObjects* RENDER_END EOF;
//
//renderObjects : name;
//
////TODO ADD LATEX EQUATION OBJECT
//equationObjects : fractionObject | summationObject | derivativeObject | integralObject | matrixObject ;
//
//matrixObject : matrixName shape_call loop* element_call*;
//matrixName : CREATE MATRIX name;
//
//loop : LOOP_START name
//
//
//shape_call : set_property MATRIX_SHAPE ASSIGN coordinate;
//element_call : set_property MATRIX_ELEMENT ASSIGN coordinate ASSIGN expression;
//coordinate : COORDINATE_START COORD_NUM SEP COORD_NUM COORDINATE_END;
//
//// Fraction
//fractionObject : fractionName numerator_call denominator_call;
//fractionName : CREATE FRACTION name;
//numerator_call: SET IDENTIFIER DOT NUMERATOR ASSIGN expression;
//denominator_call: SET IDENTIFIER DOT DENOMINATOR ASSIGN expression;
//
//// Derivative
//derivativeObject : derivativeName type_call order_call targetVar_call;
//derivativeName: CREATE DERIVATIVE name;
//type_call: set_property TYPE ASSIGN expression;
//order_call: set_property ORDER ASSIGN expression;
//targetVar_call: set_property TARGETVAR ASSIGN expression;
//
////type: TYPE ASSIGN expression;
////order: ORDER ASSIGN expression;
////targetVar: TARGETVAR ASSIGN expression;
//
//// Summation + Integral
//summationObject : summationName start_call end_call equation_call;
//summationName: CREATE SUMMATION name;
//integralObject : integralName start_call end_call equation_call;
//integralName: CREATE INTEGRAL name;
//
//// Summation + Integral Properties
//start_call: set_property START ASSIGN expression;
//end_call: set_property END ASSIGN expression;
//equation_call: set_property EQUATION ASSIGN expression;
//
////latex: LATEX_CONTENT;
//
//set_property: SET IDENTIFIER DOT;
//name : IDENTIFIER | R_IDENTIFIER | A_IDENTIFIER;
//number : NUM;
//expression: name | number;
//
//
//
//// Fraction properties
////numerator: NUMERATOR ASSIGN expression;
////denominator: DENOMINATOR ASSIGN expression;
//
//// IDK what these are...
////method: METHOD ASSIGN expression;

parser grammar BlockTexParser;
options { tokenVocab=BlockTexLexer; }

// The entry point that captures the overall structure of the input.
program : equationObjects+ RENDER_START renderObjects* RENDER_END EOF;

// Defines objects that can be rendered.
renderObjects : name;

// Defines the main objects used in equations.
equationObjects : fractionObject
                | summationObject
                | derivativeObject
                | integralObject
                | matrixObject
                // TODO: Consider adding LaTeX equation object here once implemented.
                ;

// Matrix object definition with potential loops and element assignments.
matrixObject : matrixName shape_call loop* element_call*;
matrixName : CREATE MATRIX name;

// Loop structure within a matrix definition.
loop : LOOP_START name loop_body LOOP_END;
loop_body : (set_property | loop)*; // Example structure, adjust based on actual usage.

// Calls to set specific properties of objects.
shape_call : set_property MATRIX_SHAPE ASSIGN coordinate;
element_call : set_property MATRIX_ELEMENT ASSIGN coordinate ASSIGN expression;

// Coordinate definition used in various objects.
coordinate : COORDINATE_START COORD_NUM SEP COORD_NUM COORDINATE_END;

// Fraction object with numerator and denominator calls.
fractionObject : fractionName numerator_call denominator_call;
fractionName : CREATE FRACTION name;
numerator_call: set_property NUMERATOR ASSIGN expression;
denominator_call: set_property DENOMINATOR ASSIGN expression;

// Derivative object with type, order, and target variable.
derivativeObject : derivativeName type_call order_call targetVar_call;
derivativeName: CREATE DERIVATIVE name;
type_call: set_property TYPE ASSIGN expression;
order_call: set_property ORDER ASSIGN expression;
targetVar_call: set_property TARGETVAR ASSIGN expression;

// Summation and integral objects with start, end, and equation calls.
summationObject : summationName start_call end_call equation_call;
summationName: CREATE SUMMATION name;
integralObject : integralName start_call end_call equation_call;
integralName: CREATE INTEGRAL name;

// Shared property setting calls for summation and integral.
start_call: set_property START ASSIGN expression;
end_call: set_property END ASSIGN expression;
equation_call: set_property EQUATION ASSIGN expression;

// Basic structure for setting properties of various objects.
set_property: SET IDENTIFIER DOT;

// Unified rule for capturing identifiers and numbers.
name : IDENTIFIER | R_IDENTIFIER | A_IDENTIFIER;
number : NUM;
expression: name | number;
