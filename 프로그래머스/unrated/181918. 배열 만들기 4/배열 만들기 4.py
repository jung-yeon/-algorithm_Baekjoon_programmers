def solution(arr):
    stk = []
    i = 0
    while i < len(arr):
        if len(stk) == 0:
            stk.append(arr[i])
            i += 1
        else:
            lastNum = stk[len(stk) - 1]
            if lastNum < arr[i]:
                stk.append(arr[i])
                i += 1
            else:
                stk.pop()
    return stk

