# 최대한 N을 많이 나누면 된다.
# 2 이상의 수로 나누는 것이 1을 빼는 것보다 숫자를 훨씬 많이 줄일 수 있기 때문이다.
# K에 2 이상의 자연수라는 조건이 붙었으므로 이게 가장 빠른 방법이다.

n, k = map(int, input().split())
result = 0

while n >= k:
    # n이 k로 나누어 떨어지지 않으면 1씩 차감한다.
    while n % k != 0:
        n -= 1
        result += 1

    # 아니면 K로 나눈다.
    n //= k
    result += 1

# 마지막으로 남은 수를 1씩 차감한다.
while n > 1:
    n -= 1
    result += 1

print(result)
