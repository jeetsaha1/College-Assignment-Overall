#include<stdio.h>
#include<math.h>
int main(){
     int x1,x2,y1,y2;
    float distance;
    printf("Enter the x1: ");
    scanf("%d",&x1);
    printf("Enter the x2: ");
    scanf("%d",&x2);
    printf("Enter the y1: ");
    scanf("%d",&y1);
    printf("Enter the y2: ");
    scanf("%d",&y2);
    distance=sqrt(pow((x1-x2),2)+pow((y1-y2),2));
    printf("The distance is: %f",distance);
    return 0;
}