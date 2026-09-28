# Notes — Maximum Depth of Binary Tree

## Idea

The depth of a tree is the maximum number of nodes
from the root to a leaf.

For every node:

depth = 1 + max(leftDepth, rightDepth)

## Base Case

If the node is null:

return 0

## Approach

1. If root is null, return 0.
2. Recursively calculate left subtree depth.
3. Recursively calculate right subtree depth.
4. Take the maximum.
5. Add 1 for the current node.

## Example

        3
       / \
      9   20
         /  \
        15   7

Maximum depth = 3

## Complexity

Time: O(n)

Space: O(h)

h = height of tree because of recursion stack.

## Key Learning

Many tree problems can be solved by recursively solving
the left and right subtrees.
