# 143. Reorder List

## Pattern
Find middle + reverse + merge.

## Required Order

L0 → L1 → L2 → ... → Ln

becomes:

L0 → Ln → L1 → Ln-1 → L2 → Ln-2 ...

## Approach

Break the problem into 3 steps:

1. Find the middle.
2. Reverse the second half.
3. Merge the two halves alternately.

## Complexity

Time: O(n)
Space: O(1)

## Key Takeaway

Many difficult linked-list problems can be broken into smaller operations:

- Find middle
- Reverse
- Merge
