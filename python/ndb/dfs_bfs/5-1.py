stack = []

stack.append(5)
stack.append(2)
stack.append(3)
stack.append(7)
# 7이 빠짐
stack.pop()

stack.append(1)
stack.append(4)
# 4가 빠짐
stack.pop()

# 최하단부터 출력
print(stack)
# 최상단부터 출력
print(stack[::-1])

#  파이썬에서 스택은 별도의 라이브러리가 필요없다.
