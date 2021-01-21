def recursive_function(i):
    # 100번째 출력했을 때 종료한다.
    if i == 100:
        return

    print(i, '번째 재귀 함수에서 ', i + 1, '번째 재귀 함수를 호출합니다.')
    recursive_function(i + 1)
    print(i, '번째 재귀 함수를 호출합니다.')


recursive_function(1)

# 재귀 함수는 내부적으로 스택을 사용한다.
# 함수를 계속 호출했을 때 가장 마지막에 호출한 함수가 먼저 수행을 끝내야 그 앞의 함수 호출이 종료되기 때문이다.
# 따라서 DFS처럼 스택을 사용한 알고리즘은 재귀를 이용해 간편하게 구현할 수 있다.
