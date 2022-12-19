a=[5,4,2,1,3]
for i in range (len(a)):
    for j in range (len(a)-1):
        if a[i]<a[j]:
            temp=a[i]
            a[i]=a[j]
            # print(a)
            a[j]=temp
print(a)  


# =====================================

