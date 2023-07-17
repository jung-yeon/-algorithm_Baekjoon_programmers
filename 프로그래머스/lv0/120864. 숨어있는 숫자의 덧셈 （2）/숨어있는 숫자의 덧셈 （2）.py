# def solution(my_string):
#     answer = 0
#     # boolean isA = False
#     for i in my_string:
#         if(i.isalpha()):
#             my_string = my_string.replace(i," ")
#     my_string = my_string.split()

#     return sum(list(map(int, my_string)))

def solution(my_string):
    answer = 0
    str1 = ''
    for i in my_string:
        if(i.isalpha() == False):
            str1 += i
        else:
            if len(str1) > 0:
                answer += int(str1)
                str1 = ''
    if len(str1) > 0:
        answer += int(str1)
    return answer
   