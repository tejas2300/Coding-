
#include<iostream>
using namespace std;
void kthlargestElement(int arr[], int size, int k)
{
  int temp;

  for(int i=0;i<k;i++)
   {
     
     for(int j=0;j<size-1;j++)
        {
          if(arr[j] > arr[j+1])
          {
            temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
          }
        }
   }

   cout<< arr[size-k]<<endl;
}
int main()
{
     int size;
     cin>>size;
     int arr[size];
     for(int i=0;i<size;i++){
       cin>>arr[i];
     }
     int k ;
     cin>>k;
     kthlargestElement(arr,size,k);
     return 0;
}