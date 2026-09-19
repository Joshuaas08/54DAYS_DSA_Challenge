# 150. Evaluate Reverse Polish Notation

## Pattern
Stack.

## Approach

Numbers are pushed onto the stack.

When an operator appears:

1. Pop the second operand.
2. Pop the first operand.
3. Perform the operation.
4. Push the result back.

Important:

For subtraction and division:

a = first popped after b

Actually:

b = stack.pop()
a = stack.pop()

Then:

a - b
a / b

## Complexity

Time: O(n)
Space: O(n)

## Key Takeaway

Stack is ideal for evaluating expressions where operations depend on the most recently available operands.
