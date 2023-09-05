/*
 * Give an sorted integer array.
 * Find the index of target element.
 */


class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: Searching for an existing target element
        int[] nums1 = { 1, 2, 3, 4, 5 };
        int target1 = 3;
        int result1 = solution.search(nums1, target1);
        System.out.println("Index of " + target1 + " in nums1: " + result1);

        // Example 2: Searching for a non-existing target element
        int[] nums2 = { 2, 4, 6, 8, 10 };
        int target2 = 7;
        int result2 = solution.search(nums2, target2);
        System.out.println("Index of " + target2 + " in nums2: " + result2);

        // Example 3: Searching in an empty array
        int[] nums3 = {};
        int target3 = 5;
        int result3 = solution.search(nums3, target3);
        System.out.println("Index of " + target3 + " in nums3: " + result3);
    }
}
