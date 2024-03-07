package ast;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import parser.BlockTexLexer;
import parser.BlockTexParser;
import parser.ParseTreeToAST;

import java.util.ArrayList;
import java.util.List;

public class AstTest {

    @Nested
    @DisplayName("Tests for Fraction")
    class FractionSuite {
        public static String oneFractionInput() {
            return "Create Fraction myFraction\n" +
                    "Set myFraction.numerator <- 1\n" +
                    "Set myFraction.denominator <- 2\n" +
                    "Render myFraction\n";
        }

        public static Node oneFractionOutput() {

            // Create FractionObject
            Name fractionName = new Name("myFraction");
            Expression numerator = new Number(1);
            Expression denominator = new Number(2);
            FractionObject fractionObject = new FractionObject(fractionName, numerator, denominator);

            // Create list of equation objects
            List<EquationObject> equationObjects = new ArrayList<EquationObject>();
            equationObjects.add(fractionObject);

            // Create list of statements
            List<Statement> statementList = new ArrayList<>();
            statementList.add((Statement) equationObjects);

            // Create list of render objects
            List<Name> renderObjects = new ArrayList<>();
            renderObjects.add(fractionName);

            // Return program
            return new Program(statementList, renderObjects);
        }

        @Test
        public void oneFractionTest() {
            // Tokenization (Code -> Tokens)
            BlockTexLexer lexer = new BlockTexLexer(CharStreams.fromString(oneFractionInput()));
            lexer.reset();
            TokenStream tokens = new CommonTokenStream(lexer);
            System.out.println("Done tokenizing");

            // Parse (Tokens -> Antlr Parse Tree)
            BlockTexParser parseTree = new BlockTexParser(tokens);
            BlockTexParser.ProgramContext programContext = parseTree.program();
            System.out.println("Done parsing");

            // AST (Parse Tree -> AST)
            ParseTreeToAST visitor = new ParseTreeToAST();
            Program AST = (Program) visitor.visitProgram(programContext);
            System.out.println("Done AST Conversion");

//        assertEquals(AST, oneFractionOutput());
        }
    }

}
