class Solution:
    def findMaxK(self, nums: list[int]) -> int:
        map = {}
        for num in nums:
            map[num] = True

        maxK = -1
        for num in nums:
            if -num in map:
                maxK = max(maxK, num)

        return maxK

            

        