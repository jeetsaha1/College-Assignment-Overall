#include<stdio.h>
int main(){
    int number,remainder,number2,remainder2,res;
    printf("Enter the number: ");
    scanf("%d",&number);
    remainder=number%100;
    number2=remainder/10;
    remainder2=remainder%10;
    res=number2+remainder2;
    printf("%d+%d= %d",number2,remainder2,res);
    return 0;
}