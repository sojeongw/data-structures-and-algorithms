# 팩토리얼은 재귀로 구현할 수 있는 대표적인 문제다.

# 반복적으로 구현한 팩토리얼
def factorial_iterative(n):
    result = 1

    # 1부터 n까지의 수를 차례대로 곱한다.
    for i in range(1, n + 1):
        result *= i
    return result


# 재귀적으로 구현한 팩토리얼
def factorial_recursive(n):
    # n이 1 이하면 1을 반환한다.
    if n <= 1:
        return 1

    # n! = n * n(n-1)!을 그대로 코드로 작성한다.
    return n * factorial_recursive(n - 1)


print('반복적인 구현: ', factorial_iterative(5))
print('재귀적인 구현: ', factorial_recursive(5))

# 재귀로 구현하면 코드가 더 간결해진다.
# 재귀는 꼭 종료할 수 있는 조건을 구현해줘야 한다.
