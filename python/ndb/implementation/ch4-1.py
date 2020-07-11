size = map(int, input())
route = ''.join(list(map(str, input().split())))

x = 1
y = 1

for i in range(len(route)):
    if route[i] == 'R' and y != 5:
        y += 1

    if route[i] == 'L' and y != 1:
        y -= 1

    if route[i] == 'U' and x != 1:
        x -= 1

    if route[i] == 'D' and x != 5:
        x += 1

print(x)
print(y)

