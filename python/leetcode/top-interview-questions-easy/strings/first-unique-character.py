from collections import defaultdict


def first_unique_char(s):
    hash_table = defaultdict(int)
    length = len(s)

    for i in range(length):
        hash_table[s[i]] += 1

    for i in hash_table:
        value = hash_table[i]
        if value == 1:
            return s.index(i)

    return -1


input_strings = "loveleetcode"
print(first_unique_char(input_strings))

# runtime = 108ms
# memory = 14.4MB
