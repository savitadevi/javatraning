a=[5,4,3,2,1]
for i in range(1,len(a)):
    key=a[i] #4
    j=i # j=1
    while j!=0 and key<a[j-1]: #4<5
        a[j],a[j-1]=a[j-1],a[j]
        j-=1   
        key=a[j]
print(a)            






























