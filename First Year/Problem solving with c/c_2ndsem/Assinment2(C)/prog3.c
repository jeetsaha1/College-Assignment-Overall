#include<stdio.h>
#include<math.h>
int main(){
    int a,b,c,d,e,f;
    printf("Enter the first side: ");
    scanf("%d",&a);
    printf("Enter the second side: ");
    scanf("%d",&b);
    printf("Enter the thied side: ");
    scanf("%d",&c);
    printf("Enter the forth side: ");
    scanf("%d",&d);
    e=sqrt(pow(a,2)+pow(b,2));
    f=sqrt(pow(c,2)+pow(b,2));
    if (a==c && b==d && e==f){
        printf("The polygon is rectangle.");
    }
    else{
        printf("The polygon is not rectangle.");
    }
    return 0;
}