/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1, high = n;
        while(low < high) {
            int mid = low + (high - low) / 2;
            boolean isBad = isBadVersion(mid);
            if(isBad) high = mid;
            else low = mid + 1;
        }

        return high;
    }
}