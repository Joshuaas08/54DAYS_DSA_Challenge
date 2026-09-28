# Reverse Linked List Recursively

## Pattern

Recursion + Pointer Manipulation

## Idea

Instead of reversing the current node first,
recursively reverse the rest of the list.

Example:

1 → 2 → 3

First recursively reverse:

2 → 3

which becomes:

3 → 2

Then attach:

1

Result:

3 → 2 → 1

## Base Case

If:

head == null

or:

head.next == null

return head.

## Complexity

Time: O(n)

Space: O(n)

The extra space comes from recursion.

## Key Idea

Reverse the smaller problem first,
then attach the current node.
