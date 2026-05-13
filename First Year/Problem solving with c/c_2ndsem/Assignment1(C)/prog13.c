#include<stdio.h>
int main(){
    int number,res,num1,num2,new_number,remainder2,new_remainder2;
    printf("Enter the number: ");
    scanf("%d",&number);
    num1=number/10;
    remainder2=number%100;
    new_number=number/100;
    new_remainder2=remainder2%10;
    num2=(new_number*10)+(new_remainder2);
    res=num1*num2;
    printf("The result is: %d",res);
    return 0;
}