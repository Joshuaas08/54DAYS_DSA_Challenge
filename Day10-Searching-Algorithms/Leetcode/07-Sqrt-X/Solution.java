class Solution {
    public int mySqrt(int x) {

        if (x < 2) {
            return x;
        }

        long left = 1;
        long right = x / 2;

        int answer = 1;

        while (left <= right) {

            long mid = left + (right - left) / 2;

            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            }

            if (square < x) {

                answer = (int) mid;
                left = mid + 1;

            } else {

                right = mid - 1;
            }
        }

        return answer;
    }
}
