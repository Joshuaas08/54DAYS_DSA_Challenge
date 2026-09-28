# Notes — Binary Search

## Idea

The array is sorted.

Instead of checking every element, check the middle
and eliminate half of the search space.

## Example

[1,2,3,4,5,6,7]

Search for 6.

Check 4.

6 is larger.

Ignore the left half.

Continue searching the right half.

## Time Complexity

O(log n)

The search space is divided by 2 each iteration.

n
n/2
n/4
n/8
...

## Space Complexity

O(1)

We only use a few variables.

## Key Learning

Whenever the search space is repeatedly divided by 2,
think O(log n).
