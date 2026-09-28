# Notes — Validate Binary Search Tree

## BST Property

For every node:

All values in the left subtree
< node.val

All values in the right subtree
> node.val

## Important Idea

We maintain a valid range for every node.

Initially:

(-infinity, +infinity)

For the left child:

(min, node.val)

For the right child:

(node.val, max)

## Why Not Just Compare Children?

This tree is NOT a valid BST:

        5
       / \
      3   7
         /
        4

4 is smaller than 5 but is inside the right subtree.

So we need to maintain the complete valid range.

## Why long?

TreeNode.val is an int.

Using Long.MIN_VALUE and Long.MAX_VALUE gives
a safe range around all possible int values.

## Complexity

Time: O(n)

Space: O(h)

## Key Learning

BST validation is a range problem.
