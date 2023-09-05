#include <vector>
#include <iostream>

class Solution {
public:
    int search(std::vector<int>& nums, int target) {
        int low = 0, high = nums.size() - 1;
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

    static void main() {
        Solution solution;

        // Example 1: Initializing nums1 with values
        std::vector<int> nums1;
        nums1.push_back(1);
        nums1.push_back(2);
        nums1.push_back(3);
        nums1.push_back(4);
        nums1.push_back(5);

        int target1 = 3;
        int result1 = solution.search(nums1, target1);
        std::cout << "Index of " << target1 << " in nums1: " << result1 << std::endl;

        // Example 2: Initializing nums2 with values
        std::vector<int> nums2;
        nums2.push_back(2);
        nums2.push_back(4);
        nums2.push_back(6);
        nums2.push_back(8);
        nums2.push_back(10);

        int target2 = 7;
        int result2 = solution.search(nums2, target2);
        std::cout << "Index of " << target2 << " in nums2: " << result2 << std::endl;

        // Example 3: Initializing an empty nums3 vector
        std::vector<int> nums3;

        int target3 = 5;
        int result3 = solution.search(nums3, target3);
        std::cout << "Index of " << target3 << " in nums3: " << result3 << std::endl;
    }
};

int main() {
    Solution::main();
    return 0;
}
