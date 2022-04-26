# 5
# 8 3 7 9 2
# 3
# 5 7 9

n = int(input())
numbers = sorted(list(map(int, input().split())))
m = int(input())
requests = list(map(int, input().split()))


def binary_search(array, target, start, end):
    if start > end:
        return None
    mid = (start + end) // 2

    while start <= end:
        if array[mid] == target:
            return mid
        elif array[mid] < target:
            return binary_search(array, target, mid + 1, end)
        else:
            return binary_search(array, target, start, mid - 1)


for request in requests:
    result = binary_search(numbers, request, 0, n-1)
    if result:
        print('yes')
    else:
        print('no')
