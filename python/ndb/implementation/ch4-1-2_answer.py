n = int(input())
count = 0

for i in range(n+1):
  for k in range(60):
    for j in range(60):
      # 문자열 3이 포함됐는지 문자열로 치환해서 검사한다.
      if '3' in str(i) + str(j) + str(k):
        count += 1

print(count)