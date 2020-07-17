nums = [1, 2, 3, 4, 5, 6, 7]
k = 3

# Brute Force
# 한 칸씩 이동하는 가장 기본적인 방법

k %= len(nums)

for i in range(k):
  previous = nums[-1]

  for j in range(len(nums)):
    # 파이썬에서는 swap을 아래처럼 간단하게 할 수 있다.
    nums[j], previous = previous, nums[j]

    # 이렇게 하면 당연히 swap 안됨!
    # nums[j] = previous
    # previous = nums[j]

print(nums)

# 시간 복잡도: O(n * k)
# 공간 복잡도: O(1) 다른 공간을 사용하지 않았다.
