package parser;

import ast.Program;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.junit.jupiter.api.Test;
import visitor.Evaluator;

import java.io.IOException;
public class ParserTest {

    public static final String INPUT_FOLDER = "Inputs/";
    public static final String INPUT_FOLDER_COPY = "InputCopy/";

    @Test
    public void printAllTokens() throws IOException {
        // using the InputCopy folder
        BlockTexLexer lexer = new BlockTexLexer(CharStreams.fromFileName(INPUT_FOLDER_COPY + "1_simple_conditional.tvar"));
        lexer.reset();

        for (Token t : lexer.getAllTokens()) {
            System.out.println(t);
        }

    }

    @Test
    public void PlayGround() throws IOException {

        BlockTexLexer lexer = new BlockTexLexer(CharStreams.fromFileName(INPUT_FOLDER + "simple_Latex.tvar"));
        lexer.reset();

//        for (Token t : lexer.getAllTokens()) {
//            System.out.println(t);
//        }

        TokenStream tokens = new CommonTokenStream(lexer);
        BlockTexParser parser = new BlockTexParser(tokens);
        BlockTexParser.ProgramContext programContext = parser.program();

        ParseTreeToAST astVisitor = new ParseTreeToAST();

        Program astProgram = (Program) astVisitor.visitProgram(programContext);

        Evaluator e = new Evaluator();
        StringBuilder s = new StringBuilder();
        astProgram.accept(e, s);

        if(s.isEmpty()) {
            System.out.println("Evaluation completed successfully");
        } else {
            System.out.println("Error during runtime: \n" + s);
        }

        System.out.println("Final memory:" + e.getMemory());
        System.out.println("Final Results:" + e.getResult());

    }

    // Credit: ChatGPT
    // Loop through INPUT folder and run lexer and parser
    @Test
    public void RunAllTests() throws IOException {

//        // Replace this path with the path to the directory containing your text files
//        String input_folder = INPUT_FOLDER_COPY;
//        Path dirPath = Paths.get(input_folder);
//
//        // Using try-with-resources to ensure the DirectoryStream is closed after use
//        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dirPath, "*.tvar")) {
//            for (Path filePath : stream) {
//                // Process each text file here
//                System.out.println("Processing file: " + filePath.getFileName());
//
//                BlockTexLexer lexer = new BlockTexLexer(CharStreams.fromFileName(input_folder + filePath.getFileName()));
//                lexer.reset();
//
////                for (Token t : lexer.getAllTokens()) {
////                    System.out.println(t);
////                }
//
//                TokenStream tokens = new CommonTokenStream(lexer);
//                BlockTexParser parser = new BlockTexParser(tokens);
//                BlockTexParser.ProgramContext programContext = parser.program();
//                System.out.println("Done Parsing for: " + filePath.getFileName());
//
//                ParseTreeToAST astVisitor = new ParseTreeToAST();
//
//                Program astProgram = (Program) astVisitor.visitProgram(programContext);
//
//                Evaluator e = new Evaluator();
//                StringBuilder s = new StringBuilder();
//                astProgram.accept(e, s);
//
//                if(s.isEmpty()) {
//                    System.out.println("Evaluation completed successfully");
//                } else {
//                    System.out.println("Error during runtime: \n" + s);
//                }
//
//                System.out.println("Final memory:" + e.getMemory());
//                System.out.println("Final Results:" + e.getResult());
//
//            }
//        } catch (IOException e) {
//            System.out.println("Error!");
//        }

    }






}