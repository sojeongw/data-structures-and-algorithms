from functools import reduce


def bitwise_operator(nums):
    return reduce(lambda x, y: x ^ y, nums)


# fail
def single_number(nums) -> int:
    if len(nums) == 1:
        return nums[0]

    nums.sort()
    n = len(nums)

    for i in range(0, n - 1, 2):
        if nums[i] == nums[n - 1] or nums[i] != nums[i + 1]:
            return nums[i]

    return nums[n - 1]


numbers = [1, 1, 2, 4, 2]
result1 = single_number(numbers)
result2 = bitwise_operator(numbers)

print(result1)
print(result2)

# runtime: 152ms
# memory: 16.5MB
