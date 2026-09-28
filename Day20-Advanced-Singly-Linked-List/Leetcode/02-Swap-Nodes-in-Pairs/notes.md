# Swap Nodes in Pairs

## Pattern

Pointer Manipulation

## Example

1 → 2 → 3 → 4

Result:

2 → 1 → 4 → 3

## Steps

For every pair:

first → second

Change it to:

second → first

Then move to the next pair.

## Complexity

Time: O(n)

Space: O(1)

## Key Idea

Use a dummy node and carefully reconnect
three links.
