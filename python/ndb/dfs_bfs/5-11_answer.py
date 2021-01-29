from collections import deque

n, m = map(int, input().split())

graph = []
for i in range(n):
    graph.append(list(map(int, input())))

# 이동할 상, 하, 좌, 우를 정의한다.
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]


def bfs(x, y):
    # 큐를 구현하기 위해 deque 라이브러리를 사용한다.
    queue = deque()
    queue.append((x, y))

    # 큐가 빌 때까지 반복한다.
    while queue:
        x, y = queue.popleft()

        # 현재 위치에서 네 방향으로의 위치를 확인한다.
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            # 미로 찾기 공간을 벗어나면 무시한다.
            if nx < 0 or ny < 0 or nx >= n or ny >= m:
                continue
            # 벽이면 무시한다.
            if graph[nx][ny] == 0:
                continue
            # 해당 노드를 처음 방문하는 경우에만 최단 거리를 기록한다.
            if graph[nx][ny] == 1:
                graph[nx][ny] = graph[x][y] + 1
                queue.append((nx, ny))

    # 가장 오른쪽 아래까지의 최단 거리를 반환한다.
    return graph[n - 1][m - 1]


print(bfs(0, 0))


# 5 6
# 101010
# 111111
# 000001
# 111111
# 111111
