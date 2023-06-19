def solution(my_string, overwrite_string, s):
    answer = ''
    n = len(my_string[s:]) - len(overwrite_string)
    if n > 0:
        answer = (
            str(my_string[:s])
            + str(overwrite_string[:])
            + str(my_string[s+len(overwrite_string):])
        )
    else:
        answer = str(my_string[:s]) + str(overwrite_string[:])
    return answer