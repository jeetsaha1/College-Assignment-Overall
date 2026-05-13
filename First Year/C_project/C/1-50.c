															// 1
//1. 1, 2, 1, 3, 2, 5, 3, 7, 5, 11, 8, 13, 13, 17….   find Nth Term.
/*
#include<stdio.h>

int fibbonacci(int val){
    int a = 1,b=1,c;
    int i =3;
    while(i<=val){
        c=a+b;
        a=b;
        b=c;
        i++;
    }
    return b;
}

int isPrime(int n){
    int f=1;
    for (int i = 2; i < n; i++)
    {
        if(n%i == 0){
            f = 0;
            break;
        }   
    }
    return f;
}

int getPrime(int val){
    int count = 0,num = 2;
    while(1){
        if(isPrime(num)){
            count++;
            if(count == val){
                return num;
            }
        }
        num++;
    }
}

int main(){
    int term;
    printf("Enter the number of term: ");
    scanf("%d",&term);
    for (int i = 0; i < term; i++)
    {
        if(i%2 == 0)
            printf("%d ",fibbonacci((i/2)+1));
        else
            printf("%d ",getPrime((i/2)+1));
    }
    
    return 0;
}*/


															//2
															
//0,0,2,1,4,2,6,3,8,4,10,5,12,6,14,7,16, 8... find Nth Term. 
/*
#include<stdio.h>

int even(int val){
    return val;
}

int natural_num(int val){
    return val/2;
}

int main(){
    int term,i;
    printf("Enter the number of term :");
    scanf("%d",&term);

    for (i = 0; i < term; i++)
    {
        if(i%2 ==0){
            printf("%d ",even(i));
        }
        else{
            printf("%d ",natural_num(i));
        }
    }
    
    return 0;
}*/

//3

// Given a maximum of four digits to the base 17 (10 – A, 11 – B, 12 – C, 13 – D … 16 – G} as input, output its decimal value. 
//  input – 1A 
// Expected Output – 27 

#include<stdio.h>
#include<string.h>
#include<ctype.h>
/*
int char_to_int(char ch){
    if(isdigit(ch)){
        return ch-'0';
    }
    else if(isalpha(ch)){
        return toupper(ch) - 'A' +10;
    }
    else{
        return -1;
    }
}

int base17_to_dec(char str[]){
    int val,result=0,i;
    int len = strlen(str);
    for (i = 0; i < len; i++)
    {
        val = char_to_int(str[i]);
        result = result*17 + val;      
    }
    return result;
}


int main(){
    char base17_dec[4];
    printf("Enter the hexa decimal number upto 4 digits :");
    scanf("%s",base17_dec);

    int dec = base17_to_dec(base17_dec);
    printf("The answer is %d",dec);
    return 0;
}*/


//4

// Replace all 0’s with 1 in a given integer.
/*
#include<stdio.h>

int main(){
    int num;
    printf("Enter the number : ");
    scanf("%d",&num);
    int new_dig =0,place=1;
    while (num!=0)
    {
        int r = num%10;
        if(r == 0){
            r = 1;
        }
        new_dig = new_dig + r*place;
        place*= 10;
        num /=10;
    }

    printf("%d",new_dig);
    
    return 0;
}*/

//5	


//Write a c program to check given number is perfect number or not. 
/*
#include<stdio.h>

int main(){
    int num;
    printf("Enter the number :");
    scanf("%d",&num);
    int sum =0,i;
    for ( i = 1; i <= num/2; i++)
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

//6


//Write a c program to check given number is Armstrong number or not.
/*
#include<stdio.h>
#include<math.h>

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
    int n =153;
    if(n == armstrong(n))
        printf("armstrong");
    else
        printf("not armstrong");
    return 0;
}*/


//7


// Write a c program to check given number is palindrome number or not.
/*
#include<stdio.h>
#include<string.h>
int main(){
    char str[100],rev[100];
    printf("Enter the string : ");
    scanf("%s",str);
    int len = strlen(str);
    for (int i = 0; i < len; i++)
    {
        rev[i] = str[len-i-1];
    }
    rev[len] = '\0';

    if (strcmp(rev,str)==0)
    {
        printf("palindrome");
    }
    else    
        printf("not palindrome");
    
    
    return 0;
}*/


//8


