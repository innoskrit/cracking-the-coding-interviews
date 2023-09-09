class Solution {
    public int mySqrt(int x) {
        if(x <= 1) return x;

        int start = 1, end = x / 2;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            long value = (long) mid * mid;

            if(value == x) return mid;
            else if(value < x) start = mid + 1;
            else end = mid - 1;
        }

        return end;
    }
}