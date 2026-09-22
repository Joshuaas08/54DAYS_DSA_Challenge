# LeetCode 253 - Meeting Rooms II

## Problem

Given an array of meeting time intervals, determine the minimum number of conference rooms required.

## Approach

Separate all start times and end times into two arrays.

Then sort both arrays.

Use two pointers:

- One pointer for start times
- One pointer for end times

If the next meeting starts before the earliest current meeting ends:

    start[i] < end[j]

we need another room.

Otherwise, a room becomes available.

## Example

Input:

[0,30]
[5,10]
[15,20]

Start times:

[0,5,15]

End times:

[10,20,30]

The maximum number of meetings happening at the same time is 2.

Answer:

2

## Complexity

- Time: O(n log n)
- Space: O(n)

## Key Takeaway

Sorting start and end times allows us to solve a scheduling problem using a simple two-pointer technique.
