def triangle():
    N = [1]
    while True:
        yield N    
        N.append(0) 
        N = [N[i]+N[i-1] for i in range(len(N))]
 
def print_triangle(x):
    a = 0
    for t in triangle():  
        print(t)
        a += 1
        if a ==x:
             break
print_triangle(10) 

