def solution(my_string):
    answer = []
    for i in range(65,91):
        cnt = 0
        for j in range(len(my_string)):
            if my_string[j] == chr(i):
                cnt +=1 
        answer.append(cnt)
    for i in range(97,123):
        cnt = 0
        for j in range(len(my_string)):
            if my_string[j] == chr(i):
                cnt +=1 
        answer.append(cnt)
    return answer