a=list(map(int,input().split()))
c=1
n=len(a)

for i in range(len(a)-1):
   
    if i==1:
        c=c+1
if c>n//2:
    print(i-1)
else:
    print("-1")        



       





