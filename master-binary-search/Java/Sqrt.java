class Solution {
    public int mySqrt(int x) {
        if(x <= 1) return x;

        long low = 1, high = x / 2;
        while(low < high) {
            long mid = low + (high - low) / 2;
            long sqrt = mid * mid;

            if(sqrt >= x) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        if(low * low > x) low = low - 1;

        return (int)low;
    }
}