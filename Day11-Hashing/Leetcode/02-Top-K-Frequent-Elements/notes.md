# Top K Frequent Elements

## Pattern

Frequency Map + Bucket Sort

## Key Idea

1. Count frequency of every number.
2. Create buckets where index = frequency.
3. Traverse buckets from highest frequency to lowest.
4. Take the first K elements.

## Example

nums = [1,1,1,2,2,3]

Frequency:

1 -> 3
2 -> 2
3 -> 1

Buckets:

1: [3]
2: [2]
3: [1]

Take from right to left.

## Complexity

Time: O(N)
Space: O(N)

## Takeaway

When the required answer depends on frequency,
think:

HashMap → frequency → buckets/heap.
