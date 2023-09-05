from typing import List

class Solution:
    def search(self, nums: List[int], target: int) -> int:
        low, high = 0, len(nums) - 1
        
        while low <= high:
            mid = low + (high - low) // 2
            if nums[mid] == target:
                return mid
            elif nums[mid] > target:
                high = mid - 1
            else:
                low = mid + 1
        
        return -1
    
    @staticmethod
    def main():
        solution = Solution()

        # Example 1: Searching for an existing target element
        nums1 = [1, 2, 3, 4, 5]
        target1 = 3
        result1 = solution.search(nums1, target1)
        print(f"Index of {target1} in nums1: {result1}")

        # Example 2: Searching for a non-existing target element
        nums2 = [2, 4, 6, 8, 10]
        target2 = 7
        result2 = solution.search(nums2, target2)
        print(f"Index of {target2} in nums2: {result2}")

        # Example 3: Searching in an empty list
        nums3 = []
        target3 = 5
        result3 = solution.search(nums3, target3)
        print(f"Index of {target3} in nums3: {result3}")

if __name__ == "__main__":
    Solution.main()
