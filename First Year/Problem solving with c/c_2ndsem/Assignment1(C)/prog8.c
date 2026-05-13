#include<stdio.h>
int main(){
    int number,remainder,new,res;
    printf("Enter the number: ");
    scanf("%d",&number);
    remainder=number%10;
    new=number/10;
    res=(new*10)+(remainder*2);
    printf("The result is: %d",res);
    return 0;
}