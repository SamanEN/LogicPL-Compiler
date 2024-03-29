# Compiler Course Project - LogicPL

Please be aware that the structural organization relies on directories rather than the version control system. This choice was influenced by the requirements of the PLC course, where students were instructed to submit assignments in this particular format, inadvertently resulting in the misapplication of git functionalities.

## Project Description
LogicPL is a programming language that includes the following features:

- Variables
- Functions
- Implications
- Predicates
- Loops
- Queries

For more information about the language, please refer to the [LogicPL_Documentation file](./docs/LogicPL_Documentation.pdf).

## Phases
You can find the source code of each phase and detailed information about it in the corresponding folder.
* [Phase 1](#phase-1)
* [Phase 2](#phase-2)
* [Phase 3](#phase-3)
* [Phase 4](#phase-4)

## Phase 1

This phase includes the lexical and syntax analyzers of the LogicPL. Every feature and keyword of LogicPL is tokenized and parsed using ANTLR. The full grammar and tokens are available in the [grammar file](./src/main/grammar/LogicPL.g4). For more details about this phase, please refer to the [phase 1 project description](./docs/LogicPL_Phase1.pdf).

## Phase 2

In this phase, some parts of the semantic analyzer was developed. This includes an implementation of th AST tree, a symbol table, and a name analyzer. The symbol table is used to save each symbol and name occurrence. It is then used to detect two violations:

- Each variable is defined more than once in each scope.
- Each function is defined more than once in the program.

For more information, refer to the [phase 2 project description](./docs/LogicPL_Phase2.pdf).

## Phase 3

The name analysis was further developed in this phase. A type checker was added, which includes an `ExpressionTypeChecker` and a `TypeAnalyzer`. `ExpressionTypeChecker` check the mathematical expressions and returns the type of that expression. The `TypeAnalyzer` is then called to make sure no violation happens. The errors that are checked are as below:

- Error 1: call a variable that is not defined. In this case we assume it as `NoType`.
- Error 2: misuse in operands. For example, we cannot add a boolean and an integer. In this case we assume it as `NoType`.
- Error 3: condition in implication must be boolean. 
- Error 4: function call must be a valid function name that exists in the program. otherwise we assume it `NoType`.


## Phase 4

In this phase of the LogicPL compiler, the code generator was added. The code generator's primary task is to traverse the Abstract Syntax Tree (AST) generated by the previous phases of the compiler and produce Jasmine Assembly code. Note that this is just a simplified mocked versions of the Java ByteCode and it can not be executed. The output of this phase was just to implement a ByteCode-like logic.
