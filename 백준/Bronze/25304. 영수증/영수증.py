money = int(input())
N = int(input())
result = 0
for i in range(N):
    lst = []
    lst = list(map(int, input().split(" ")))
    sum = lst[0] * lst[1]
    result += sum
if money == result:
    print("Yes")
else:
    print("No")