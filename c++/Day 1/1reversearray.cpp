#include <iostream>
using namespace std;

void reversearray(int a[], int start, int endd)
{

    while (start < endd)
    {
        int temp = a[start];
        a[start] = a[endd];
        a[endd] = temp;
        start++;
        endd--;
    }
}

void remove(int arr[],int n){

}

void printarray(int a[], int b)
{
    for (int i = 0; i < b; i++)
    {
        printf("%d",a[i]);
    }
    cout << endl;
}

int main()
{
    // int arr[] = {1, 2, 3, 4, 5};
    int n ;
cout<<"Enter the array size";
cin>>n;

int arr[n];
cout<<"Enter the array elements :";
for(int i=0;i<n;i++){
    cin>>arr[i];
}


    printarray(arr, n);

    reversearray(arr, 0, n - 1);
  
    cout << "The reversed array is " << endl;
    printarray(arr, n);











}
