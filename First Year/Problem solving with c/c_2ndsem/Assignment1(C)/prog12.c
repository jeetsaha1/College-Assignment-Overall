#include<stdio.h>
int main(){
    int number,remainder,new_remainder,new_remainder2,new2,new,new3,res;
    printf("Enter the number: ");  /*12345*/
    scanf("%d",&number);
    remainder=number%1000;    /*345*/
    new=number/1000;            /*12*/
    new_remainder=remainder%100;    /*45*/
    new2=remainder/100;             /*3*/
    new_remainder2=new_remainder%10;         /*5*/
    new3=new_remainder/10;                   /*4*/
    res=(new*1000)+(new_remainder2*100)+(new3*10)+(new2*1);
    printf("The result is: %d",res);
    return 0;
}