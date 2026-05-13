//151

// Maximum and minimum between two numbers using functions.
/*
#include<stdio.h>

int max(int a, int b){
    return (a>b)?a:b;
}
int main(){
    int a,b;
    printf("Enter two numbers respectively: ");
    scanf("%d %d",&a,&b);
    printf("The maximum is %d",max(a,b));
    return 0;
}*/

//152

//Check whether a number is even or odd using functions.
/*
#include<stdio.h>

void check_even_odd(int num){
    if(num%2==0)
        printf("%d is even",num);
    else
        printf("%d is odd",num);
}
int main(){
    int num;
    printf("Enter the number: ");
    scanf("%d",&num);
    check_even_odd(num);
    return 0;
}*/

//153

//. Check whether a number is prime, Armstrong or perfect number using functions.
/*
#include<stdio.h>
#include<math.h>

int isPrime(int n){
    int f=1;
    for (int i = 2; i < n/2; i++)
    {
        if((n%i) == 0){
            return 0;
        }    
    }
    return 1;
}

int power(int n){
    int count = 0;
    while (n> 0)
    {
        n=n/10;
        count ++;
    }
    return count;
}

int armstrong(int n){
    int sum = 0;
    int len = power(n);
    int temp =n;
    while(temp>0){
        int r = temp%10;
        int item =1;
        for (int i = 0; i < len; i++)
        {
            item = item * r;   
        }
        
        sum += item;
        temp /= 10;
    }
    return sum;
}

int main(){
    int num;
    printf("Enter the number: ");
    scanf("%d",&num);

    //prime no.
    if(isPrime(num))
        printf("The no. is prime");
    else
        printf("The no. is not prime");

    //armstrong no.
    if(num == armstrong(num))
        printf("The no. is armstrong");
    else
        printf("The no. is not armstrong");

    //perfect no.
     int sum =0;
    for (int i = 1; i <= num/2; i++)
    {
        if(num%i ==0){
            sum+= i;
        }
    }
    // printf("%d",sum);

    if(sum == num){
        printf("The number is perfect.");
    }
    else    
        printf("The number is not perfect.");
    return 0;
}*/

//154

// Find all prime numbers between the given interval using functions. 
/*
#include<stdio.h>

int Prime(int n){
    int f=1;
    for (int i = 2; i <= n; i++)
    {
        f=1;
        for (int j = 2; j <= i/2; j++)
        {
            if((i%j) == 0){
            f=0;
            break;
        }  
        }
    if(f==1){
        printf("%d ",i);
    }      
    }
    
}

int main(){
    int range;
    printf("Enter the range: ");
    scanf("%d",&range);
    Prime(range);
    return 0;
}*/

//155

// Print all strong numbers between the given interval using functions. 
/*
#include<stdio.h>

int factorial(int n){
    int f = 1;
    for (int i = 1; i <= n; i++)
    {
        f = f*i;
    }
    return f;
    
}

int isStrong(int val){
    int temp =val;
    int s= 0;
    while (val!=0)
    {
        int r = factorial(val%10);
        s += r;
        val /=10;
    }
    if(temp == s){
        return 1;
    }
    else
        return 0;
}

int main(){
    int lower,upper;
    printf("Enter the lower and the uppper no. number repectively :");
    scanf("%d %d",&lower, &upper);
    for (int i = lower; i<=upper; i++)
    {
        if(isStrong(i)){
            printf("%d ",i);
        }
    }
    

    return 0;
}*/

//156

// Armstrong numbers between the given interval using functions. 

/*
#include<stdio.h>

int power(int n){
    int count = 0;
    while (n> 0)
    {
        n=n/10;
        count ++;
    }
    return count;
}

int armstrong(int n){
    int sum = 0;
    int len = power(n);
    int temp =n;
    while(temp>0){
        int r = temp%10;
        int item =1;
        for (int i = 0; i < len; i++)
        {
            item = item * r;   
        }
        
        sum += item;
        temp /= 10;
    }
    return sum;
}

int main(){
    int lower,upper;
    printf("Enter the lower and the uppper no. number repectively :");
    scanf("%d %d",&lower, &upper);
    for (int i = lower; i<=upper; i++)
    {
        if(i == armstrong(i)){
            printf("%d ",i);
        }
    }
    return 0;
}*/

//157

// Print all perfect numbers between the given interval using functions.

/*
#include<stdio.h>

int perfect_no(int num){
     int sum =0;
    for (int i = 1; i <= num/2; i++)
    {
        if(num%i ==0){
            sum+= i;
        }
    }
    // printf("%d",sum);

    if(sum == num){
        return 1;
    }
    else    
        return 0;
}

int main(){
    int lower,upper;
    printf("Enter the lower and the uppper no. number repectively :");
    scanf("%d %d",&lower, &upper);
    for (int i = lower; i<=upper; i++)
    {
        if(perfect_no(i)){
            printf("%d ",i);
        }
    }
    return 0;
}*/

