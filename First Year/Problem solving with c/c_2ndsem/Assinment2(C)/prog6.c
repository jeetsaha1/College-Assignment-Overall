#include<stdio.h>
#include<math.h>
int main(){
    int number;
    printf("Enter the number:");
    scanf("%d",&number);
    if(number>91 && number <=100){
        printf("Grade:O");
    }
    else if(number>81 && number <=90){
        printf("Grade:E");
    }
    else if(number>71 && number <=80){
        printf("Grade:A");
    }
    else if(number>61 && number <=70){
        printf("Grade:B");
    }
    else if(number>51 && number <=60){
        printf("Grade:C");
    }
    else if(number <50){
        printf("Grade:F");
    }
    else{
        printf("You give wrong input");
    }
    return 0;
}