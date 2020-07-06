x, y = map(int, input().split())
arr = list(range(y))

result = 0

for i in range(x):
    arr = map(int, input().split())
    m = min(arr)

    result = max(result, m) # min, max 함수를 사용할 줄 알아야 한다.

print(result)
