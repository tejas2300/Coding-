#include<iostream>
#include <bits/stdc++.h>
using namespace std;

void arrange(int ar[], int n){
    int i=0,j=0;
    for(i=0;i<n;i++){
        if(ar[i]<0){
            if(i!=j)
            swap(ar[i],ar[j]);
            j++;
        }
    }

}

void  printarray(int a[], int n){
    for(int i=0; i<n; i++){
        cout<<" "<<a[i]; 
       
    }
     cout<<""<<endl; 

}

int main(){
    int a[]={1,-3,5,0,-4,-2,9,8};
     int n = sizeof(a) / sizeof(a[0]);

printarray(a,n);
    arrange(a,n);
    printarray(a,n);
}