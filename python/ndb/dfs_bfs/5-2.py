from collections import deque

# 큐 구현을 위해 deque 라이브러리를 사용한다.
# deque는 스택과 큐의 장점을 모두 채택한 구조
# 데이터를 넣고 빼는 속도가 리스트에 비해 효율적이고 queue 라이브러리보다 간단하다.
queue = deque()

queue.append(5)
queue.append(2)
queue.append(3)
queue.append(7)
queue.popleft()

queue.append(1)
queue.append(4)
queue.popleft()

print(queue)
queue.reverse()
print(queue)
# queue를 list로 바꾸고 싶으면 list(queue)를 하면 된다.
print(list(queue))
