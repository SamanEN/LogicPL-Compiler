# LogicPL-Phase2

- [LogicPL-Phase2](#logicpl-phase2)
  - [AST Tree](#ast-tree)
  - [Symbol Table](#symbol-table)
	- [Name Analysis](#name-analysis)
	- [Test Cases](#test-cases)
	- [How to Run](#how-to-run)
	
## AST Tree

In this phase, we constructed the Abstract Syntax Tree (AST) to represent the structural organization of the input code. Our approach involved integrating purposeful actions into the grammar rules, resulting in the generation of a comprehensive AST tree. The distinctive features of our AST tree are as follows:

- Every node within the tree corresponds to an instance of the `Node` class.
- Each node is equipped with a `type` attribute that precisely designates its category. The available node types encompass:

  - `PROGRAM`
  - `FUNCTION`
  - `PREDICATE`
  - `IMPLICATION`
  - `LOOP`
  - `QUERY`
  - `VARIABLE`
  - `CONSTANT`
  - `FUNCTION_CALL`
  - `PREDICATE_CALL`
  - `IMPLICATION_CALL`
  - `LOOP_CALL`
  - `QUERY_CALL`

## Symbol Table

The Symbol Table, an essential data structure, serves as a repository for vital information concerning variables and functions established within the input code. Additionally, our progress encompassed the seamless incorporation of the symbol table within the relevant visitor classes. This strategic integration enabled us to comprehensively validate the semantic correctness of the provided input code.

### Name Analysis
In this phase, we implemented the name analysis of the input code. In the name analysis, we check the following semantic rules:
- Each variable is defined only once in each scope.
- Each function is defined only once in the program.

### Test Cases
Our test cases for this phase are located within the `test_cases` folder. To validate the functionality of the implemented name analyzer, follow these steps:

1. [Run](how-to-run) the program with the provided test cases.
2. Compare the program's output with the corresponding test*-ans.txt file.

Ensuring that the program's output closely matches the content of the associated answer file demonstrates the accurate performance of the name analyzer. This validation process guarantees the correct parsing and analysis of LogicPL language constructs. For detailed test case execution instructions, consult our [documentation](how-to-run).

### How to Run
To run the program, follow these steps:
1. Clone the repository.
2. Open the project in IntelliJ IDEA(IntelliSense is recommended).
3. Add the ANTLRv4 plugin to IntelliJ IDEA.
4. Add the ANTLRv4 library to the project.
5. Add the `antlr-4.12.0-complete.jar` file to the project.
6. Open the `LogicPL.g4` file and generate the lexer and parser.
7. Run the `Main.java` file.
8. Enter the path of the input file.
9. Run the program.
10. The output will be printed in the console.


    
