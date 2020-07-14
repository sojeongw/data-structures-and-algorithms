base = input()

x = ord(base[0]) - ord('a') + 1
y = int(base[1])

conditions = [(2, 1), (2, -1), (-2, 1), (-2, -1), (1, 2), (1, -2), (-1, 2), (-1, -2)]

count = 0

for condition in conditions:
    nx = x + condition[0]
    ny = y + condition[1]

    if nx < 1 or nx > 8 or ny < 1 or ny > 8:
        continue

    count += 1

print(count)