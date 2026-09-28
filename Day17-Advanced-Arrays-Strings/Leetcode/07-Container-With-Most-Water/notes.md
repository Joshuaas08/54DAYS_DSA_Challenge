# Container With Most Water

## Pattern

Two Pointers

## Formula

area = width × minimum height

## Idea

Start with the widest possible container.

Move the pointer at the shorter height.

Why?

The shorter side limits the amount of water.

Moving the taller side cannot increase the limiting height.

## Complexity

Time: O(n)

Space: O(1)

## Key Idea

Always move the shorter pointer.
