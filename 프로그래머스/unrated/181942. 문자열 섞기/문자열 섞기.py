def solution(str1, str2):
    answer = ''
    for i in range(len(str1)):
        for j in range(i, i + 1):
            answer += str1[i]
            answer += str2[j]
    return answer