//158

//Find the power of any number using recursion. 
/*
#include<stdio.h>

int power(int base, int exp){
    if(exp == 0)
        return 0;
    else if(exp == 1)
        return base;
    else    
        return base* power(base, exp-1);
}

int main(){
    int base, exp;
    printf("Enter the base and exponenetial repectively: ");
    scanf("%d %d",&base,&exp);
    printf("The result is :%d",power(base,exp));
    return 0;
}*/

//159

// Print all natural numbers between 1 to n using recursion. 
/*
#include<stdio.h>

void natural_no(int n){
    if(n==0)
        return ;
    else
        natural_no(n-1);
        printf("%d ",n);
}

int main(){
    int num;
    printf("Enter the number: ");
    scanf("%d",&num);
    natural_no(num);
    return 0;
}*/

//160

// Print all even or odd numbers in given range using recursion.
/*
#include<stdio.h>

void even(int n){
    if(n<=0)
        return ;
    if(n%2==0){
        even(n-1);
        printf("%d ",n);
    }
    else{
        even(n-1);
    }
}

void odd(int n){
    if(n<=0)
        return ;
    if(n%2!=0){
        odd(n-1);
        printf("%d ",n);
    }
    else{
        odd(n-1);
    }
    
}


int main(){
    int num;
    printf("Enter the number: ");
    scanf("%d",&num);
    even(num);
    printf("\n\n");
    odd(num);
    return 0;
}*/

//161

// Sum of all natural numbers between 1 to n using recursion. 
/*
#include<stdio.h>

int sum(int n){
    int i,s=0;
    for ( i = 1; i <= n; i++)
    {
        s+= i;
    }
    return s;
}

int main(){
    int n;
    printf("Enter the number : ");
    scanf("%d",&n);
    printf("The sum 0f 1 to %d is %d",n,sum(n));
    return 0;
}*/

//162

// Find the sum of all even or odd numbers in a given range using recursion.

/*
#include<stdio.h>

int even(int n){
    static  int s =0;
    if(n<=0)
        return 0 ;
    if(n%2==0){
        even(n-1);
        s += n;
    }
    else{
        even(n-1);
    }
    return s;
}

int odd(int n){
    static int s =0;
    if(n<=0)
        return 0 ;
    if(n%2!=0){
        odd(n-1);
        s += n;
    }
    else{
        odd(n-1);
    }
    return s;
}


int main(){
    int num;
    printf("Enter the number: ");
    scanf("%d",&num);
    printf("The sum of the even no. : %d\n",even(num));
    printf("The sum of the odd no. : %d\n",odd(num));
    return 0;
}*/

//163

//Find reverse of any number using recursion. 
/*
#include<stdio.h>

int reverse(int n){
    static int s = 0;
    if(n == 0){
        return s;
    }
    else{
        s =  s*10+(n%10);
         reverse(n/10);
    }
}

int main(){
     int num;
    printf("Enter the number: ");
    scanf("%d",&num);
    printf("The reversed no. : %d ",reverse(num));
    return 0;
}*/

//164

// Check whether a number is a palindrome or not using recursion.
/*
#include<stdio.h>

int reverse(int n){
    static int s = 0;
    if(n == 0){
        return s;
    }
    else{
        s =  s*10+(n%10);
         reverse(n/10);
    }
}

int main(){
     int num;
    printf("Enter the number: ");
    scanf("%d",&num);
    if(num == reverse(num))
        printf("palindrome");
    else
        printf("Not palindrome");
    return 0;
}*/

//165

//Find the sum of digits of a given number using recursion. 

/*
#include<stdio.h>

int sum_of_digit(int n){
    if(n==0)
        return 0;
    else    
        return (n%10)+sum_of_digit(n/10);
}

int main(){
    int n;
    printf("Enter the number: ");
    scanf("%d",&n);
    int res = sum_of_digit(n);
    printf("The sum of the digit is: %d",res);
    return 0;
}*/

//166

// Find factorial of any number using recursion. 

/*
#include<stdio.h>

int factorial(int n){
    if(n==0 || n==1)
        return 1;
    else    
        return n*factorial(n-1);
}

int main(){
    int n;
    printf("Enter the number: ");
    scanf("%d",&n);
    int res = factorial(n);
    printf("The factorial of the number is: %d",res);
    return 0;
}*/

//167

