x=input()
x=eval(x)
if x<0 :
    print(0)
elif (x>=0)&(x<5):
    print(x)
elif (x>=5)&(x<10):
    print(3*x-5)
elif (x>=10)&(x<20):
    print(0.5*x-2)
elif x>=20:
    print(0)
