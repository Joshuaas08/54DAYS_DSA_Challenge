# 4Sum II

## Pattern

HashMap + Two-Pair Sum

## Key Idea

We need:

a + b + c + d = 0

Rearrange:

a + b = -(c + d)

Instead of checking every combination:

1. Calculate every A + B pair.
2. Store their frequencies.
3. Calculate C + D.
4. Look for -(C + D).

## Complexity

Time: O(N²)
Space: O(N²)

## Why HashMap?

Without hashing:

O(N⁴)

With pair sums:

O(N²)

Huge improvement.

## Takeaway

When a problem asks for combinations,
try splitting the expression into two parts.

Example:

A + B + C + D = 0

becomes:

A + B = -(C + D)
