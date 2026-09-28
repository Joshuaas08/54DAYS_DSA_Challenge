# Add Two Numbers

## Pattern

Linked List + Carry

## Example

l1:

2 → 4 → 3

l2:

5 → 6 → 4

Represents:

342 + 465

Result:

7 → 0 → 8

Represents:

807

## Formula

sum = value1 + value2 + carry

digit = sum % 10

carry = sum / 10

## Complexity

Time: O(max(n, m))

Space: O(max(n, m))

## Key Idea

Process both lists one digit at a time while
maintaining carry.
