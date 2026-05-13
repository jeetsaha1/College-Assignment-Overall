#include<stdio.h>
int main()
{
    int num,last,last1,new,res,new1;                
    printf("Enter the number:");
    scanf("%d",&num);
    last=num-((num/100*100));
    last1=last-(last/10*10);
    new1=last/10;
    new=num/100;
    res=(new*100)+(last1*10)+new1;
    printf("The the last digit is: %d\n",res);
    return 0;
}