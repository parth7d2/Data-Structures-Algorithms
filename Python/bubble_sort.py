def bubble_sort(nums):
    length = len(nums)
    if length <= 0:
        return nums
    else:
        for i in range(length):
            for j in range(length - i - 1):
                if nums[j] > nums[j + 1]:
                    nums[j], nums[j + 1] = nums[j + 1], nums[j]
    return nums


arr = [12, 15, 13, 12, 47, 96]
print(bubble_sort(arr))