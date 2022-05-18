#include <stdio.h>
#include <stdlib.h>
int main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
   
    int i,oddSum=0;
    for(i=0; i<n; i++){
        scanf("%d",arr[i]);
        if(arr[i]%2!=0){
      
             oddSum=oddSum+arr[i];
        }
    }
    printf("%d",oddSum);
  
    return 0;
}