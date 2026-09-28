# Notes — Kth Smallest Element in a BST

## Important BST Property

Inorder traversal of a BST gives values in sorted order.

Inorder:

Left → Root → Right

Example:

        3
       / \
      1   4
       \
        2

Inorder:

1, 2, 3, 4

Therefore:

1st smallest = 1
2nd smallest = 2
3rd smallest = 3
4th smallest = 4

## Approach

1. Traverse the left subtree.
2. Count the current node.
3. If count == k, we found the answer.
4. Continue to the right subtree.

## Complexity

Time: O(h + k) on the search path in typical analysis.

Space: O(h)

## Key Learning

Whenever you see:

"Kth smallest in a BST"

think:

INORDER TRAVERSAL
