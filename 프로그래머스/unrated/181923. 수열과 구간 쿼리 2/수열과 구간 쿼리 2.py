def solution(arr, queries):
    answer = []
    for i in range(len(queries)):
        arr1 = []
        for j in range(queries[i][0], queries[i][1] + 1):
            if arr[j] > queries[i][2]:
                arr1.append(arr[j])
        arr1.sort()
        if len(arr1) != 0:
            answer.append(arr1[0])
        else:
            answer.append(-1)
    return answer
