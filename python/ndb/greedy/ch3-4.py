n = 23
k = 2
count = 0

while n != 1:
    if n % k == 0:
        n /= k
        count += 1
    else:
        n = (n-1) / k
        count += 2

print(count)