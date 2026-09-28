# Linked List Cycle

## Pattern

Floyd's Cycle Detection

## Idea

Use two pointers:

slow → 1 step

fast → 2 steps

If there is a cycle,
fast will eventually meet slow.

If fast reaches null,
there is no cycle.

## Example

1 → 2 → 3 → 4
        ↑     ↓
        ← ← ←

slow and fast eventually meet.

## Complexity

Time: O(n)

Space: O(1)

## Key Idea

Two pointers moving at different speeds
can detect a cycle without extra memory.
