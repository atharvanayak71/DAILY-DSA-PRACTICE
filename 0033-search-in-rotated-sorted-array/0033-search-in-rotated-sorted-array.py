class Solution:
    def search(self, nums: list[int], target: int) -> int:
        pivot = self.findPivot(nums)

        if pivot == -1:
            return self.binarySearch(nums, target, 0, len(nums)-1)
        
        if nums[pivot] == target:
            return pivot
        
        if target>=nums[0]:
            return self.binarySearch(nums, target, 0, pivot-1)
        else:
            return self.binarySearch(nums, target, pivot+1, len(nums)-1)
    
    def binarySearch(self, arr, target, start, end):
        while start<=end:

            mid = start + (end - start)//2
        
            if arr[mid] == target:
                return mid 
            elif arr[mid] > target:
                end = mid - 1
            else:
                start = mid+1
            
        return -1

    
    def findPivot(self, arr):

        start = 0
        end = len(arr) - 1

        while start<=end:

            mid = start + (end - start)//2
        
            if mid < end and arr[mid] > arr[mid + 1]:
                return mid 
            if mid > start and arr[mid] < arr[mid - 1]:
                return mid-1
            if arr[start] >= arr[mid]:
                end = mid-1
            else:
                start = mid+1
        
        return -1
    

