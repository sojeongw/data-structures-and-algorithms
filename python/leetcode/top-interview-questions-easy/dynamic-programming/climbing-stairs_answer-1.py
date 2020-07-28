# brute force

def climb_stairs(n):
    return climb(0, n)


def climb(i, n):
    if i > n:
        return 0

    if i == n:
        return 1

    return climb(i + 1, n) + climb(i + 2, n)


input_value = 2
print(climb_stairs(input_value))
