def getSum(n):
    
    sum = 0
    i=0
    while (n != 0):
       
        sum = sum + (n % 10)
        n = n//10
        i=i+1
      
    return sum/i
   
n = int(input())
print(getSum(n))