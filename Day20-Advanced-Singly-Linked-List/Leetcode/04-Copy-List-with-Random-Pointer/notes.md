# Copy List with Random Pointer

## Pattern

HashMap

## Node

Each node contains:

val
next
random

The random pointer can point to any node.

## Idea

Use a HashMap:

original node → copied node

First pass:

Create all copied nodes.

Second pass:

Connect next and random pointers.

## Complexity

Time: O(n)

Space: O(n)

## Key Idea

Map every original node to its corresponding
new node.
