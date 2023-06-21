def solution(n, control):
    answer = 0
    dict = {"w":1,"s":-1,"d":10,"a":-10}
    for i in control:
        n+=dict[i]  
    answer = n
    return answer