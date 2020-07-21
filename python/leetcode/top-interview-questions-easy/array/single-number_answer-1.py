# 비트 연산자 사용
# 어떤 값에 0으로 XOR 연산을 하면 그대로 나온다.
#  a ^ 0 = a
# 만약 같은 값끼리 XOR 연산을 하면 0이 나온다.
# a ^ a = 0
# a ^ b ^ a = (a ^ a) ^ b = 0 ^ b = b
# 따라서 다른 값은 서로 다 같아서 0으로 나오다가 현재 값이 다르면 그 값이 그대로 나올 것이다.

def single_number(nums):
    a = 0

    for i in nums:
        # a에 결과를 계속 누적하면서 i와 비트 연산을 한다.
        a ^= i
    # 값이 다 같았다면 0, 아니면 달랐던 숫자가 나올 것이다.
    return a


# runtime: 128ms
# memory: 16.8MB
# 시간 복잡도: O(n) nums의 요소만큼 반복한다.
# 공간 복잡도: O(1)

numbers = [1, 1, 2, 4, 2]
print(single_number(numbers))