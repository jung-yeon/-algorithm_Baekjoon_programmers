N = int(input())
score = list(map(int, input().split(" ")))
max = score[0]
for i in range(1, N):
    if max < score[i]:
        max = score[i]
for i in range(N):
    score[i] = (score[i] / max) * 100

avg = 0
for i in range(N):
    avg += score[i]
avg = avg / N
print(avg)
