
def solution(num_list):
    answer = 0
    oddNum = 0
    evenNum = 0
    oddStr = ""
    evenStr = ""
    for i in num_list:
        if i % 2 == 0:
            evenStr += str(i)
        else:
            oddStr += str(i)
    oddNum = int(oddStr)
    evenNum = int(evenStr)
    answer = oddNum + evenNum
    return answer
