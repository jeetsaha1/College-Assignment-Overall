#include<stdio.h>
// Exchange last and third last digit
int main(){
    int number = 0;
    printf("Enter a number : ");
    scanf("%d", &number);
    int lastDigit = number - (number/10)*10,
    thirdLastDigit = (number - (number/1000)*1000) ;
    printf("%d, %d", lastDigit, thirdLastDigit);
    
    return 0;
}