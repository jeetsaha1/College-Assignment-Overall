#include<stdio.h>
#include<math.h>
int main(){
    int number;
    float degree;
    float pi= 3.14;
    printf("Enter the number:");
    scanf("%d",&number);
    degree=(180*number)/pi;
    printf("%f",sin(degree));
    printf("%f",cos(degree));
    printf("%f",tan(degree));
    printf("%f",log(degree));
    return 0;

}


//  int a,b,c;
//     float s,area;
//     printf("Enter the first side: ");
//     scanf("%d",&a);
//     printf("Enter the second side: ");
//     scanf("%d",&b);
//     printf("Enter the third side: ");
//     scanf("%d",&c);
//     s=(a+b+c)/2;
//     area=sqrt(s*(s-a)*(s-b)*(s-c));
//     printf("The area is:%f",area);


//  int x1,x2,y1,y2;
//     float distance;
//     printf("Enter the x1: ");
//     scanf("%d",&x1);
//     printf("Enter the x2: ");
//     scanf("%d",&x2);
//     printf("Enter the y1: ");
//     scanf("%d",&y1);
//     printf("Enter the y2: ");
//     scanf("%d",&y2);
//     distance=sqrt(pow((x1-x2),2)+pow((y1-y2),2));
//     printf("The distance is: %f",distance);


//  int a,b,c,d,e,f;
//     printf("Enter the first side: ");
//     scanf("%d",&a);
//     printf("Enter the second side: ");
//     scanf("%d",&b);
//     printf("Enter the thied side: ");
//     scanf("%d",&c);
//     printf("Enter the forth side: ");
//     scanf("%d",&d);
//     e=sqrt(pow(a,2)+pow(b,2));
//     f=sqrt(pow(c,2)+pow(b,2));
//     if (a==c && b==d && e==f){
//         printf("The polygon is rectangle.");
//     }
//     else{
//         printf("The polygon is not rectangle.");
//     }

// int year;
//     printf("Enter the year:");
//     scanf("%d",&year);
//     if(year%4==0 && year%100!=0 ||year%400==0 ){
//         printf("Leap year");
//     }
//     else{
//         printf("Not leap year");
//     }

// int number;
//     printf("Enter the number:");
//     scanf("%d",&number);
//     if(number>91 && number <=100){
//         printf("Grade:O");
//     }
//     else if(number>81 && number <=90){
//         printf("Grade:E");
//     }
//     else if(number>71 && number <=80){
//         printf("Grade:A");
//     }
//     else if(number>61 && number <=70){
//         printf("Grade:B");
//     }
//     else if(number>51 && number <=60){
//         printf("Grade:C");
//     }
//     else if(number <50){
//         printf("Grade:F");
//     }
//     else{
//         printf("You give wrong input");
//     }
    

    // int x;
    // double y;
    // printf("Enter:");
    // scanf("%d",&x);
    // switch(x)
    // {
    // case 0:
       
    // case 1:
       
    // case 2:
    //     y=(x+1)/4.0;
    //     break;
    // case 3:
    //     y=(pow(x,2)+5)/6.0;
    //     break;
    // case 4:
    //     y=3*x;
    //     break;
    // default:
    //     y=1;
    //     break;
    // }
    // printf("%lf",y);

    // int a,b,c,d;
    // printf("Enter the sides:");
    // scanf("%d%d%d",&a,&b,&c);
    // a=a*a;
    // b=b*b;
    // c=c*c;
    // if(sqrt(a+b)==c ||sqrt(c+b)==a ||sqrt(a+c)==b){
    //     printf("It is 90 degree");
    // }
    // else{
    //     printf("no");
    // }