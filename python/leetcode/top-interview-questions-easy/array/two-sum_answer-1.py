# one pass hash table
from collections import defaultdict


def two_sum(nums, target):
    hash_table = defaultdict(int)

    for i in range(len(nums)):
        complement = target - nums[i]

        if complement in hash_table:
            return [hash_table[complement], i]

        # 그 숫자에 인덱스를 저장한다.
        hash_table[nums[i]] = i


# numbers, t = [2, 7, 11, 15], 9
# numbers, t = [3, 2, 4], 6
numbers, t = [3, 2, 3], 6
print(two_sum(numbers, t))
