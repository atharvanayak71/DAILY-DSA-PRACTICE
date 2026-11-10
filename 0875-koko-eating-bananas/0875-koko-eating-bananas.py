class Solution:
    def minEatingSpeed(self, piles: list[int], h: int) -> int:

        low = 1
        high = 0

        for i in piles:
            high = max(high, i)
        
        ans = high

        while low <= high:
            mid = low + (high-low)//2

            if self.CAN_EAT(piles, h, mid):
                ans = mid
                high = mid - 1
            else:
                low = mid + 1
            
        return ans
        
    def CAN_EAT(self, piles, h, k):
        hours = 0
        for i in piles:
            hours += (i + k - 1) // k
                
        return hours <= h