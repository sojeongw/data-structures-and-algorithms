def max_profit(prices):
    if len(prices) < 2:
        return 0

    max_num = 0

    for i in range(len(prices) - 1):
        for price in prices[i + 1:]:

            if price > prices[i]:
                profit = price - prices[i]

                if profit > max_num:
                    max_num = profit

    return max_num


input_value = [7, 1, 5, 3, 6, 4]
print(max_profit(input_value))

# Time Limit Exceeded
# 시간 복잡도: O(n^2)
# loop가 n(n-1)/2 만큼 돌기 때문이다.
# 공간 복잡도: O(1)
# profit과 max_num 두 변수만 쓰였다.
