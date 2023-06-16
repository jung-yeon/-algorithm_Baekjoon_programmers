def solution(a, d, included):
    answer = 0
    num = a
    for i in range(0, len(included)):
        if included[i]:
            if i == 0:
                answer = a
            else:
                answer += num
        num += d
    return answer

