#include<iostream>
using namespace std;

struct Pairr{
    int min ;
    int max ;
};

struct Pairr getpair(int a[], int b){
    struct Pairr d;
    int i;

    if(b==1){
        d.max=a[0];
        d.min=a[0];
        return d;
    }
    if(a[0]>a[1]){
        d.max=a[0];
        d.min=a[1];
    }else{

        d.max=a[1];
        d.min=a[0];
    }
    for(i=2;i<b;i++){
        if(a[i]>d.max){
            d.max=a[i];
        }else if(a[i]<d.min){
            d.min=a[i];
        }

    }
     return d;



};

int main(){
    int arr[]={1,49,3,6,0,5,2,98,23,0,200,200};
    int asize=10;

struct Pairr a = getpair(arr,asize);

cout<<"maximum is "<<a.max<<endl;
cout<<"minimum is "<<a.min;


}
