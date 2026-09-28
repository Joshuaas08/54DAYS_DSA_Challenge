# Reverse Linked List

## Pattern

Pointer Manipulation

## Idea

Reverse each next pointer.

Before:

1 → 2 → 3 → null

After:

3 → 2 → 1 → null

## Important Variables

prev
current
next

We save next before changing current.next.

## Steps

1. Save next node.
2. Point current to prev.
3. Move prev to current.
4. Move current to next.

## Complexity

Time: O(n)

Space: O(1)

## Key Idea

Always save current.next before changing it.
