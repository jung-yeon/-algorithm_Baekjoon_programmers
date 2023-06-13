T = int(input())
lst =[]
for i in range(T):
    count = 0
    student_score = input().split(' ')
    add_score = 0
    for j in range(1, len(student_score)):
        add_score += int(student_score[j])
    score_avg = add_score / int(student_score[0])
    
    for k in range(1, len(student_score)):
        if int(score_avg) < int(student_score[k]):
            count +=1
    lst.append((count/int(student_score[0])) * 100)
    
for x in lst:
    print(f'{x:.3f}%')    