// Generate nth Fibonacci term using recursion. 
/*
#include<stdio.h>

int fibbonacci(int n){
    if(n == 0 )
        return 0;
    else if(n==1)
        return 1;
    else
        return fibbonacci(n-1) + fibbonacci(n-2);
}

int main(){
    int n;
    printf("Enter the number : ");
    scanf("%d",&n);
    for (int i = 0; i < n; i++)
    {
        printf("%d ",fibbonacci(i));
    }
    
    return 0;
}*/

//168

// Find gcd (HCF) of two numbers using recursion.

/*
#include<stdio.h>

int GCD(int a, int b){
    if(b==0){
        return a;
    }
    else{
        return GCD(b, a%b);
    }
}

int main(){
    int a,b;
    printf("Enter two numbers respectively: ");
    scanf("%d %d",&a,&b);
    int gcd = GCD(a,b);
    printf("The GCD of the two numbers is : %d",gcd);
    return 0;
}*/

//169

// Find lcm of two numbers using recursion. 
/*
#include<stdio.h>

int GCD(int a, int b){
    if(b==0){
        return a;
    }
    else{
        return GCD(b, a%b);
    }
}

int LCM(int a, int b){

    return (a*b)/GCD(a,b);
}

int main(){
    int a,b;
    printf("Enter two numbers respectively: ");
    scanf("%d %d",&a,&b);
    int lcm = LCM(a,b);
    printf("The LCM of the two numbers is : %d",lcm);
    return 0;
}*/

//170

// Display all array elements using recursion.
/*
#include<stdio.h>

void printArr(int arr[], int n){
    if(n==0)
        return;
    else{
        printArr(arr, n-1);
        printf("%d ",arr[n-1]);
    }
}

int main(){
    int n;
    printf("Enter the number of inputs: ");
    scanf("%d",&n);
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter the element %d: ",i+1);
        scanf("%d",&arr[i]);
        
    }
    printArr(arr,n);
    return 0;
}*/

//171

// Find the sum of elements of the array using recursion.

/*
#include<stdio.h>

int sumArr(int arr[], int n){
    if(n==0)
        return n;
    else{
        return arr[n-1] + sumArr(arr,n-1);
    }
}

int main(){
    int n;
    printf("Enter the number of inputs: ");
    scanf("%d",&n);
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter the element %d: ",i+1);
        scanf("%d",&arr[i]);
        
    }
    printf("The sum is: %d",sumArr(arr,n));
    return 0;
}*/

//172

// Find maximum and minimum elements in an array using recursion.

/*
#include<stdio.h>

int max(int a, int b){
    return (a>b)?a:b;
}

int get_max(int arr[],int n){
    int max_rest;
    if(n==1)
        return arr[0];
    else
         max_rest = get_max(arr+1, n-1);
         return(max(arr[0],max_rest));

}

int min(int a, int b){
    return (a<b)?a:b;
}

int get_min(int arr[],int n){
    int min_rest;
    if(n==1)
        return arr[0];
    else
         min_rest = get_min(arr+1, n-1);
         return(min(arr[0],min_rest));

}

int main(){
    
    int n;
    printf("Enter the number of inputs: ");
    scanf("%d",&n);
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter the element %d: ",i+1);
        scanf("%d",&arr[i]);
        
    }
    printf("The maximum element is %d",get_max(arr,n));
    printf("The mimimum element is %d",get_min(arr,n));
    return 0;
}*/

//173

//  Count the total number of notes in a given amount. 
/*
#include<stdio.h>

int main(){
    int amount,count=0;;
    printf("Enter the amount: ");
    scanf("%d",&amount);
    int denomination[]={2000,500,200,100,50,20,10,5,2,1};
    int n = sizeof(denomination)/sizeof(denomination[0]);

    for (int i = 0; i < n; i++)
    {
        if(amount>=denomination[i]){
            int notes = amount/denomination[i];
            amount -= notes*denomination[i];
            count+= notes;
        }
    }
    printf("The no. of notes: %d",count);
    return 0;
}*/

//174

// Insert an Element Desired or Specific Position in an Array. 

/*
#include<stdio.h>

int main(){
    int n;
    printf("Enter the number of inputs: ");
    scanf("%d",&n);
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter the element %d: ",i+1);
        scanf("%d",&arr[i]);
        
    }
    int ele,idx;
    printf("Enter the element:");
    scanf("%d",&ele);
    printf("Enter the index no: ");
    scanf("%d",&idx);
    if(idx>n){
        return 0;
    }
    for (int i = n-1; i>=idx; i--)
    {
        arr[i+1] = arr[i] ;
    }
    arr[idx]= ele;
    n++;
    for (int j = 0; j < n; j++)
    {
        printf("%d ",arr[j]);
    }
    
    
    return 0;
}*/

//175

