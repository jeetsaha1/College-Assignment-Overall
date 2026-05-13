#include<stdio.h>
int main()
{
    int n1,n2,a,b,c,d,e;
    printf("Enter the number: ");
    scanf("%d",&n1);
    printf("Enter the number: ");
    scanf("%d",&n2);                 //7
    a=n1%10;
    b=n2%10;
    c=n1/10;
    d=n2/10;
    e=((c*10)+b)*((d*10)+a);
    printf("The result is: %d",e);

    return 0;
}