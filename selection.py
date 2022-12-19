a=[5,4,3,2,1,2]
for i in range(len(a)):
    min=i
    for j in range(i+1,len(a)):
        if a[min]>a[j]:
            min=j
    temp=a[i] 
    a[i]=a[min]
    a[min]=temp 
print(a)          





            
            

