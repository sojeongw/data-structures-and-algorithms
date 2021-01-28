# n와 m을 공백으로 구분해서 입력받는다.
n, m = map(int, input().split())

# 2차원 리스트로 된 맵 정보를 입력받는다.
graph = []
for i in range(n):
    graph.append(list(map(int, input())))


# dfs로 특정한 노드를 방문한 뒤에 연결된 모든 노드들도 방문한다.
def dfs(x, y):
    # 범위를 벗어나면 종료한다.
    if x <= -1 or x >= n or y <= -1 or y >= m:
        return False

    # 지금 있는 노드에 방문한 적이 없다면
    if graph[x][y] == 0:
        # 방문 처리 한다.
        graph[x][y] = 1

        # 상, 하, 좌, 우를 재귀적으로 호출한다.
        dfs(x - 1, y)
        dfs(x, y - 1)
        dfs(x + 1, y)
        dfs(x, y + 1)
        return True
    return False


# 모든 노드에 음료를 채운다.
result = 0

for i in range(n):
    for j in range(m):
        # 현재 위치에서 dfs를 수행한다.
        if dfs(i, j):
            result += 1

print(result)

# 4 5
# 00110
# 00011
# 11111
# 00000
