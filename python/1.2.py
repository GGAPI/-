num=input()
numstr="零一二三四五六七八九"
n=""
i=0
while i<len(num):
    n=n+numstr[eval(num[i])]
    i+=1
print(n)
