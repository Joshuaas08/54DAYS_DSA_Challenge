# 875. Koko Eating Bananas

## Pattern
Binary Search on the Answer.

## Main Idea

We are not searching an array.

We are searching for the minimum eating speed.

Possible speeds:

1 → maximum pile

For each speed, ask:

"Can Koko finish all bananas within h hours?"

If yes:

Try a smaller speed.

If no:

Increase the speed.

## Complexity

Time: O(n log m)

where:

n = number of piles
m = maximum pile size

Space: O(1)

## Key Takeaway

When the answer is a number and you can check whether a candidate answer works, think:

Binary Search on the Answer.

Pattern:

Guess → Check → Smaller or Larger
