x = input('Please input an integer of 4 didits meaning the year:')
x = eval(x)
if x%400 == 0 or (x%4 == 0 and not x%100 == 0):
    print('Yes')
else:
    print('No')
