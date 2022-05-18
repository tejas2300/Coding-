arr = [];   
t=int( input())
for i in range(t):
    k=int(input())
    arr.append(k)
 
for i in range(0, len(arr)):  
    for j in range(i+1, len(arr)):  
        if(arr[i] == arr[j]):  
            print(arr[j]); 