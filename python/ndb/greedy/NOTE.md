# 3-2. 큰 수의 법칙

- 주어진 배열의 숫자를 M번 더해 가장 큰 수를 만든다.
- 연속하는 숫자는 K번까지만 반복할 수 있다.

## 제출 답안

```python
n = 5
m = 8
k = 3
nums = [2, 4, 5, 4, 6]

result = 0
count = 0
nums.sort(reverse=True)

for i in range(m):
    if count == k:
        result += nums[1]
        count = 0
    else:
        result += nums[0]
        count += 1

print(result)
```

- 일단 내림 차순으로 정렬한다.
    - 반복문을 돌면서 제일 큰 수를 먼저 연속으로 더한다.
        - 연속한 횟수를 count에 저장한다.
    - 계산할 때마다 해당 숫자가 k번 반복됐는지 확인한다.
    - k번을 채웠다면 다음으로 큰 수를 한 번 더한 뒤 다시 제일 큰 수로 돌아간다.

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

- [6, 6, 6, 5] 라는 수열이 일정하게 반복된다는 사실을 파악하면 더 쉽게 풀 수 있다.
- 공통의 규칙을 찾는 일에 더 집중하자.

# 3-3. 숫자 카드 게임

- 2차원 배열로 놓여있는 카드 중에서 한 행을 선택한다.
- 해당 행에서 가장 낮은 숫자를 뽑는다.
    - 그 숫자는 다른 행에 있는 가장 낮은 숫자들 보다 커야 한다.

## 제출 답안

```python
result = min(input[0])

for i in range(1, len(input)):
    min_value = min(input[i])
    if min_value > result:
        result = min_value

print(result)
```

- 첫 번째 행에서 제일 작은 찾아서
    - 두 번째 행부터 반복문으로 첫 번째 행의 숫자보다 큰지 확인하고
    - 크다면 갱신한다.

## 모범 답안

```python
x, y = map(int, input().split())
arr = list(range(y))

result = 0

for i in range(x):
    arr = map(int, input().split())
    m = min(arr)

    result = max(result, m)  # min, max 함수를 사용할 줄 알아야 한다.

print(result)
```

- 마지막에 if문 대신 max 함수를 쓸 걸 그랬다.