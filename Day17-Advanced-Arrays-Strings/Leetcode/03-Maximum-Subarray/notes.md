# Maximum Subarray

## Pattern

Kadane's Algorithm

## Idea

At every element, decide:

1. Start a new subarray
2. Continue the existing subarray

Formula:

currentSum = max(nums[i], currentSum + nums[i])

## Example

nums = [-2,1,-3,4,-1,2,1,-5,4]

Maximum subarray:

[4,-1,2,1]

Sum = 6

## Complexity

Time: O(n)

Space: O(1)

## Key Idea

A negative running sum is usually harmful to the next
subarray, so start fresh when necessary.
