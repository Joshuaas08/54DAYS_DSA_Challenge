# Notes — Lowest Common Ancestor of a BST

## Idea

Because this is a BST, we can use its ordering property.

If both p and q are smaller than root:

→ Search left subtree.

If both are larger than root:

→ Search right subtree.

Otherwise:

→ Current root is the Lowest Common Ancestor.

## Example

        6
       / \
      2   8
     / \
    0   4
       / \
      3   5

For p = 2 and q = 8:

They are on different sides of 6.

Therefore:

LCA = 6

## Complexity

Time: O(h)

Space: O(h) with recursive calls.

## Key Learning

BST ordering can eliminate half of the tree during
the search.
