import java.util.ArrayList;

import ast.node.Program;
import byteCode.ISA.ByteCode;
import compileError.CompileError;
import main.grammar.LogicPLLexer;
import main.grammar.LogicPLParser;
import visitor.codeGenerator.CodeGenerator;
import visitor.nameAnalyzer.NameAnalyzer;
import org.antlr.v4.runtime.*;
import visitor.typeAnalyzer.TypeAnalyzer;

public class Main {
        public static void main(String[] args) throws java.io.IOException {
            
            CharStream reader = CharStreams.fromFileName(args[0]);
            LogicPLLexer lexer = new LogicPLLexer(reader);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LogicPLParser parser = new LogicPLParser(tokens);
            Program program = parser.program().p;


            NameAnalyzer nameAnalyzer = new NameAnalyzer();
            nameAnalyzer.visit(program);

            TypeAnalyzer typeAnalyzer = new TypeAnalyzer();
            typeAnalyzer.visit(program);
            if (typeAnalyzer.typeErrors.size() > 0){
                for(CompileError compileError: typeAnalyzer.typeErrors)
                    System.out.println(compileError.getMessage());
                return;
            }
            

            CodeGenerator codeGenerator = new CodeGenerator();
            codeGenerator.visit(program);
            System.out.println(codeGenerator.getGeneratedByteCode());

            System.out.println("Compilation was Successful!!");
        }

}