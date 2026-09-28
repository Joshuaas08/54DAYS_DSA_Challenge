# Notes — Invert Binary Tree

## Idea

Invert the tree by swapping the left and right children
of every node.

Example:

        4
       / \
      2   7

becomes:

        4
       / \
      7   2

## Approach

For every node:

1. Invert the left subtree.
2. Invert the right subtree.
3. Swap them.

## Base Case

If root == null, return null.

## Complexity

Time: O(n)

Space: O(h)

## Key Learning

Tree recursion naturally processes every node from the
top down.
