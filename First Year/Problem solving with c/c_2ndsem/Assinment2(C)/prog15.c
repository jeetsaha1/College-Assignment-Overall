#include<stdio.h>

int main(){
    int x,y,z;
    printf("Enter x,y,z:");
    scanf("%d,%d,%d",&x,&y,&z);
    switch (x)
    {
    case 0:
        printf("%d",y+z);
        break;
    case 1:
        printf("%d",y-z);
        break;
    case 2:
        printf("%d",y*z);
        break;
    case 3:
        printf("%d",y/z);
        break;
    default:
        break;
    }
    return 0;
}