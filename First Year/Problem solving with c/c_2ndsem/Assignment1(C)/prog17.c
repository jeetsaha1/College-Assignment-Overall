#include<stdio.h>
int main()
{
    int num,last,last1,new,res;                
    printf("Enter the number:");
    scanf("%d",&num);
    last=num-((num/100*100));
    last1=num-(num/10*10);
    new=num/100;
    res=(new*10)+last1;
    printf("The the last digit is: %d\n",res);
    return 0;
}