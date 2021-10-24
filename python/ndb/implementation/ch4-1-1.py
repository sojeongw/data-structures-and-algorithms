n = map(int, input().split())
data = list(input().split())

x = 1
y = 1

for i in range(len(data)):
  if(data[i] == 'R'):
    if(x == n):
      continue  
    y += 1

  if(data[i] == 'L'):
    if(y == 1):
      continue
    y -= 1

  if(data[i] == 'U'):
    if(x == 1):
      continue
    x -= 1

  if(data[i] == 'D'):
    if(y == n):
      continue
    x += 1

print(x, y)