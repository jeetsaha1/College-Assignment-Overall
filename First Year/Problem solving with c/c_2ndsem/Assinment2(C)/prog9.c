#include<stdio.h>
#include<math.h>
int main(){
     int num,temp,sum=0;
     printf("Enter the number: ");
     scanf("%d",&num);
     temp=num;
     while(num!=0){
        sum=sum*10+num%10;
        num/=10;
     }
     if (sum==temp)
        printf("The number is palindrome.");
     else
        printf("Thenumber is not palindrome.");
    return 0;
}