# 15. 3Sum

## Pattern
Sorting + two pointers.

## Approach

First sort the array.

Fix one element using i.

Then use two pointers:

left = i + 1
right = n - 1

Calculate:

nums[i] + nums[left] + nums[right]

If sum is:

- < 0 → move left
- > 0 → move right
- = 0 → store the triplet

Skip duplicate values to avoid duplicate answers.

## Complexity

Time: O(n²)
Space: O(1) extra space excluding the result.

## Key Takeaway

3Sum is essentially:

Loop + Two Pointers

Sorting makes the two-pointer technique possible.
