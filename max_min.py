"""Given an array of integers, every element appears thrice except for one which occurs once. Find that element that does not appear thrice.

Note: Your algorithm should have a linear runtime complexity and without using extra memory
Input
Input Format:
The first line of input will contain an integer T, denoting the number of test cases.
The first line of each test case will contain an integer N, denoting the size of the array
The next line will contain N integers denoting the array elements, A[0], A[1], A[2].....A[N-1]

Constraints:
1<= T <=10
1<= N <=5*10^5
1<= A[i] <= 10^9

Output
For each test case, output the element which does not occur thrice in the array, in a new line.
Sample Input 1 
1
7
1 3 1 3 1 2 3
Sample Output 1
2
Hint
In Sample 1:

# """
# i=[1 ,3 ,1 ,3 ,1 ,2 ,3]
# b={1:3,2:1,3:3}

# for i in b:
#     if b[i]==1:
#         print(i)



# =================================================

a=[31,34,71,82,81,91,63,69,98]
b=[0,0,0,0,0,0,0,0,0]
for i in a:
    b[i%10]+=1
print(b)
    






