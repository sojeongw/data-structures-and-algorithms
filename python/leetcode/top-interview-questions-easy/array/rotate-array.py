nums = [1, 2, 3, 4, 5, 6, 7]
k = 3

# nums의 길이보다 k가 클 때 반복되는 횟수를 뺀 나머지 만큼에 대해 계산한다.
k %= len(nums)

# 뒤에서 앞으로 옮겨오는 작업은 k만큼 배열을 나눠서 뒷부분을 앞으로 바꿔치기 하는 것과 같다.
arr1 = nums[0:len(nums) - k]
arr2 = nums[len(nums) - k:len(nums)]

# [:]는 모든 요소를 의미한다.
# 그냥 nums = a로 할당하면 안된다.
nums[:] = arr2 + arr1

print(nums)

# runtime: 56ms
# memory usage: 15.5MB
