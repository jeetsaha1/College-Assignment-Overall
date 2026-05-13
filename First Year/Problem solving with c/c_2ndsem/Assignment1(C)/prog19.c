#include<stdio.h>
int main()
{
    int num,last,last1,new,res,new1,new3,new2,last2;                
    printf("Enter the number:");/*12345*/
    scanf("%d",&num);
    last=num-((num/1000*1000));/*345*/
    last1=last-(last/100*100);/*45*/
    new1=last/10;/*34*/
    new2=last1/10;/*4*/
    last2=last1-(last1/10*10);/*5*/
    new=num/1000;/*12*/
    new3=new1/10;/*3*/
    res=(new*1000)+(last2*100)+(new2*10)+new3;
    printf("The the last digit is: %d\n",res);
    return 0;
}