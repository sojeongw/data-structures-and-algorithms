import re

# 타임 아웃으로 통과하지 못함

# s = "(name)is(age)yearsold"
# knowledge = [["name", "bob"], ["age", "two"]]
# s = "hi(name)"
# knowledge = [["a", "b"]]
# s = "(zib)"
# knowledge = [["qfviuwjo","w"],["kppdajmk","n"],["zib","c"],["ztfljcff","i"],["aoayyihi","d"]]
# s = "(fy)(kj)(ege)r"
# knowledge = [["uxhhkpvp", "h"], ["nriroroa", "m"], ["wvhiycvo", "z"], ["qsmfeing", "s"], ["hbcyqulf", "q"],
#              ["xwgfjnrf", "b"], ["kfipazun", "s"], ["wnkrtxui", "u"], ["abwlsese", "e"], ["iimsmftc", "h"],
#              ["pafqkquo", "v"], ["kj", "tzv"], ["fwwxotcd", "t"], ["yzgjjwjr", "l"]]
s = "(mv)(ws)(w)(ys)(rthi)(vv)(ni)(mipd)v"
knowledge = [["ni", "k"], ["ws", "p"], ["w", "hdc"], ["vv", "qlgh"], ["mipd", "btfe"], ["mv", "fr"], ["ys", "n"],
             ["rthi", "ft"]]

knowledge_map = dict(knowledge)
bracket_strings = re.findall(r'\(([^)]+)\)', s)

for bracket_string in bracket_strings:
    keys = list(knowledge_map.keys())
    if bracket_string in keys:
        value = knowledge_map.get(bracket_string)
        s = re.sub(r'\(([' + bracket_string + r')]+)\)', value, s, 1)
    else:
        s = re.sub(r'\(([' + bracket_string + r')]+)\)', "?", s, 1)

print(s)
