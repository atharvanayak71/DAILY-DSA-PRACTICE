class Solution:
    def subarraysDivByK(self, nums: list[int], k: int) -> int:
        current_sum = 0
        result = 0

        f = {0:1}

        for num in nums:
            current_sum += num
            ques = current_sum % k
            if ques<0:
                ques += k
            freq = f.get(ques,0)
            result += freq
            f[ques] = f.get(ques,0)+1
            
        return result
