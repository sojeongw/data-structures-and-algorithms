# 3-2. 큰 수의 법칙

## 모범 답안

```python
n, m, k = map(int, input().split())
data = list(map(int, input().split()))

data.sort(reverse=True)
first = data[0]
second = data[1]

count = int(m / (k + 1)) * k
count += m % (k + 1)

result = 0
result += count * first
result += (m - count) * second

print(result)
```

- 공통의 규칙을 찾는 일에 더 집중하자.