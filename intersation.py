a=[1,2,3,4,5]
b=[7,8,4,5,9,1]
c=[]
i=0
while i<len(a):
    if a[i]in b:
        c.append(a[i])
        
    i=i+1
print(c)        