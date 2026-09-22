import java.util.*;

class Solution {
    public int minMeetingRooms(int[][] intervals) {
        int n = intervals.length;

        if (n == 0) {
            return 0;
        }

        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int rooms = 0;
        int endIndex = 0;

        for (int i = 0; i < n; i++) {
            if (start[i] < end[endIndex]) {
                rooms++;
            } else {
                endIndex++;
            }
        }

        return rooms;
    }
}
