# Notes — Longest Consecutive Sequence

## Idea

Use a HashSet for O(1) average lookup.

Only start building a sequence when:

num - 1

does not exist.

That means num is the beginning of a sequence.

## Example

[100,4,200,1,3,2]

Sequence:

1 → 2 → 3 → 4

Answer:

4

## Why O(n)?

At first glance, there is a while loop inside a for loop.

It looks like O(n²).

But each number belongs to a consecutive sequence
and is advanced through only a limited number of times
across the sequence-building process.

Therefore the overall average complexity is O(n).

## Time Complexity

Average: O(n)

## Space Complexity

O(n)

## Key Learning

Nested loops do NOT automatically mean O(n²).

You must analyze how many times each element is processed.
