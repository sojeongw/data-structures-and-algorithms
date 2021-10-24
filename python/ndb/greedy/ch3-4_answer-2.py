n, k = map(int, input().split())

result = 0

while True:
    # k로 나누어 떨어지는 수를 임의로 구한다.
    target = (n // k) * k
    # 1을 빼는 연산을 몇 번을 수행하게 될지 구한다.
    result += n - target
    # 이제 k로 나누어 떨어지는 것만 고려했을 때 몇 번을 해야할지 구한다.
    n = target

    # n이 k보다 작을 때(더 나눌 수 없을 때) 반복문을 나간다.
    if n < k:
        break

    # k로 나누는 연산은 한 번 수행되므로 1을 더해준다.
    result += 1
    # k로 나눈다.
    n //= k

# n < k인데도 n이 1보다 크다면 이 남은 수에 대해 1씩 빼는 연산을 해야하므로 그 횟수만큼 더한다.
result += (n - 1)

print(result)
