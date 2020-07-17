nums = [1, 2, 3, 4, 5, 6, 7]
k = 3

# Using Reverse
# k번 돌린 후의 결과는 뒤에서 k번째 까지를 앞으로 옮긴것과 같다.
# 이런 관점에서 먼저 모든 요소를 reverse 시킨 후 나눈 요소를 각각 reverse 한다.
# Original List                   : 1 2 3 4 5 6 7
# After reversing all numbers     : 7 6 5 4 3 2 1
# After reversing first k numbers : 5 6 7 4 3 2 1
# After revering last n-k numbers : 5 6 7 1 2 3 4 --> Result

n = len(nums)
k %= n

nums.reverse()


# 맞은편 인덱스끼리 서로 swap 하면서 안으로 범위를 줄여나가면 reverse!
def reverse(numbers, start, end):
  while start < end:
    numbers[start], numbers[end] = numbers[end], numbers[start]
    start, end = start + 1, end - 1


reverse(nums, 0, k - 1)
reverse(nums, k, n - 1)

print(nums)

# runtime: 64ms
# memory: 15.7MB
# 시간 복잡도: O(n) n개의 요소가 3번 reverse 했다.
# 공간 복잡도: O(1) 여분의 배열을 쓰지 않았다.
