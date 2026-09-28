# Notes — Contains Duplicate

## Idea

Use a HashSet to remember numbers we have already seen.

If a number is already in the set, it is a duplicate.

## Approach

1. Create a HashSet.
2. Traverse the array.
3. Check if the number already exists.
4. If yes, return true.
5. Otherwise add it.
6. Return false.

## Time Complexity

Average: O(n)

HashSet lookup is O(1) on average.

We process n elements.

## Space Complexity

O(n)

In the worst case, the HashSet stores every element.

## Key Learning

HashSet can reduce a nested O(n²) duplicate search
to average O(n).
