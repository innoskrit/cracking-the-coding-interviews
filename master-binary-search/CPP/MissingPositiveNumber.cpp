class Solution {
public:
    int missingElement(vector<int>& nums, int k) {
        int start = 0, end = nums.size() - 1;
        int numberOfMissingElements = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            numberOfMissingElements = nums[mid] - nums[0] - mid;

            if (numberOfMissingElements < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (numberOfMissingElements < k) {
            return nums[end] + (k - numberOfMissingElements);
        } else {
            return nums[start] - (numberOfMissingElements - k) - 1;
        }
    }
};
