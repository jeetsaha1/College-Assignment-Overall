#include<stdio.h>

int main(){
    float income,income_tax,exceed;
    printf("Enter your income: ");
    scanf("%f",&income);
    if(income<5000)
        printf("No income tax is to be paid.");
    else if(income>5000 && income<6000){
        exceed=income-5000;
        income_tax=exceed*10/100;
    }
    else if(income>6000 && income<15000){
        exceed=income-6000;
        income_tax=(exceed*20/100)+100;
    }
    else if(income>15000){
        exceed=income-15000;
        income_tax=(exceed*30/100)+1900;
    }
    else{
        printf("You give wrong input.");
    }
    printf("\nThe income tax is %f",income_tax);
    return 0;
}