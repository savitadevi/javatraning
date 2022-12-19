
a=[1,2,3,2,1,4,5]
i=0
b=[]
c=[]
while i<len(a):
    if a[i] not in b:
        b.append(a[i])
    else:
        c.append(a[i])

    i=i+1
print(c)        

     