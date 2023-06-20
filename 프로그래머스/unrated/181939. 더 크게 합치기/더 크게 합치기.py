def solution(a, b):
    answer = 0
    num1 = str(a) + str(b)
    num1 = int(num1)
    num2 = str(b) + str(a)
    num2 = int(num2)
    
    if num1 > num2:
        answer = num1
    else:
        answer = num2
    return answer