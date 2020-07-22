def two_sum(nums, target):
    if len(nums) == 2 and nums[0] + nums[1] == target:
        return [0, 1]

    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            if nums[i] + nums[j] == target:
                return [i, j]


# numbers, t = [2, 7, 11, 15], 9
# numbers, t = [3, 2, 4], 6
numbers, t = [3, 2, 3], 6
print(two_sum(numbers, t))

# runtime: 48ms
# memory usage: 14.4MB
