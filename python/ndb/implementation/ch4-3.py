row, column = map(int, input().split())
y, x, d = map(int, input().split())
gameMap = [[] * column for _ in range(row)]

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

for i in range(row):
    gameMap[i] = list(map(int, input().split()))

gameMap[x][y] = 1
nx = 0
ny = 0
count = 0

while True:
    nx = x + dx[d]
    ny = y + dy[d]

    if gameMap[nx][ny] == 0:
        x = nx
        y = ny
        count += 1
        d += 1

    nx = x + dx[d - 2]
    ny = y + dy[d - 2]

    if gameMap[nx][ny] == 0:
        continue
    else:
        break

print(gameMap)

# fail
