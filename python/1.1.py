n = int(input())
s = 'Hello World'
m = len(s)
if n == 0:
    print(s)
elif n > 0:
    for i in range(m):
        if i % 2 == 0:
            print(s[i], end='') 
        else:
            print(s[i])
else:
    for i in s:
        print(i)
