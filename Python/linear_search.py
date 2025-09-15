def linear_search(nums, target):
    if(len(nums)==0):
        return -1
    else:
        for i in range(len(nums)):
            if(nums[i] == target):
                return i
    return -1

arr = [23, 18, 20, 38, 97]
print(linear_search(arr, 97))