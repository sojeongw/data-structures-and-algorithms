# linear time solution
import collections


def first_unique_char(s):
    # 내 코드에서 해시 테이블에 넣었던 작업을 이 함수 하나로 끝낼 수 있었다!
    # Counter({'e': 4, 'l': 2, 'o': 2, 'v': 1, 't': 1, 'c': 1, 'd': 1})
    # 동일한 값이 몇 개인지 체크해준다. 갯수가 많은 것부터 출력한다.
    count = collections.Counter(s)

    for idx, ch in enumerate(s):
        if count[ch] == 1:
            return idx

    return -1


input_strings = "loveleetcode"
print(first_unique_char(input_strings))
