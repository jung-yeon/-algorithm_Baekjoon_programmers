import numpy as np


def solution(arr, queries):
    queriesArr = np.array(queries)
    rows, columns = queriesArr.shape
    for i in range(rows):
        for j in range(columns - 1):
            temp = arr[queriesArr[i, j]]
            arr[queriesArr[i, j]] = arr[queriesArr[i, j + 1]]
            arr[queriesArr[i, j + 1]] = temp

    answer = []
    answer = arr
    return answer
