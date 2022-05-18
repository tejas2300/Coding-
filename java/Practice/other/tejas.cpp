#include <iostream>
#include <conio.h>
#include <stdio.h>
using namespace std;
int main()
{
    char str[100];
    int i;
    int symbol=0;
    gets(str);
    for(i=0; str[i] != '\0'; i++){
        //check for Aphabets
            if((str[i]>='A' && str[i]<='Z') || (str[i]>='a' && str[i]<='z')) {
                continue;
    }else if(str[i]>='0' && str[i]<='9') {
                continue;
    }
    else if(str[i]==' '){
                continue;
    }
    else{
        symbol++;
    }
    }

    cout<<symbol;
    getch();
    return 0;
}