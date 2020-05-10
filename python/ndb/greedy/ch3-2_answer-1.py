# 배열 크기, 더할 횟수, 반복 횟수를 공백으로 구분해 입력 받는다.
n, m, k = map(int, input().split())
# n개의 수를 공백으로 구분해 입력 받는다.
data = list(map(int, input().split()))

data.sort(reverse=True)
first = data[0]
second = data[1]

result = 0

while True:
    for i in range(k):  # 가장 큰 수를 k번 더한다.
        if m == 0:  # 더할 횟수가 0이면 반복할 필요가 없으므로 빠져나온다.
            break

        result += first
        m -= 1  # 더할 때마다 더할 횟수가 줄어든다.

    if m == 0:  # 제일 큰 수를 처리하고 나서 더할 횟수가 없으면 while을 빠져나온다.
        break

    result += second  # 두 번째로 큰 수는 한 번만 더한다.
    m -= 1  # 더할 횟수가 줄어들고 다시 큰 수를 더하러 반복문 앞으로 간다.

print(result)
