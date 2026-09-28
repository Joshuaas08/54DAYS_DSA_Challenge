# 3Sum

## Pattern

Sorting + Two Pointers

## Idea

Sort the array.

Fix one number.

Then use two pointers to find the other two numbers.

If:

sum < 0 → move left

sum > 0 → move right

sum == 0 → record answer

## Duplicate Handling

Skip duplicate values to avoid duplicate triplets.

## Complexity

Time: O(n²)

Space: O(log n) to O(n), depending on sorting implementation.

## Key Idea

Sorting converts the problem into a two-pointer problem.
