# 121. Best Time to Buy and Sell Stock

## Pattern
Two pointers / expanding window.

## Approach

Use:

left → buying day
right → selling day

The right pointer moves forward.

If the current price is smaller than the buying price:

move left to right.

Otherwise calculate the current profit.

Keep track of the maximum profit.

## Complexity

Time: O(n)
Space: O(1)

## Key Takeaway

When looking for the best pair where one element must come before another, think about maintaining a useful left pointer while scanning with right.
