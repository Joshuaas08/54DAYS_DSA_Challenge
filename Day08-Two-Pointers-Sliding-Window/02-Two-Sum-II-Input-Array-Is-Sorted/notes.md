# 167. Two Sum II: Input Array Is Sorted

## Pattern
Two pointers from opposite ends.

## Approach

Because the array is sorted:

- If sum < target → increase left
- If sum > target → decrease right
- If sum == target → answer found

Start with:

left = 0
right = n - 1

## Complexity

Time: O(n)
Space: O(1)

## Key Takeaway

A sorted array often allows us to replace a HashMap with two pointers.
