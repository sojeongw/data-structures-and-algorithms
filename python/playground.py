present = "c2"
x = int(present[1])
y = ord(present[0]) - 96
d = [(1, 2), (-1, 2), (1, -2), (-1, -2),
     (2, 1), (2, -1), (-2, 1), (-2, -1)]
count = 0

for i in range(len(d)):
    if 0 < d[i][0] + x < 9 and 0 < d[i][1] + y < 9:
        count += 1

print(count)
