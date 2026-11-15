class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        f = {0:1}
        current_sum = 0
        result = 0

        for num in nums:
            current_sum += num
            ques = current_sum - k
            freq = f.get(ques,0)
            result += freq
            f[current_sum] = f.get(current_sum,0)+1

        return result