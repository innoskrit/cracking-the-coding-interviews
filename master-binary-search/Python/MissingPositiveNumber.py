class Solution:
    def missingElement(self, nums: List[int], k: int) -> int:
        start = 0
        end = len(nums) - 1
        numberOfMissingElements = 0

        while start <= end:
            mid = start + (end - start) // 2
            numberOfMissingElements = nums[mid] - nums[0] - mid

            if numberOfMissingElements < k:
                start = mid + 1
            else:
                end = mid - 1

        if numberOfMissingElements < k:
            return nums[end] + (k - numberOfMissingElements)
        else:
            return nums[start] - (numberOfMissingElements - k) - 1
