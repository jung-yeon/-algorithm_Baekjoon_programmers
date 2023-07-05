def solution(number):
    answer = 0
    lst = list(map(int, str(number)))
    answer = sum(lst)
    answer = answer % 9
    return answer