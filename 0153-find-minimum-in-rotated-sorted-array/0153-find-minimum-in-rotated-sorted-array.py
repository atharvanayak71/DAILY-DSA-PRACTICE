class Solution:
    def findMin(self, nums: list[int]) -> int:
        pivot = self.findPivot(nums, 0, len(nums)-1)

        if pivot == -1:
            return nums[0]   
        else:
            return nums[pivot + 1]

    def findPivot(self, arr, start, end):
        while start<=end:
            mid = start + (end - start)//2

            if mid<end and arr[mid]>arr[mid+1]:
                return mid
            if mid>start and arr[mid]<arr[mid-1]:
                return mid-1
            if arr[start]>=arr[mid]:
                end = mid - 1
            else:
                start = mid + 1
        
        return -1