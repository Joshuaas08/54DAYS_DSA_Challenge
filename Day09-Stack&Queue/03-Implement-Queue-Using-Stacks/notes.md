# 232. Implement Queue Using Stacks

## Pattern
Two stacks.

## Queue

Queue follows:

FIFO → First In First Out

Stack follows:

LIFO → Last In First Out

## Approach

Use two stacks:

input
output

New elements are pushed into input.

When we need to remove or view the front element:

Move elements from input to output if output is empty.

This reverses the order and gives us FIFO behavior.

## Complexity

push: O(1)
pop: Amortized O(1)
peek: Amortized O(1)
empty: O(1)

## Key Takeaway

Two stacks can simulate a queue by reversing the order of elements.
