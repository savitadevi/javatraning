"""Given an array of N integers, print the 3 distinct maximum and 3 distinct minimum elements of the array.
Input
Input Format
First line contains N
Second line contains N space separated integers which are elements of the array.
Constraints
0<=N<=100 (Please note that N can be 0 as well)
The values present in the array can be negative as well.
Output
In the first line, print the least 3 values (sorted) present in the array.
In the second line, print the top 3 values (sorted) present in the array.
In case there are not 3 min value, print "Not Possible" (without quotes).
In case there are not 3 max value, print "Not Possible" (without quotes).
So, according to the above statements, if both are not possible, you have to print "Not Possible" twice (once for each)
In the array, if you found out only 2 distinct min and 2 distinct max elements then also printNot Possibletwice [ one for minimum and other for maximum]
Sample Input 1 
8
1 2 3 4 2 1 6 5
Sample Output 1
1 2 3
4 5 6
Sample Input 2
10
-4 -7 -2 -11 -2 -8 0 -122 -66 10
Sample Output 2 
-122 -66 -11
-2 0 10
Sample Input 3
5
0 1 0 1 1
Sample Output 3
Not Possible
Not Possible



Sample Input 4
6
51 0 0 11 -11 23
Sample Output 4
-11 0 11
11 23 51

"""
n=list(map(int,input().split()))
print(n)
a=set(n)
print(a)
l=list(a)
k=l.sort()


i=0
if len(l)<3:
    print("not possible")
else:
    print(l[0:3])
    print(l[-3::])








             

