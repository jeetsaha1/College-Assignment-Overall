#include<stdio.h>
int main(){
    int number,remainder;
    printf("Enter the number: ");
    scanf("%d",&number);
    remainder=number%100;
    printf("The result is: %d",remainder/10);
    return 0;
}