# Best Time to Buy and Sell Stock

## Pattern

Greedy

## Idea

We want to buy at the lowest price seen so far.

For every price:

1. Update minimum buying price.
2. Calculate today's profit.
3. Update maximum profit.

## Example

prices = [7,1,5,3,6,4]

Minimum price = 1

Best selling price = 6

Maximum profit = 5

## Complexity

Time: O(n)

Space: O(1)

## Key Idea

Keep the cheapest buying price seen so far.
