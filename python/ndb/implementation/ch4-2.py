base = input()

x = ord(base[0]) - 96
y = int(base[1])

condition = [[2, 1], [2, -1], [-2, 1], [-2, -1], [1, 2], [1, -2], [-1, 2], [-1, -2]]

count = 0

for i in range(len(condition)):
    nx = x + condition[i][0]
    ny = y + condition[i][1]

    if nx < 1 or nx > 8 or ny < 1 or ny > 8:
        continue

    count += 1

print(count)
