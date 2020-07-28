# 최대로 낼 수 있는 이익에서 제일 싼 값을 뺀 값이 나오면 팔아야 할 시점이다.
import sys


def max_profit(prices):
    minimum_price = sys.maxsize
    maximum_profit = 0

    for i in range(len(prices)):
        # 제일 싼 가격을 찾는다.
        if prices[i] < minimum_price:
            minimum_price = prices[i]

        # 루프를 돌면서 해당 값이 제일 싼 값을 뺐을 때 이익이 최대인지 확인한다.
        # 이때 자기 자신이 제일 싼 값이면서 뺄 수는 없으므로 elif를 사용한다.
        elif prices[i] - minimum_price > maximum_profit:
            maximum_profit = prices[i] - minimum_price

    return maximum_profit


input_value = [7, 1, 5, 3, 6, 4]
print(max_profit(input_value))

# runtime: 1028ms
# memory: 22.6mb
# 시간 복잡도: O(n)
# 공간 복잡도: O(1)
# 두 개의 변수만 사용되었다.
