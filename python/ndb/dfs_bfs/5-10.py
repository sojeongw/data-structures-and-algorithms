n, m = map(int, input().split())
graph = []

for i in range(n):
    graph.append(list(map(int, input())))


def dfs(x, y):
    # 범위를 벗어난 값을 체크한다.
    if x <= -1 or x >= n or y <= -1 or y >= m:
        return False

    # 방문한 노드인지 체크한다.
    if graph[x][y] == 0:
        graph[x][y] = 1

        # 상, 하, 좌, 우에 같은 로직을 반복한다.
        dfs(x - 1, y)
        dfs(x, y - 1)
        dfs(x + 1, y)
        dfs(x, y + 1)
        return True
    return False


result = 0

for i in range(n):
    for j in range(m):
        if dfs(i, j):
            result += 1

print(result)
