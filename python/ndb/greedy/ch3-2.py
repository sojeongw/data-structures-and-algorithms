n = 5
m = 8
k = 3
nums = [2, 4, 5, 4, 6]

result = 0
count = 0
nums.sort(reverse=True)

for i in range(m):
    if count == 3:
        result += nums[1]
        count = 0
    else:
        result += nums[0]
        count += 1

print(result)
