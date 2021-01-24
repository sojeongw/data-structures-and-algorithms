from collections import deque

# bfs 메서드를 정의한다.
def bfs(graph, start, visited):
    #  큐를 구현하기 위해 deque 라이브러리를 사용한다.
    queue = deque([start])

    # 현재 노드를 방문 처리 한다.
    visited[start] = True

    # 큐가 빌 때까지 반복한다.
    while queue:
        # 큐에서 원소를 뽑는다.
        v = queue.popleft()
        print(v, end=' ')

        # 원소와 연결된, 아직 방문하지 않은 원소를 큐에 삽입한다.
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True

graph = [
    [],
    [2, 3, 8],
    [1, 7],
    [1, 4, 5],
    [3, 5],
    [3, 4],
    [7],
    [2, 6, 8],
    [1, 7]
]

visited = [False] * 9

# 호출한다.
bfs(graph, 1, visited)