// Write a c program to check given number is palindrome number or not.
/*
#include<stdio.h>

int main(){
    int num;
    printf("Enter the number :");
    scanf("%d",&num);
    int temp = num;
    int sum =0;
    while(temp>0){
        int r = temp%10;
        sum = sum*10 + r;
        temp /= 10;
    }

    if(sum == num){
        printf("palindrome");
    }
    else
        printf("Not palindrome");
    return 0;
}*/


//9


//Write a c program to print Fibonacci series of given range.
/*
#include<stdio.h>

void fibbonacci(int n){
    int a =0, b=1,i=0,c;
    printf("%d %d ",a,b);
    while(i<=n){
        c = a+b;
        printf("%d ",c);
        a=b;
        b=c;
        i++;
    }
}

int main(){
    int num;
    printf("Enter the number : ");
    scanf("%d",&num);
    fibbonacci(num);
}*/

//10

//Write a c program to get factorial of given number.
/*
#include<stdio.h>
int factorial(int n){
    int f =1;
    for (int i = 1; i <= n; i++)
    {
        f*= i;
    }
    return f;
    
}

int main(){
    int num;
    printf("Enter the number :");
    scanf("%d",&num);
    printf("%d",factorial(num));
}*/

//11				

//Write a c program to print ASCII value of all characters.
/*
#include<stdio.h>

int main(){
    for (int i = 0; i < 127; i++)
    {
        printf("%d : %c\n",i,i);
    }
    
    return 0;
}*/

//12

// C program to print hello world without using semicolon.
/*
#include<stdio.h>

int main(){
    if(printf("Hello world"))
    return 0;
}*/


//13

// Write a c program to reverse any number. 
/*
#include<stdio.h>

int main(){
    int num;
    printf("Enter the number : ");
    scanf("%d",&num);
    int new = 0;
    while (num>0)
    {
        int r = num%10;
        new = new*10 + r;
        num = num/10;
    }
    printf("%d",new);
    
    return 0;
}*/


//14

//  Write a c program to find out sum of digit of given number

/*
#include<stdio.h>

int main(){
    int num;
    printf("Enter the number : ");
    scanf("%d",&num);
    int new = 0;
    while (num>0)
    {
        int r = num%10;
        new = new + r;
        num = num/10;
    }
    printf("%d",new);
    
    return 0;
}*/

//15


//Write a c program to find out power of number. 
/*
#include<stdio.h>

int main(){
    int base,exp;
    printf("Enter the base and its exponent:");
    scanf("%d %d",&base,&exp);
    int res =1;
    for (int i = 0; i < exp; i++)
    {
        res = res*base;
    }
    printf("%d",res);
    return 0;
}*/


//16

// Write a c program to add two numbers without using addition operator. 
/*
#include<stdio.h>

int add(int a, int b){
     while (b != 0) {
        int carry = a & b;       // Carry is AND of a and b
        a = a ^ b;               // Sum is XOR of a and b
        b = carry << 1;          // Shift carry left by 1
    }
    return a;
}

int main(){
    int a,b;
    printf("Enter two numbers : ");
    scanf("%d %d",&a, &b);
    printf("%d",add(a,b));
    return 0;
}*/


//17


// Write a c program to find largest among three numbers using conditional operator. 
/*
#include<stdio.h>

int main(){
    int a,b,c;
    printf("Enter the three numbers respectively: ");
    scanf("%d %d %d",&a,&b,&c);

    if (a>b && a>c)
    {
        printf("%d is large",a);
    }
    else if(b>a && b>c){
        printf("%d is large",b);
    }
    else if(c>a && c>b){
        printf("%d is large",c);
    }
    
    return 0;
}*/


//18

//Write a c program to find out prime factor of given number. 
/*
#include<stdio.h>

int main(){
    int num;
    printf("Enter the number : ");
    scanf("%d",&num);
    
    return 0;
}*/

//19

//How to convert string to int without using library functions in c.
/*
#include<stdio.h>
#include<string.h>
int main(){
    char str[30];
    printf("Enter the string: ");
    scanf("%s",str);
    int len =strlen(str),sum=0,place=1;
    for (int i = 0; i < len; i++)
    {
        if (str[i]>47 && str[i]<59)
        {
            int n = str[i]-48;
            sum = sum*10 +n;
            
        }
        
    }
    printf("%d",sum);
    
    return 0;
}*/

