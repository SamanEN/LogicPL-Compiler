# LogicPL-Phase3
In this phase, we implemented the type checking of the input code. In the type checking, we implement the following things:
- ExpressionTypeCheck: The type of the expression in the predicate call must match the type of the corresponding predicate.
- TypeAnalysis: In this visitor, we check the type of the expression in the predicate call and the type of the corresponding predicate.

## Error List
- Error 1: call a variable that is not defined. In this case we assume it as NoType.
- Error 2: misuse in operands. For example, we cannot add a boolean and an integer. In this case we assume it as NoType.
- Error 3: conditon in imlication must be boolean. 
- Error 4: fuction call must be a valid function name that exists in the program. otherwise we assume it NoType.

## Test Cases
Our test cases for this phase are located within the `test_cases` folder. To validate the functionality of the implemented type analyzer, follow these steps:

1. [Run](#how-to-run) the program with the provided test cases.
2. Compare the program's output with the corresponding test*-ans.txt file.

## How to Run
To run the program, follow these steps:
1. Clone the repository.
2. Open the project in IntelliJ IDEA(IntelliSense is recommended).