a = int(input())
b = int(input())
c = int(input())
r = (a+b+abs(a-b))/2
fr = (r+c+abs(r-c))/2
print('{} eh o maior '.format(fr))
