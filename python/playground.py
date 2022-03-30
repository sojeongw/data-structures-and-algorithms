# 4 4
# 1 1 0
# 1 1 1 1
# 1 0 0 1
# 1 1 0 1
# 1 1 1 1

n, m = map(int, input().split())

# 방문한 위치를 저장하는 맵을 따로 만든다.
# 2차원 리스트를 컴프리헨션으로 초기화 하는 방법을 제대로 알아두자.
d = [[0] * m for _ in range(n)]

# 현재 좌표와 방향을 받는다.
x, y, direction = map(int, input().split())

# 현재 좌표를 미리 방문 처리 해둔다.
d[x][y] = 1

# 전체 맵을 만든다.
# for문 돌며 초기화 할 땐 [] 이렇게만 해도 된다.
game_map = []
for i in range(n):
    game_map.append(list(map(int, input().split())))

# 북, 동, 남, 서
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]


# 왼쪽으로 회전
def turn_left():
    global direction
    # 좌표값 인덱스와 왼쪽 회전을 연결시켜 보면 인덱스가 -1씩 돌아간다.
    direction -= 1
    if direction == -1:
        direction = 3


# 현재 위치는 이미 방문 처리되니까 1부터 시작한다.
count = 1
turn_time = 0
for i in range(1, n):
    for j in range(1, m):
        # 왼쪽으로 회전한다.
        turn_left()

        # 왼쪽으로 회전 후 정면에 갔을 때의 좌표
        nx = x + dx[direction]
        ny = y + dy[direction]

        # 방문한 기록과 게임맵 모두 막혀있으면 안된다.
        if d[nx][ny] == 0 and game_map[nx][ny] == 0:
            # 방문 처리 한다.
            d[nx][ny] = 1
            x = nx
            y = ny
            count += 1
            turn_time = 0

            # 한 단계 끝냈으니 다시 반복한다.
            continue
        # 회전했는데 이미 방문했거나 바다인 경우
        else:
            turn_time += 1
        # 네 방향 모두 갈 수 없는 경우
        if turn_time == 4:
            # 뒤로 갔을 때의 좌표를 구한다.
            # 뒤로 가야하니까 현재 방향에서 마이너스를 하면 반대가 된다.
            nx = x - dx[direction]
            ny = y - dy[direction]
            # 뒤로 갔을 때의 좌표가 가능한지 확인한다.
            if game_map[nx][ny] == 0:
                x = nx
                y = ny
            # 갈 수 없는 경우 멈춘다.
            else:
                break
            # 1단계로 다시 돌아가기 위해 회전 수를 초기화한다.
            turn_time = 0

print(count)
