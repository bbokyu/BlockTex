package ui;

import ast.Program;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.json.JSONObject;
import parser.BlockTexLexer;
import parser.BlockTexParser;
import parser.ParseTreeToAST;
import visitor.Evaluator;
import org.json.JSONObject;

import java.io.IOException;

import static spark.Spark.*;

// Maven libraries
// JUnit
// com.sparkjava:spark-core:2.9.4

public class Main {

    public static final String INPUT_FOLDER = "Inputs/";
    public static void main(String[] args) throws IOException {
        // UI
        // Server Setup credit: https://rjlfinn.medium.com/creating-a-http-server-in-java-9b6af7f9b3cd
        // Setup credit 2: ChatGPT

        // a POST request is sent to http://localhost:4567/render
        port(4567); // Set the port number as per your requirement

        // Enable CORS
        options("/*", (request, response) -> {
            String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
            if (accessControlRequestHeaders != null) {
                response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
            }

            String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
            if (accessControlRequestMethod != null) {
                response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
            }

            return "OK";
        });

        before((request, response) -> response.header("Access-Control-Allow-Origin", "*"));

        // Handle the POST request for /render
        post("/render", "application/json", (request, response) -> {
            // Handle the POST request logic here
<<<<<<< HEAD

            // Credit: ChatGPT
            String requestBody = request.body(); // Get the request body
            JSONObject jsonObject = new JSONObject(requestBody);
            String latexText = jsonObject.get("text").toString();

=======
            String requestBody = request.body(); // Get the request body
            JSONObject jsonObject = new JSONObject(requestBody);
            String text = jsonObject.getString("text"); // Extract the "text" field
>>>>>>> 236185e9bab51042edf8d7e4006d7103bb72032e
            // Parse the text using ANTLR
            BlockTexLexer lexer = new BlockTexLexer(CharStreams.fromString(latexText));
            lexer.reset();
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
            return e.getResult();
        });
    }

                /*
            System.out.println("Received POST call");
            String requestBody = request.body(); // Read the request body
            System.out.println("Received request data: " + requestBody);

            // Tokenization (Code -> Tokens)
            BlockTexLexer lexer = new BlockTexLexer(CharStreams.fromString(requestBody));
            for (Token token : lexer.getAllTokens()) {
                System.out.println(token);
            }
            lexer.reset(); // Reset the lexer to start from the beginning
            TokenStream tokens = new CommonTokenStream(lexer);
            System.out.println("Done tokenizing");

            // Parse (Tokens -> Antlr Parse Tree)
            BlockTexParser parseTree = new BlockTexParser(tokens);
            BlockTexParser.ProgramContext programContext = parseTree.program();
            System.out.println("Done parsing");

            // AST (Parse Tree -> AST)
            ParseTreeToAST visitor = new ParseTreeToAST();
            Program AST = (Program) visitor.visitProgram(programContext);

            // Evaluation Stage..

            System.out.println("Done AST / Evaluation");

            // should return raw latex to UI to render through react-latex
            return "AST data received successfully"; // return raw latex
             */
}