// Remove Duplicates Items in an Array.
/*
#include<stdio.h>

int main(){
    int n;
    printf("Enter the number of elements : ");
    scanf("%d",&n);

    int arr[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter the element %d : ",i+1);
        scanf("%d",&arr[i]);
    }
    
    //Remove duplicate elements
    for (int i = 0; i < n; i++)
    {
        for (int j = i+1; j < n; j++)
        {
            if (arr[i] == arr[j])
            {
                for (int k = j; k < n; k++)
                {
                    arr[k] = arr[k+1];  //shift the element to the left
                }
                n--;
                j--;
            }
            
        }
        
    }

    for (int l = 0; l < n; l++)
    {
        printf("%d ",arr[l]);
    }
    
    
    return 0;
}*/

//176

// Delete Element from Array at Desired or Specific Position 
/*
#include<stdio.h>

int main(){
    int n;
    printf("Enter the number of inputs: ");
    scanf("%d",&n);
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter the element %d: ",i+1);
        scanf("%d",&arr[i]);
        
    }
    int ele,idx;
    
    printf("Enter the index no: ");
    scanf("%d",&idx);
    if(idx>n){
        return 0;
    }
    for (int i =idx; i<n; i++)
    {
        arr[i] = arr[i+1] ;
    }
    n--;
    for (int j = 0; j < n; j++)
    {
        printf("%d ",arr[j]);
    }
    
    
    return 0;
}*/

//177

//Print “I AM IDIOT” Instead of Your Name Using Array.

//178

// Check String Is Palindrome or Not Using for Loop. 
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100],rev[100];
    printf("Enter the string: ");
    scanf("%s",str);
    int len = strlen(str),f;
    for (int i = 0; i<len; i++)
    {
        if(str[i] == str[len-i-1]){
            f=1;
        }
        else{
            f=0;
            break;
        }
    }
    if(f)
        printf("paindrome");
    else
        printf("Not palindrome");
    rev[len]='\0';
    
    
    return 0;
}*/

//179

// Convert All Input String Simultaneously into Asterisk (*). 
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    scanf("%s",str);
    for (int i = 0; str[i]!='\0'; i++)
    {
        str[i] = '*';
    }
    
    printf("%s",str);
    return 0;
}*/

//180

// Given a maximum of 100 digit numbers as input, find the difference between the sum 
// of odd and even position digits. 
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter the number: ");
    scanf("%s",str);
    int i,even=0,odd=0;
    for ( i = 0; str[i]!='\0'; i++)
    {
        int dig = str[i]-'0';
        if(i%2==0)
            even +=dig;
        else
            odd +=dig;
    }
    printf("The sum of the even position is %d",even);
    printf("The sum of the odd position is %d",odd);
    return 0;
}*/

//181

// Finding Number of times x digit occurs in a given input.
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter a number: ");
    scanf("%s",str);
    int x,i,count=0;
    printf("Enter x: ");
    scanf("%d",&x);
    for ( i = 0; str[i]!='\0'; i++)
    {
        int dig = str[i]-'0';
        if(dig == x){
            count++;
        }
    }
    printf("The element is found %d times.",count);
    return 0;
}*/

//182

// Sort first half in ascending order and second half in descending. 

/*
#include<stdio.h>

void bubble_sort_asscending(int arr[],int start,int end){
    for (int i = start; i < end-1; i++)
    {
        for (int j = start; j < end-i-(i-start); j++)
        {
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        
    }
    
}

void bubble_sort_decending(int arr[],int start,int end){
    for (int i = start; i < end-1; i++)
    {
        for (int j = start; j < end-i-(i-start); j++)
        {
            if(arr[j]<arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        
    }
    
}

int main(){
    int n;
    printf("Enter the number of inputs: ");
    scanf("%d",&n);
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter the element %d: ",i+1);
        scanf("%d",&arr[i]);
        
    }
    int d = n/2;
    bubble_sort_asscending(arr,0,d);
    bubble_sort_decending(arr,d,n);
    for (int i = 0; i < n; i++)
    {
        printf("%d ",arr[i]);
    }
    
    return 0;
}*/

//183

// Finding the Longest Palindrome in an Array. 

//184

// Balanced Parenthesis Problem.

//185

//Find the “Kth” max and min element of an array. 
/*
#include<stdio.h>

void bubble_sort(int arr[], int n){
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n-i-1; j++)
        {
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j] = temp;
            }
        }
        
    }
    
}

int main(){
    int n;
    printf("Enter the number of inputs: ");
    scanf("%d",&n);
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter the element %d: ",i+1);
        scanf("%d",&arr[i]);
        
    }
    bubble_sort(arr,n);
    int k;
    printf("Enter the index K: ");
    scanf("%d",&k);
    printf("The minimum value of kth index is %d\n",arr[k-1]);
    printf("The maximum value of kth index is %d\n",arr[n-k]);
    return 0;
}*/