//20

//. C program for swapping of two numbers.
/*
#include<stdio.h>

void swap(int * a, int * b){
    int t = *a;
    *a = *b;
    *b = t;
    
}

int main(){
    int a,b;
    printf("Enter a and b :");
    scanf("%d %d",&a,&b);
    swap(&a,&b);
    printf("a : %d , b: %d",a,b);
    return 0;
}*/


//21

// Write a c program to swap two numbers without using third variable.
/*
#include<stdio.h>

int main(){
    int a,b;
    printf("Enter a and b respectively: ");
    scanf("%d %d",&a,&b);

    a = a+b;
    b = a-b;
    a = a-b;

    printf("a: %d , b: %d",a,b);
    return 0;
}*/


//22

// Program to find largest of n numbers in c. 
/*
#include<stdio.h>
#include<limits.h>

int main(){
    int n;
    printf("Enter the number of inputs: ");
    scanf("%d",&n);
    int arr[n];

    for (int i = 0; i < n; i++)
    {
        printf("Enter the element %d : ",i+1);
        scanf("%d",&arr[i]);
    }

    int max =INT_MIN;
    for (int i = 0; i < n; i++)
    {
        if(arr[i]>max){
            max = arr[i];
        }
    }
     
    printf("The maximum element of the array is %d ",max);
    

    return 0;
}*/

//23

// Write a c program to find out L.C.M. of two numbers. 

#include<stdio.h>
/*
int HCF(int a,int b){
    while (b!=0)
    {
        int temp = b;
        b = a % b;
        a = temp; 
    }
    return a;
}

int LCM(int a, int b){
    return(a*b)/HCF(a,b);
}

int main(){
    int a,b;
    printf("Enter two numbers respesctively: ");
    scanf("%d %d",&a,&b);

    printf("The LCM of %d and %d is %d",a,b,LCM(a,b));
    return 0;
}*/


//24


// Write a c program to find out H.C.F. of two numbers. 
/*
#include<stdio.h>

int HCF(int a,int b){
    while (b!=0)
    {
        int temp = b;
        b = a % b;
        a = temp; 
    }
    return a;
}


int main(){
    int a,b;
    printf("Enter two numbers respesctively: ");
    scanf("%d %d",&a,&b);

    printf("The HCF of %d and %d is %d",a,b,HCF(a,b));
    return 0;
}*/

//25

// Write a c program to convert decimal number to binary number. 
/*
#include<stdio.h>

int main(){
    int dec,i=0,temp;
    printf("Enter the decimal number : ");
    scanf("%d",&dec);
    int bin[20];

    if(dec == 0){
        printf("0");
        return 0;
    }
    
    while (dec>0)
    {
        temp = dec%2;
        bin[i] = temp;
        dec = dec/2;
        i++;
    }

    for (int j = i-1; j >= 0; j--)
    {
        printf("%d",bin[j]);
        
    }
    return 0;
}*/


//26

// Write a c program to convert decimal number to octal number. 
/*
#include<stdio.h>

int main(){
    int dec,i=0,temp;
    printf("Enter the decimal number : ");
    scanf("%d",&dec);
    int octal[20];

    if(dec == 0){
        printf("0");
        return 0;
    }
    
    while (dec>0)
    {
        temp = dec%8;
        octal[i] = temp;
        dec = dec/8;
        i++;
    }
    printf("The octal number : ");
    for (int j = i-1; j >= 0; j--)
    {
        printf("%d",octal[j]);
        
    }
    return 0;
}*/

//27


// Write a c program to convert decimal number to hexadecimal number. 
/*
#include<stdio.h>

void dec_to_hex(int dec){
    char hex[20];
    int i=0;

    while (dec!=0)
    {
        int rem = dec%16;
        if(rem<10)
           hex[i] = rem+'0';
        else
            hex[i] = rem-10+'A';
        
        dec /=16;
        i++;
    }

    for (int j = i-1; j >=0 ; j--)
    {
        printf("%c",hex[j]);      
    }
    
    
}
int main(){
    int dec;
    printf("Enter the decimal number : ");
    scanf("%d",&dec);
    dec_to_hex(dec);
    return 0;
}*/


//28


