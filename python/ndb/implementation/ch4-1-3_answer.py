input_data = input()

# a1로 들어온다면 1이 row
row = int(input_data[1])
# a1로 들어온다면 a가 row
# 아스키 코드로 변환해서 a값으로 뺀 뒤 1을 더하면 위치가 나온다.
column = int(ord(input_data[0])) - int(ord('a')) + 1

# dx, dy처럼 따로 리스트를 만들지 않고 이렇게 하나로 합쳐서 쓸 수도 있다.
steps = [(-2, -1), (-1, -2), (2, -1), (2, 1), (1, 2), (-1, 2), (-2, 1)]

result = 0
for step in steps:
  # step = (x, y)이므로 x값을 더한다.
  next_row = row + step[0]
  # step = (x, y)이므로 y값을 더한다.
  next_column = column + step[1]

  if next_row >= 1 and next_row <= 8 and next_column >=1 and next_column <= 8:
    result += 1

print(result)