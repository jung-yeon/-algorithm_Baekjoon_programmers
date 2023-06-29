def solution(arr, queries):
    answer = []
    for i in range(len(queries)):
        arr1 = []
        for j in range(queries[i][0], queries[i][1] + 1):
            if j % queries[i][2] == 0:
                arr[j]+=1
    answer = arr
    return answer