//  Write a c program to convert octal number to binary number. 
/*
#include<stdio.h>

void bin(int oct){
    switch (oct)
    {
    case 0:
        printf("000");
        break;
    case 1:
        printf("001");
        break;
    case 2:
        printf("010");
        break;
    case 3:
        printf("011");
        break;
    case 4:
        printf("100");
        break;
    case 5:
        printf("101");
        break;
    case 6:
        printf("110");
        break;
    case 7:
        printf("111");
        break;
   
    default:
        printf("Invalid");
        break;
    }
}

int main(){
    int octal,i=0;
    printf("Enter the octal number : ");
    scanf("%d",&octal);
    int temp[20];
    while (octal>0)
    {
        int r = octal%10;
        temp[i] = r;
        octal /= 10;
        i++;
    }
    
    for (int j = i-1; j >=0 ; j--)
    {
        bin(temp[j]);
    }
    
    return 0;
}*/

//29

// Write a c program to convert octal number to decimal number. 
/*
#include<stdio.h>
#include<math.h>

int main(){
    int oct,dec=0,i=0;
    printf("Enter the octal number : ");
    scanf("%d",&oct);
    
    if (oct==0)
    {
        printf("0");
        return 0;
    }
    

    while (oct>0)
    {   
        int r =oct%10;
        dec += (r*pow(8,i));
        oct /= 10;
        i++;
    }
    
    printf("%d",dec);

    return 0;
}*/


//30

//  Write a c program to convert octal number to hexadecimal number. 
/*
#include<stdio.h>
#include<math.h>

int octal_to_dec(int oct){
    int dec =0,i=0;
    while(oct!=0){
        int rem = oct%10;
        dec += (rem*pow(8,i));
        oct /= 10;
        i++;
    }
    return dec;
}

void dec_to_hex(int dec){
    char hex[20];
    int i=0;

    while (dec!=0)
    {
        int rem = dec%16;
        if(rem<10)
           hex[i] = rem+'0';
        else
            hex[i] = rem-10+'A';
        
        dec /=16;
        i++;
    }

    for (int j = i-1; j >=0 ; j--)
    {
        printf("%c",hex[j]);      
    }
    
    
}

int main(){
    int octal;
    printf("Enter the octal number: ");
    scanf("%d",&octal);

    int decimal = octal_to_dec(octal);
    dec_to_hex(decimal);
    return 0;
}*/


//31

// Write a c program to convert hexadecimal number to binary number.
/*
#include<stdio.h>
#include<string.h>
void hex_to_bin(char hex){
    switch (hex)
    {
    case '0':
        printf("0000");
        break;
    case '1':
        printf("0001");
        break;
    case '2':
        printf("0010");
        break;
    case '3':
        printf("0011");
        break;
    case '4':
        printf("0100");
        break;
    case '5':
        printf("0101");
        break;
    case '6':
        printf("0110");
        break;
    case '7':
        printf("0111");
        break;
    case '8':
        printf("1000");
        break;
    case '9':
        printf("1001");
        break;
    case 'A':
        printf("1010");
        break;
    case 'B':
        printf("1011");
        break;
    case 'C':
        printf("1100");
        break;
    case 'D':
        printf("1101");
        break;
    case 'E':
        printf("1110");
        break;
    case 'F':
        printf("1111");
        break;
    default:
        printf("Invalid");
        break;
    }
}

int main(){
    char hex[20];
    printf("Enter a hexa decimal number :");
    scanf("%s",hex);
    int len;
    len = strlen(hex);
    for (int i = 0; i < len; i++)
    {
        hex_to_bin(hex[i]);
    }
    
    return 0;
}*/

//32


// Write a c program to convert hexadecimal number to octal number. 

/*
#include<stdio.h>
#include<string.h>
#include<math.h>
int hex_to_dec(char hex){
    if(hex>='0' && hex<='9'){
        return hex-'0';
    }
    else if(hex>='A' && hex<='F'){
        return hex+10-'A';
    }
    else
        return -1;
}

int main(){
    char hex[20];
    printf("Enter hexa decimal value:");
    scanf("%s",hex);
    int len = strlen(hex);
    int decimal =0 ;
    for (int i = 0; i < len; i++)
    {
        int dec = hex_to_dec(hex[len-i-1]);
        decimal +=(dec*pow(16,i));
    }
    // printf("%d",decimal);
    int octal[20],i=0;

    if (decimal == 0)
    {
        printf("0");
        return 0;
    }
    
    while(decimal>0){
        int rem = decimal%8;
        octal[i] = rem;
        i++;
        decimal /= 8;
    }
     printf("The octal number : ");
    for (int j = i-1; j >= 0; j--)
    {
        printf("%d",octal[j]);
        
    }
    return 0;
}*/


