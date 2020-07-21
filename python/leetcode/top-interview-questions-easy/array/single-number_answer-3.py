# 해시 테이블
# nums를 순회하면서 key-value 쌍을 만든다.
# 오직 하나인 값을 리턴한다.
from collections import defaultdict


def single_number(nums):
    # 빈 값으로 해시테이블 초기화
    hash_table = defaultdict(int)

    # defaultdict(<class 'int'>, {})
    print(hash_table)

    # 각 값이 인덱스가 되어 해당하는 값이 있으면 그 칸이 count가 쌓인다.
    for i in nums:
        hash_table[i] += 1

    # defaultdict(<class 'int'>, {1: 2, 2: 2, 4: 1})
    print(hash_table)

    for i in hash_table:
        # 해당하는 칸에 count된 게 1밖에 없으면 리턴한다.
        if hash_table[i] == 1:
            return i


numbers = [1, 2, 1, 2, 4]
print(single_number(numbers))

# 시간 복잡도: O(n+1) = O(n)
# for loop를 n번만큼 순회하고 + 해시테이블에서 pop으로 가져오는 1
# 공간 복잡도: O(n)
# 해시 테이블은 nums의 요소만큼 공간을 필요로 한다.
