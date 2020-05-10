# [6, 6, 6, 5] 라는 수열이 일정하게 반복된다는 사실을 파악하면 더 쉽게 풀 수 있다.
# 이때, 수열의 길이는 (반복 횟수 k)+1이 된다.
# 따라서 더할 횟수 m을 k+1로 나누면 수열이 반복되는 횟수가 나온다.
# 다시 여기에 k를 곱하면 가장 큰 수가 나오는 횟수다.
# m이 k+1로 나누어 떨어지지 않으면 그 나머지만큼 가장 큰 수가 추가로 더해진다.
# 따라서 가장 큰 수가 더해지는 횟수는 int(m/(k+1))*k  + m%(k+1)

n, m, k = map(int, input().split())
data = list(map(int, input().split()))

data.sort(reverse=True)
first = data[0]
second = data[1]

count = int(m/(k+1)) * k
count += m % (k+1)

result = 0
result += count * first
result += (m-count) * second

print(result)
