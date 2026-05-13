#include<stdio.h>
int main(){
    int number,remainder,new_remainder,new2,new,res;
    printf("Enter the number: ");
    scanf("%d",&number);
    remainder=number%100;
    new=number/100;
    new_remainder=remainder%10;
    new2=remainder/10;
    res=(new*100)+(new_remainder*10)+(new2*1);
    printf("The result is: %d",res);
    return 0;
}