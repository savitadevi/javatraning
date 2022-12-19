
"binary search isme ye btana h ki 7 kon se index m hai to iski output '6' hoga"

def binarySearch(arr,start,end,number):
    if start<=end:
        mid=start+(end-start)//2
        if arr[mid]==number:
            return mid
        elif arr[mid]>number:
            return binarySearch(arr,start,mid-1,number)
        elif arr[mid]<number:
            return binarySearch(arr,mid,end,number)
    else:
        return "element is not in arry"
arr=[1,2,3,4,5,6,7,8,9,10] 
number=7
print(binarySearch(arr,0,len(arr)-1,number))   