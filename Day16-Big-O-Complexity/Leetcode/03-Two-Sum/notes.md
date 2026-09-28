# Notes — Two Sum

## Idea

For every number:

complement = target - current number

If the complement already exists in the HashMap,
we found the answer.

## Why HashMap?

A brute-force solution uses two loops:

O(n²)

Using a HashMap allows average O(1) lookup.

Therefore:

O(n)

## Approach

1. Create a HashMap.
2. Calculate the complement.
3. Check if complement exists.
4. If yes, return both indexes.
5. Otherwise store current number.

## Time Complexity

Average: O(n)

## Space Complexity

O(n)

The HashMap can contain up to n elements.

## Key Learning

Extra memory can often be used to improve time complexity.
