def recursion(a):
    if a==1:
        return 1
    else:
        return a* recursion(a-1) 
print(recursion(5))    
"op (5,4,3,2,1)"




  


"sum of arry o/p 10"
def rec(arr):
    if len(arr)==0:
        return 0
    else:
        return arr[0] +rec(arr[1:len(arr)]) 

arr=[1,2,3,4]
print(rec(arr))  




"revrse o/p dcba"
def rec(str1):   
   if len(str1)==0:
      return ""
   else :
    return str1[len(str1)-1]+rec(str1[0:len(str1)-1])
str1="abcd"
print(rec(str1)) 




"power of number"
def rec(a,b):
    if b==0:
        return 1
    else:
        return a*rec(a,b-1)
a=int(input("enter your number"))
b=int(input("enter your number"))
print(rec(a,b))  




"6 savita k pehle k saare name print krna o/p ridhi shabnam diksha amla  shubhangi manory ujala"
def res(arr):
    if arr[0]=="savita":
        return ''
    else:
        return arr[0] +' '+ res(arr[1:len(arr)])    
arr=["ridhi","shabnam","diksha","amla","shubhangi","manory","ujala","savita","anzum","neha"]        
  
print(res(arr)) 
# 




"fectoriyal o/p 120"
def fec(n):
    if n==1:
        return 1
    else:
        return n* (fec (n-1))  
print(fec(5))          


"buble sort assending to disending o/p [1,3,5,13,14,18]"
arr=[1,18,14,13,3,5]
n=6
def rec(arr,n):
    for i in range(0,n-1):
        if arr[i]>arr[i+1]:
            arr[i],arr[i+1]=arr[i+1],arr[i]
    if n>0:
        rec(arr,n-1)
rec(arr,n)
print(arr)                



" find sb arry"
def rec(arr,i,j):
    if j==n:
        return sub[0]
    elif i>j:
        return rec(arr,0,j+1)
    else: 
        sub.append(arr[i:j+1])
        return rec(arr,i+1,j)   
arr=[1,2,3]
n=len(arr)
sub=[]
rec(arr,0,0)
print(sub)

"inserton  short   5 1 2 3 4      5 1 2 3 4   1 5 2 3 4    1 2 3 5 4   1 2 3 4 5    it will run left to right"










"selection sort"
def selection(arr,result):
    if len (arr)==0:
        return " "
    else:
        j=arr.index(min(arr))
        arr[0] ,arr[j]=  arr[j],arr[0]
        result.append(arr[0])
        return selection(arr[1:],result)
arr=[2,2,4,1,3]
result=[]
selection(arr,result)
print(result)   
      





"continue subarray:-"
def rec_subarray(arr,start,end):
    if end==len(arr):
        return arr[0]
    elif start>end:
        return rec_subarray(arr,0,end+1)
    else:
        sub.append(arr[start:end+1])
        return rec_subarray(arr,start+1,end)
arr =[1,2,3,4]
sub=[]
rec_subarray(arr,0,0)
print(sub)           




        













