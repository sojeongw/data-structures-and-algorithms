# 게임 맵 사이즈인 n, m을 입력받는다.
n, m = map(int, input().split())

# 방문한 위치를 저장하기 위한 맵을 생성한 뒤, 0으로 초기화한다.
# 파이썬에서 2차원 리스트를 만들 때는 이처럼 컴프리헨션 문법을 사용하면 좋다.
d = [[0] * m for _ in range(n)]

# 캐릭터의 현재 좌표와 방향을 입력받는다.
x, y, direction = map(int, input().split())
# 현재 있는 좌표는 방문 처리 한다.
d[x][y] = 1

# 게임 맵 정보를 입력 받는다.
array = []
for i in range(n):
  array.append(list(map(int, input().split())))

# 북, 동, 남, 서 방향을 정의한다.
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

# 왼쪽으로 회전하는 기능을 정의한다.
def turn_left():
  # direction 변수가 함수 밖에서 선언된 전역 변수이므로 global을 붙여준다.
  global direction
  direction -= 1

  if direction == -1:
    direction = 3

# 시뮬레이션을 시작한다.
count = 1
turn_time = 0

while True:
  # 왼쪽으로 회전한다.
  turn_left()

  nx = x + dx[direction]
  ny = y + dx[direction]

  # 회전한 뒤 가본적 없는 칸이 앞에 있을 경우 이동한다.
  if d[nx][ny] == 0 and array[nx][ny] == 0:
    d[nx][ny] = 1
    x = nx
    y = ny

    count += 1
    turn_time = 0
    continue

  # 회전한 후 앞에 가본적 없는 칸이 없거나 바다라면 한 번 더 돈다.
  else:
    turn_time += 1

  # 네 방향 모두 갈 수 없다면
  if turn_time == 4:
    # 한 칸 뒤로 갈 수 있는지 확인하기 위해 좌표를 구하고
    nx = x - dx[direction]
    ny = y - dy[direction]

    # 뒤로 가는 게 가능하다면 방향은 유지한 채로 한 칸 뒤로 간다.
    if array[nx][ny] == 0:
      x = nx
      y = ny

    # 뒤가 바다로 막혀있다면 움직임을 멈춘다.
    else:
      break

    turn_time = 0

print(count)