# 2 * 하나씩만 더한 값 - 그냥 다 더한 값 = 유일한 값
# 2 ∗ (a+b+c) − (a+a+b+b+c) = c

def single_number(nums):
    return 2 * sum(set(nums)) - sum(nums)


numbers = [1, 2, 1, 2, 4]
print(single_number(numbers))

# 시간 복잡도: O(n+n) = O(n)
# sum이 순회하면서 다음 값을 계속 더한다. sum을 두 번 하니까 n+n = n
# 공간 복잡도: O(n+n) = O(n)
# set은 따로 nums의 요소를 위한 공간이 필요하므로 기존 nums인 n에 n을 더한 n
