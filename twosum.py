class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range (1, len(nums)):
            if nums[i]+nums[i-1] == target:
                return i, i-1
