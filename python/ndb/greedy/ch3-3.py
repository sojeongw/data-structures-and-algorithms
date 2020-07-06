x, y = map(int, input().split())
arr = list(range(y))

result = 0

for i in range(x):
    arr = map(int, input().split())
    m = min(arr)

    if m > result:
        result = m

print(result)