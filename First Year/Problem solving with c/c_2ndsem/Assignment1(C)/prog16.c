#include<stdio.h>
int main()
{
    int num,last,last1;                
    printf("Enter the number:");
    scanf("%d",&num);
    last=num-((num/100*100));
    last1=last/10;
    printf("The the last digit is: %d\n",last1);
    return 0;
}