str = input()
result = ""
for i in str:
    a = i
    if a == i.upper():
        result += a.lower()
    else:
        result += a.upper()
print(result)
