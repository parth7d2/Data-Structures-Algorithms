
def binary_search(nums, target):
    ans = -1
    if len(nums)==0:
        return 0
    else:
        start = 0
        end = len(nums) - 1
        while (start<= end):
            mid = start + (end - start) // 2
            if nums[mid] == target:
                return mid
            elif nums[mid] > target:
                end = mid-1
            else:
                start = mid+1
    return ans


arr = [12, 24, 25, 28, 36, 43]
print(binary_search(arr, 43))
