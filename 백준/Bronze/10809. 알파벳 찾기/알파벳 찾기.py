a = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']

b = list(map(str, input()))

c = []

for i in range(len(a)):
    if a[i] in b:
        print(b.index(a[i]), end = ' ')
    else:
        print('-1', end = ' ')
