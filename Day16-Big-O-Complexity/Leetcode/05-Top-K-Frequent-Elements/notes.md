# Notes — Top K Frequent Elements

## Idea

First count how frequently each number appears.

Then sort the unique numbers by frequency.

Finally return the first k numbers.

## Approach

### Step 1

Build frequency map.

Time: O(n)

### Step 2

Create a list of unique numbers.

Time: O(n)

### Step 3

Sort the list.

If there are m unique elements:

O(m log m)

Since m <= n:

O(n log n)

## Time Complexity

O(n log n)

## Space Complexity

O(n)

HashMap and ArrayList can both contain up to n elements.

## Key Learning

Sorting often gives O(n log n).

Always identify which part of the algorithm dominates
the total complexity.
