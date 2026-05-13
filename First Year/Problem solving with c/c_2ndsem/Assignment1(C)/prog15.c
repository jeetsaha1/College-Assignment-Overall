#include<stdio.h>
int main()
{
    int num,last;                //3
    printf("Enter the number:");
    scanf("%d",&num);
    last=num-((num/10*10));
    printf("The the last digit is: %d\n",last);
    return 0;
}