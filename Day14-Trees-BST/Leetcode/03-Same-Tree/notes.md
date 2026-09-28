# Notes — Same Tree

## Idea

Two trees are the same if:

1. Their node values are equal.
2. Their left subtrees are equal.
3. Their right subtrees are equal.

## Base Cases

Both null:

true

One null:

false

Different values:

false

## Approach

Compare the current nodes first.

Then recursively compare:

left with left

right with right

## Complexity

Time: O(n)

Space: O(h)

## Key Learning

Tree comparison is a classic recursive pattern:

Compare current node → compare left → compare right.
