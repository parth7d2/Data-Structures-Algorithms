def selection_sort(nums):
    length = len(nums)
    if length <= 0:
        return nums

    for i in range(length - 1):
        small = i
        for j in range(i, length):
            if nums[small] > nums[j]:
                small = j
        nums[i], nums[small] = nums[small], nums[i]  
    return nums


arr = [23, 342, 1, 2, 97, 73]
print(selection_sort(arr))
