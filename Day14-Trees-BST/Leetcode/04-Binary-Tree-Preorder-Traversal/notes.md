# Notes — Binary Tree Preorder Traversal

## Preorder

The order is:

Root → Left → Right

Example:

        1
       / \
      2   3
     / \
    4   5

Preorder:

1, 2, 4, 5, 3

## Approach

For every node:

1. Add current value.
2. Visit left subtree.
3. Visit right subtree.

## Base Case

node == null

return

## Complexity

Time: O(n)

Space: O(h)

## Key Learning

Remember:

Preorder = Root first.
