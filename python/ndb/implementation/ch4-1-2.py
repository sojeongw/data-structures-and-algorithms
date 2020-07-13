n = int(input())
hour = range(n+1)
minutes, seconds = range(60), range(60)
count = 0

for h in hour:
    for m in minutes:
        for s in seconds:
            if '3' in str(h) + str(m) + str(s):
                count += 1

print(count)
