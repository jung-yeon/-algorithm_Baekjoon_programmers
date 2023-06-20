import math
def solution(a, b, c):
    answer = 0
    answer = a+b+c
    if a == b or b == c or a == c:
        answer *= math.pow(a,2) + math.pow(b,2) +math.pow(c,2) 
        if a == b and b == c:
            answer *= math.pow(a,3) + math.pow(b,3) +math.pow(c,3) 
            return answer
        else:
            return answer
    else:
        return answer
        
    