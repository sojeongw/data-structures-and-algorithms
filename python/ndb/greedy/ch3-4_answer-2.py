n, k = map(int, input().split())

result = 0

while True:
    # n이 k로 나누어 떨어지는 수가 될 때까지 1씩 뺀다.
    target = (n // k) * k
    result += n - target
    n = target

    # n이 k보다 작을 때(더 나눌 수 없을 때) 반복문을 나간다.
    if n < k:
        break

    # k로 나눈다.
    result += 1
    n //= k

# 마지막으로 남은 수에 1씩 뺀다.
result += n - 1

print(result)
