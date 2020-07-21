# 모든 값을 순회해서 이미 있으면 지우고 아니면 추가한다.

def single_number(nums):
    no_duplicate_list = []

    for i in nums:
        if i not in no_duplicate_list:
            no_duplicate_list.append(i)
        else:
            no_duplicate_list.remove(i)

    # 맨 마지막 요소를 리턴한다.
    return no_duplicate_list.pop()


numbers = [1, 2, 1, 2, 4]
print(single_number(numbers))
