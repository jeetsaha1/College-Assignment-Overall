#include<stdio.h>
#include<math.h>
int main(){
    int number,term,res,remainder;
    printf("Enter the number: ");
    scanf("%d",&number);
    printf("Enter the no. of the term from the last: ");
    scanf("%d",&term);
    remainder=number-(number/pow(10,term));
    res=remainder/pow(10,(term-1));
    printf("%d",&res);
    return 0;
}