# 이미 정렬된 배열이니까 i가 앞, j가 뒤를 가리키는 두 포인터로 해결한다.
# nums[i]와 nums[j]가 같을 때까지 j를 계속 증가시켜서 중복값을 건너뛴다.
# nums[i] != nums[j]가 되면 j 증가를 멈추고 i+1의 자리에 j값을 넣는다.
# j가 배열 끝에 도착할 때까지 반복한다.

def remove_duplicates(numbers) -> int:
    if len(numbers) == 0:
        return 0

    i = 0

    for j in range(len(numbers)):
        if numbers[i] != numbers[j]:
            i += 1
            numbers[i] = numbers[j]

    return i + 1


nums = [1, 1, 2]
length = remove_duplicates(nums)

print(length)