//33

/*
#include<stdio.h>
#include<string.h>
#include<math.h>
int hex_to_dec(char hex){
    if(hex>='0' && hex<='9'){
        return hex-'0';
    }
    else if(hex>='A' && hex<='F'){
        return hex+10-'A';
    }
    else
        return -1;
}

int main(){
    char hex[20];
    printf("Enter hexa decimal value:");
    scanf("%s",hex);
    int len = strlen(hex);
    int decimal =0 ;
    for (int i = 0; i < len; i++)
    {
        int dec = hex_to_dec(hex[len-i-1]);
        decimal +=(dec*pow(16,i));
    }
    printf("%d",decimal);
    return 0;
}*/

//34


//Write a c program to convert binary number to octal number.
/*
#include<stdio.h>
#include<math.h>

int bin_to_dec(int bin){
    int dec=0,i=0;
    while (bin>0)
    {
        int rem = bin%10;
        dec+= (rem*pow(2,i));
        i++;
        bin /= 10;
    }
    return dec;
}



int main(){
    int bin,temp,i=0;
    printf("Enter binary no.: ");
    scanf("%d",&bin);
    int dec = bin_to_dec(bin);
    int octal[20];

    if(dec == 0){
        printf("0");
        return 0;
    }
    
    while (dec>0)
    {
        temp = dec%8;
        octal[i] = temp;
        dec = dec/8;
        i++;
    }
    printf("The octal number : ");
    for (int j = i-1; j >= 0; j--)
    {
        printf("%d",octal[j]);
        
    }

    
    return 0;
}*/

//35


// Write a c program to convert binary number to decimal number. 
/*
#include<stdio.h>
#include<math.h>
int bin_to_dec(int bin){
    int dec=0,i=0;
    while (bin>0)
    {
        int rem = bin%10;
        dec+= (rem*pow(2,i));
        i++;
        bin /= 10;
    }
    return dec;
}

int main(){
    int bin;
    printf("Enter binary no.: ");
    scanf("%d",&bin);
    int dec = bin_to_dec(bin);
    printf("%d",dec);
    return 0;
}*/


//36

//Write a c program to convert binary number to hexadecimal number. 

/*
#include<stdio.h>
#include<math.h>

int bin_to_dec(int bin){
    int dec=0,i=0;
    while (bin>0)
    {
        int rem = bin%10;
        dec+= (rem*pow(2,i));
        i++;
        bin /= 10;
    }
    return dec;
}


void dec_to_hex(int dec){
    char hex[20];
    int i=0;

    while (dec!=0)
    {
        int rem = dec%16;
        if(rem<10)
           hex[i] = rem+'0';
        else
            hex[i] = rem-10+'A';
        
        dec /=16;
        i++;
    }

    for (int j = i-1; j >=0 ; j--)
    {
        printf("%c",hex[j]);      
    }
    
    
}
int main(){
    int bin,temp,i=0;
    printf("Enter binary no.: ");
    scanf("%d",&bin);
    int dec = bin_to_dec(bin);
    dec_to_hex(dec);
   
    return 0;
}*/


//37


// C program for addition of binary numbers. 
/*
#include<stdio.h>
#include<math.h>
int bin_to_dec(int bin){
    int dec=0,i=0;
    while (bin>0)
    {
        int rem = bin%10;
        dec+= (rem*pow(2,i));
        i++;
        bin /= 10;
    }
    return dec;
}

int main(){
    int bin1, bin2,sum,carry,ans;
    printf("Enter the first bin no.: ");
    scanf("%d",&bin1);
    int dec1= bin_to_dec(bin1);
    printf("Enter the second bin no.: ");
    scanf("%d",&bin2);
    int dec2= bin_to_dec(bin2);

    int res = dec1+dec2;

    int bin[20],i=0;

    if(res == 0){
        printf("0");
        return 0;
    }
    
    while (res>0)
    {
        int temp = res%2;
        bin[i] = temp;
        res = res/2;
        i++;
    }

    for (int j = i-1; j >= 0; j--)
    {
        printf("%d",bin[j]);
        
    }
    

    
    return 0;
}*/


