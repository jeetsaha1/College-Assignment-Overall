#include<stdio.h>
#include<math.h>

int main(){
    int number,k;
    printf("Enter a number : ");
    scanf("%d", &number);
    double numCopy = number;
    printf("Enter k : ");
    scanf("%d", &k);
    number = (numCopy / pow(10, (k-1)));
    number = number - ((number/10)*10);
    printf("%d", number);
    return 0;
}