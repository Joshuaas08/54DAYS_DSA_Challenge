# Notes — Subsets

## Idea

For every element, we have two choices:

Include it

or

Don't include it.

Therefore there are:

2^n

possible subsets.

## Time Complexity

There are 2^n subsets.

Copying each subset can take O(n).

Therefore:

O(n × 2^n)

## Space Complexity

O(n)

for the recursion stack and current subset,
excluding the output.

If counting the output:

O(n × 2^n)

## Key Learning

When every element has two choices,
look for exponential complexity:

O(2^n)