//38


// Write a c program to convert the string from upper case to lower case. 
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[20],new[20];
    printf("Enter the string in upper csae: ");
    scanf("%s",str);
    int len =strlen(str);
    for (int i = 0; i < len; i++)
    {
        char temp = str[i];
        if(temp>='A' && temp<='Z'){
            new[i] = temp + 32;
        }
    }
    new[len] = '\0';
    printf("%s",new);
    return 0;
}*/

//39

// Write a c program to convert the string from lower case to upper case.

/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[20],new[20];
    printf("Enter the string in upper csae: ");
    scanf("%s",str);
    int len =strlen(str);
    for (int i = 0; i < len; i++)
    {
        char temp = str[i];
        if(temp>='a' && temp<='z'){
            new[i] = temp - 32;
        }
    }
    new[len] = '\0';
    printf("%s",new);
    return 0;
}*/

//40

// Write a c program to delete the all consonants from given string. 
/*
#include<stdio.h>
#include<string.h>
#include<ctype.h>
int main(){
    char str[20],new[10],j=0;
    printf("Enter the string: ");
    scanf("%s",str);
    for (int i = 0; i < strlen(str); i++)
    {
        char ch = tolower(str[i]);
        if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'){
            new[j] = str[i];
            j++;
        }
        else{
            continue;
        }
    }
    new[j+1] = '\0';
    printf("%s",new);
    return 0;
}*/


//41


// Write a c program to count the different types of characters’ in given string. 
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[20],count=0,f;
    printf("Enter the string: ");
    scanf("%s",str);
    int len = strlen(str);
    for (int i = 0; str[i]!='\0'; i++)
    {
        f=1;
        for (int j = 0; j <i; j++)
        {
            if(str[i] == str[j]){
                f=0;
                break;
            }
        }
        if(f==1){
            count++;
        }
    }
    printf("%d",count);   
    
    
    return 0;
}*/

//42

// Write a c program to sort the characters of a string. 
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[20];
    printf("Enter the string: ");
    scanf("%s",str);
    int len = strlen(str);
    for (int i = 0; i < len; i++)
    {
        for (int j = 0; j < len-i-1; j++)
        {
            if(str[j]>str[j+1]){
                char temp = str[j+1];
                str[j+1] = str[j];
                str[j] = temp;
            }
        }
        
    }

    printf("%s",str);
    return 0;
}*/


//43

// Write a c program to find the length of a string using pointer.
/*
#include<stdio.h>
#include<string.h>

int str_length(char *str){
    int count =0;
    for (int i = 0; str[i] != '\0'; i++)
    {
        count++;
    }
    return count;
}

int main(){
    char str[20],count=0,f;
    printf("Enter the string: ");
    scanf("%s",str);
    
    int c= str_length(str);
    printf("%d",c);
    return 0;
}*/

//44

//Write a c program which prints initial of any name.
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter your name :");
    gets(str);
    char init[50];
    init[0] = str[0];
    int len = strlen(str);
    int count=1;
    for (int i = 1; i < len; i++)
    {
        if(str[i] == ' '){
            init[count] = str[i+1];
            count++;
        }
        else{
            continue;
        }
    }

    init[count] = '\0';
    printf("%s",init);

    
    return 0;
}*/


//45

// Write a c program to print the string from given character. 
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[30],ch;
    printf("Enter the string :");
    gets(str);
    printf("Enter the character for printing from it: ");
    scanf("%c",&ch);

    //Find the index of ch
    int count = 1;
    int len = strlen(str);
    for (int i = 0; str[i]!=ch; i++)
    {
        count++;
    }
    
    // printf("%d",count);

    for (int j = count; j < len; j++)
    {
        printf("%c",str[j]);
    }
    

    return 0;
}*/


//46

//Write a c program to reverse a string. 
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[30],rev[30];
    printf("Enter the string :");
    gets(str);
    int len = strlen(str);
    for (int i = 0; i < len; i++)
    {
        rev[i] = str[len-i-1];
    }
    rev[len] = '\0';
    puts(rev);
    
    return 0;
}*/

//47

