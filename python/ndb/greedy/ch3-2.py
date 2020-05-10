n = 5  # 배열 크기
m = 8  # 더할 횟수
k = 3  # 반복 횟수

numbers = [2, 4, 5, 4, 6]
result = 0

numbers.sort(reverse=True)
count = 0

for i in range(m):
    if count < 3:
        result += numbers[0]
        count += 1
    else:
        result += numbers[1]
        count = 0

print(result)
