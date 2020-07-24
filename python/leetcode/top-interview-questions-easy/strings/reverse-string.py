def reverse_string(s):
    n = len(s)

    for i in range(n // 2):
        back = n - i - 1
        s[i], s[back] = s[back], s[i]

    return s


input_strings = ["H", "a", "n", "n", "a", "h"]
print(reverse_string(input_strings))