//Write a c program for addition of two matrices.
/*
#include<stdio.h>
#define MAX 10

void printMatrix(int arr[MAX][MAX],int m, int n){
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
}

int main(){
    //Entering the no. of rows and columns
    int m,n;
    printf("Enter the no. o rows and columns respectivey :");
    scanf("%d %d",&m,&n);
    int arr1[MAX][MAX];
    //Making the matrix
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("Enter element [%d][%d] :",i,j);
            scanf("%d",&arr1[i][j]);
        }
    }
    
    printMatrix(arr1,m,n);
    
    int arr2[MAX][MAX];
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("Enter element [%d][%d] :",i,j);
            scanf("%d",&arr2[i][j]);
        }
    }
    printMatrix(arr2,m,n);
    int sum[MAX][MAX];
    int s=0;
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            s = arr1[i][j] + arr2[i][j];
            sum[i][j] = s;
        }
    }
    printf("The addition of two matrix is :\n");

    printMatrix(sum,m,n);



    return 0;
}*/

//48

//  Write a c program for subtraction of two matrices 

/*
#include<stdio.h>
#define MAX 10

void printMatrix(int arr[MAX][MAX],int m, int n){
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
}

int main(){
    //Entering the no. of rows and columns
    int m,n;
    printf("Enter the no. o rows and columns respectivey :");
    scanf("%d %d",&m,&n);
    int arr1[MAX][MAX];
    //Making the matrix
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("Enter element [%d][%d] :",i,j);
            scanf("%d",&arr1[i][j]);
        }
    }
    
    printMatrix(arr1,m,n);
    
    int arr2[MAX][MAX];
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("Enter element [%d][%d] :",i,j);
            scanf("%d",&arr2[i][j]);
        }
    }
    printMatrix(arr2,m,n);
    int sub[MAX][MAX];
    int s=0;
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            s = arr1[i][j] - arr2[i][j];
            sub[i][j] = s;
        }
    }
    printf("The subtraction of two matrix is :\n");

    printMatrix(sub,m,n);



    return 0;
}*/

//49

// Write a c program for multiplication of two matrices. 

/*
#include<stdio.h>
#include<stdlib.h>
#define MAX 10

void printMatrix(int arr[MAX][MAX],int m, int n){
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
}

int main(){
    //Entering the no. of rows and columns
    int m,n1;
    printf("Enter the no. of rows and columns respectively :");
    scanf("%d %d",&m,&n1);
    int arr1[MAX][MAX];
    //Making the matrix
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n1; j++)
        {
            printf("Enter element [%d][%d] :",i,j);
            scanf("%d",&arr1[i][j]);
        }
    }
    
    printMatrix(arr1,m,n1);
    

    int n2,p;
    printf("Enter the no. of rows and columns respectively :");
    scanf("%d %d",&n2,&p);
    if(n1!=n2){
        printf("The multiplication can't be determined.");
        exit(0);
    }
    int arr2[MAX][MAX];
    for (int i = 0; i < n2; i++)
    {
        for (int j = 0; j < p; j++)
        {
            printf("Enter element [%d][%d] :",i,j);
            scanf("%d",&arr2[i][j]);
        }
    }
    printMatrix(arr2,n2,p);

    int mul[MAX][MAX];
    int s=0;
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < p; j++)
        {   
            s=0;
            for (int k = 0; k < m; k++)
            {
                s += arr1[i][k]* arr2[k][j];
            }
            mul[i][j] = s;
        }
    }
    printf("The mulltiplication of two matrix is :\n");

    printMatrix(mul,m,p);

    return 0;
}*/

//50

// Write a c program to find out sum of diagonal element of a matrix.

/*
#include<stdio.h>
#define MAX 10

void printMatrix(int arr[MAX][MAX],int m, int n){
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
}

int main(){
    //Entering the no. of rows and columns
    int m,n;
    printf("Enter the no. o rows and columns respectivey :");
    scanf("%d %d",&m,&n);
    int arr1[MAX][MAX];
    //Making the matrix
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("Enter element [%d][%d] :",i,j);
            scanf("%d",&arr1[i][j]);
        }
    }
    
    printMatrix(arr1,m,n);
    int sum = 0;
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if(i==j){
                sum += arr1[i][j];
            }
        }
        
    }
    
    printf("The addition of the diagonal of the matrix is : %d",sum);


    return 0;
}*/
										
