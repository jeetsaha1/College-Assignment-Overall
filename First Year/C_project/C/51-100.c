//51

// Write a c program to find out absolute difference between sum of diagonal element of a matrix. 

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
    printf("Enter the no. of rows and columns respectively :");
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
    int sum_left = 0;
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if(i==j){
                sum_left += arr1[i][j];
            }
        }
        
    }
    int sum_right = 0;
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if(i+j == m-1){
                sum_right += arr1[i][j];
            }
        }
        
    }
    
    int abs = sum_left-sum_right;
    if(abs<0){
        abs = -abs;
    }
    printf("The absolute difference of diagonal of the matrix is : %d",abs);


    return 0;
}*/

//52

// Write a c program to find out transport of a matrix. 

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
    printf("Enter the no. of rows and columns respectively :");
    scanf("%d %d",&m,&n);
    int arr1[MAX][MAX],trans[MAX][MAX];
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

    printf("\n");
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            trans[j][i] = arr1[i][j];
        }
    }
    printf("The transpose of the matrix is : \n");
    printMatrix(trans,m,n); 
    return 0;
}*/

//53

//Write a c program for scalar multiplication of matrix. 
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
    printf("Enter the no. of rows and columns respectively :");
    scanf("%d %d",&m,&n);
    int arr1[MAX][MAX],scaler_mul[MAX][MAX];

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
    int num;
    printf("Enter the number for scaler multiply: ");
    scanf("%d",&num);
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            scaler_mul[i][j] = num*arr1[i][j];
        }
    }

    printMatrix(scaler_mul,m,n);
    return 0;
}*/

//54

//C program to find inverse of a matrix. 

//55

//C program to find determinant of a matrix
/*
#include<stdio.h>
#define MAX 10

//Getting the co-factor
void get_cofactor(int arr[MAX][MAX],int temp[MAX][MAX],int p, int q, int n){
    int r=0,c=0;
    for (int i = 0; i < n; i++)
    {
        if(i==p)
            continue;
        c=0;
        for (int j = 0; j < n; j++)
        {
            if(j==q)
                continue;
            temp[r][c] = arr[i][j];
            c++;
        }
        r++;
    }
}

int determinant(int arr[MAX][MAX],int n){
    if(n==1)
        return arr[0][0];
    int temp[MAX][MAX];
    int sign =1, det= 0;
    for (int f = 0; f < n; f++)
    {
        get_cofactor(arr,temp,0,f,n);
        det += sign *arr[0][f] * determinant(temp, n-1);
        sign = -sign;
    }
    return det;
}
int main(){
    //Entering the no. of rows and columns
    int m,n;
    printf("Enter the no. of rows and columns respectively :");
    scanf("%d %d",&m,&n);
    int arr1[MAX][MAX],scaler_mul[MAX][MAX];

    //Making the matrix
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("Enter element [%d][%d] :",i,j);
            scanf("%d",&arr1[i][j]);
        }
    }
    int det = determinant(arr1,m);
    printf("%d",det);

    return 0;
}*/

//56

// Write a c program to find out largest element of an array.
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
        printf("Enter the element %d: ",i+1);
        scanf("%d",&arr[i]);
    }
    int max= INT_MIN;
    for (int i = 0; i < n; i++)
    {
        if(max<arr[i])
            max = arr[i];
    }
    
    printf("The largest element : %d",max);

    
    return 0;
}*/

//57

// Write a c program to find out second largest element of an unsorted array.

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
        printf("Enter the element %d: ",i+1);
        scanf("%d",&arr[i]);
    }
    int max= INT_MIN;
    int sec_max = INT_MIN;
    for (int i = 0; i < n; i++)
    {
        if(max<arr[i]){
            sec_max = max;
            max = arr[i];
        }
        else if(arr[i]>sec_max && arr[i]<max){
            sec_max = arr[i];
        }
    }
    
    printf("The second largest element : %d",sec_max);

    
    return 0;
}*/

//58

//Write a c program to find out second smallest element of an unsorted array. 

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
        printf("Enter the element %d: ",i+1);
        scanf("%d",&arr[i]);
    }
    int min= INT_MAX;
    int sec_min = INT_MAX;
    for (int i = 0; i < n; i++)
    {
        if(min>arr[i]){
            sec_min = min;
            min = arr[i];
        }
        else if(arr[i]<sec_min && arr[i]>min){
            sec_min = arr[i];
        }
    }
    
    printf("The second largest element : %d",sec_min);

    
    return 0;
}*/

//59

// Write a c program which deletes the duplicate element of an array. 

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

//60

// Write a c program for delete an element at desired position in an array. 

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
    
    
    int idx;
    printf("Enter the index number for deleting element: ");
    scanf("%d",&idx);

    if (idx < 0 || idx >= n) {
        printf("Invalid index!\n");
        return 1;
    }

    for (int i = idx; i < n-1; i++)
    {
        arr[i] = arr[i+1];
    }
    
    for (int i = 0; i < n-1; i++)
    {
        printf("%d ",arr[i]);
    }
    
    
    return 0;
}*/

//61

//Write a c program for insert an element at desired position in an array. 
/*
#include<stdio.h>

int main(){
    int n;
    printf("Enter the number of inputs: ");
    scanf("%d",&n);
    int arr[10];
    for (int i = 0; i < n; i++)
    {
        printf("Enter the element %d: ",i+1);
        scanf("%d",&arr[i]);
    }
    
    int num;
    printf("Enter the new element: ");
    scanf("%d",&num);

    int idx;
    printf("Enter the index number for entering element: ");
    scanf("%d",&idx);

    if (idx < 0 || idx > n) {
        printf("Invalid index!\n");
        return 1;
    }

    for (int i = n; i >idx; i--)
    {
        arr[i] = arr[i-1];
    }
    arr[idx] = num;
    n++;

    for (int i = 0; i < n; i++)
    {
        printf("%d ",arr[i]);
    }
    
    
    return 0;
}*/

//62

// C program to find largest and smallest number in an array.

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
        printf("Enter the element %d: ",i+1);
        scanf("%d",&arr[i]);
    }
    int max= INT_MIN;
    int min = INT_MAX;
    for (int i = 0; i < n; i++)
    {
        if(max<arr[i])
            max = arr[i];
    }
    for (int i = 0; i < n; i++)
    {
        if(min>arr[i])
            min = arr[i];
    }
    printf("The largest element : %d",max);
    printf("The smallest element : %d",min);

    
    return 0;
}*/

//63

//Write a c program for bubble sort. 

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

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n-i-1; j++)
        {
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        
    }
    for (int i = 0; i < n; i++)
    {
        printf("%d ",arr[i]);
    }
    
    return 0;
}*/

//64

// Write a c program for insertion sort. 
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
    for (int i = 1; i < n; i++)
    {
        int temp = arr[i];
        int j =i-1;

        while(j>=0 && arr[j]>temp){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = temp;
    }
    for (int i = 0; i < n; i++)
    {
        printf("%d ",arr[i]);
    }
    return 0;
}*/

//65

// Write a c program for selection sort. 
/*
#include<stdio.h>

int selection_sort(int arr[], int num){
    for (int i = 0; i < num-1; i++)
    {
        int min = i;
        for (int j = i+1; j < num; j++)
        {
            if (arr[j]<arr[min])
            {
                min = j;
            }
            
        }
        if(min != i){
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    
}


int main(){
    int num;
    printf("Enter the number of inputs : ");
    scanf("%d",&num);
    int arr[num];

    for (int i = 0; i < num; i++)
    {
        printf("Enter the element %d : ",i+1);
        scanf("%d",&arr[i]);
    }

    selection_sort(arr,num);

    for (int i = 0; i < num; i++)
    {
        printf("%d ",arr[i]);
    }
    
    
    return 0;
}*/

//66

//Write a c program for quick sort.
/*
#include<stdio.h>
#include<stdlib.h>

int partition(int arr[], int low, int high){
    int temp;
    int pivot = arr[low];
    int i = low+1;
    int j = high;
    do{
        while (arr[i]<=pivot)
        {
            i++;
        }
        while (arr[j]>pivot)
        {
            j--;
        }
        if(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
    }while(i<j);

    temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;

    return j;

}

void quick_sort(int arr[],int low, int high){
    int partition_idx;
    if(low<high){
        partition_idx = partition(arr, low, high);
        quick_sort(arr, low, partition_idx-1);
        quick_sort(arr, partition_idx+1, high);
    }
}

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
    
    //Calling the quick sort func.
    quick_sort(arr,0,n-1);

    for (int i = 0; i < n; i++)
    {
        printf("%d ",arr[i]);
    }
    
    return 0;
}*/

//67

//Write a c program for heap sort. 

//68

// Write a c program for merge sort.
/*
void merge(int arr[],int low,int mid,int high){
    int i = low;
    int j = mid+1;
    int k = 0;

    int temp[high-low+1];

    while (i<= mid && j<= high)
    {
        if(arr[i]<=arr[j]){
            temp[k++] = arr[i++];
        }
        else{
            temp[k++] = arr[j++];
        }
    }
    while(i<=mid){
        temp[k++] = arr[i++];
    }
    while (j<=high)
    {
        temp[k++] = arr[j++];
    }
    
    for (int g = 0; g < k; g++)
    {
        arr[low+g] = temp[g];
    }
    
}

void merge_sort(int arr[], int low, int high){
    if (low<high)
    {
        int mid = (low+high)/2;
        merge_sort(arr,low,mid);
        merge_sort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    
}

#include<stdio.h>


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
    
    //Calling the merge sort func.
    merge_sort(arr,0,n-1);

    for (int i = 0; i < n; i++)
    {
        printf("%d ",arr[i]);
    }
    
    return 0;
}*/

//69

// Write a c program for shell sort. 

//70

// Write a c program to find factorial of a number using recursion. 
/*
#include<stdio.h>

int factorial(int n){
    if(n == 0 || n==1){
        return 1;
    }
    else{
        return n*factorial(n-1);
    }
}

int main(){
    int n;
    printf("Enter the number: ");
    scanf("%d",&n);
    int fac = factorial(n);
    printf("The factorial of %d is %d",n,fac);
    return 0;
}*/

//71

// Write a c program to find GCD of a two numbers using recursion. 
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
    int n1,n2;
    printf("Enter two numbers: ");
    scanf("%d %d",&n1, &n2);
    int gcd = GCD(n1,n2);
    printf("The GCD is %d",gcd);
    return 0;
}*/

//72

//Write a c program to find out sum digits of a number using recursion.
/*
#include<stdio.h>

int sum_of_digit(int n){
    if(n==0){
        return 0;
    }
    else{
        return (n%10)+sum_of_digit(n/10);
    }
}

int main(){
    int n;
    printf("Enter the number: ");
    scanf("%d",&n);
    int sum = sum_of_digit(n);
    printf("The sum of digit of %d is %d",n,sum);
    return 0;
}*/

//73

// Write a c program to find power of a number using function recursion.
/*
#include<stdio.h>

int power(int base, int exp){
    if(exp==0){
        return 1;
    }
    else{
        return base*power(base,exp-1);
    }
}

int main(){
    int base,exp;
    printf("Enter base and exponential respectively : ");
    scanf("%d %d",&base, &exp);
    int res = power(base,exp);
    printf("The reult is %d",res);
    return 0;
}*/

//74

//Write a c program to reverse any number using recursion. 
/*
#include<stdio.h>

int reverse(int n){
    static int s =0;
    int r;
    if(n==0)    
        return s;
    else{
        r = n%10;
        s = s*10 + r;
        return reverse(n/10);
        
    }
}

int main(){
    int n;
    printf("Enter the number: ");
    scanf("%d",&n);
    int rev = reverse(n);
    printf("The sum of digit of %d is %d",n,rev);
    return 0;
}*/

//75

//Write a c program for linear search. 
/*
#include<stdio.h>

int main(){
    int n,i,ele,j,f=0;
    printf("Enter the number of inputs: ");
    scanf("%d",&n);
    int arr[n];

    for (i = 0; i < n; i++)
    {
        printf("Enter the element %d: ",i+1);
        scanf("%d",&arr[i]);
    }
    printf("Enter the number for searching: ");
    scanf("%d",&ele);

    for ( j = 0; j < n; j++)
    {
        
        if(arr[j] == ele){
           f=1;
        }
        
    }
    
    if(f==1){
        printf("the element is found");
    }
    
    return 0;
}*/

//76

// Write a c program for binary search
/*
#include<stdio.h>

int main(){
    int low, high, p, f=0,n,i, key;
    printf("Enter the number of inputs: ");
    scanf("%d",&n);
    int arr[n];

    for (i = 0; i < n; i++)
    {
        printf("Enter the element %d: ",i+1);
        scanf("%d",&arr[i]);
    }

    printf("Enter the number for searching: ");
    scanf("%d",&key);

    low = 0, high =n;
    while(low<high){
        int mid = (low+high)/2;
        if(arr[mid]<key){
            low = mid+1;
        }
        else if(arr[mid]>key){
            high = mid-1;
        }
        else{
            p=mid;
            f=1;
            break;
        }
    }
    if(f==1){
        printf("The element is found at %d",p);
    }
    return 0;
}*/

//77

//Write a c program for binary search using recursion. 

/*
#include<stdio.h>

int binarySearch(int arr[],int low, int high, int key){
    
    if(low<high){
        int mid = (low+high)/2;
        if(arr[mid]<key){
            return binarySearch(arr,mid+1,high,key);
        }
        if(arr[mid]>key){
            return binarySearch(arr,low,mid-1,key);
        }
        else{
            return mid;
        }
    }
    else{
        return -1;
    }
}

int main(){
    int low, high, p, f=0,n,i, key;
    printf("Enter the number of inputs: ");
    scanf("%d",&n);
    int arr[n];

    for (i = 0; i < n; i++)
    {
        printf("Enter the element %d: ",i+1);
        scanf("%d",&arr[i]);
    }

    printf("Enter the number for searching: ");
    scanf("%d",&key);

    int index = binarySearch(arr,0,n,key)==1;
    if(index!=-1){
        printf("The element is found at index %d",index);
    }
    else{
        printf("The element is not found");
    }
    return 0;
}*/

//78

// Write a C program to convert a given integer (in days) to years, months and days, 
//assumes that all months have 30 days and all years have 365 days. 
/*
#include<stdio.h>


void calc_day(int day){
    printf("Day : %d\n",day);
}

void calc_month(int day){
    if(day<30){
        calc_day(day);
    }
    else{
        int m = day/30;
        calc_day(day%30);
        printf("Month : %d\n",m);
    }
}

void calc_year(int day){
    if(day<365){
        calc_month(day);
    }
    else{
        int y = day/365;
        calc_month(day%365);
        printf("Year : %d\n",y);
    }
}

int main(){
    int day ;
    printf("Enter the no. of days: ");
    scanf("%d",&day);
    calc_year(day);
    return 0;
}*/

//79

// // Write a C program to convert a given integer (in seconds) to hours, minutes and 
// seconds. 
// Test Data :  
// Input seconds: 25300  
// Expected Output: H:M:S - 7:1:40

/*
#include<stdio.h>


void calc_sec(int sec){
    printf("%d",sec);
}

void calc_minuite(int sec){
    if(sec<60){
        calc_sec(sec);
    }
    else{
        int m = sec/60;
        printf("%d:",m);
        calc_sec(sec%60);
    }
}

void calc_hour(int sec){
    if(sec<3600){
        calc_minuite(sec);
    }
    else{
        int h = sec/3600;
        printf(" %d:",h);
        calc_minuite(sec%3600);
    }
}

int main(){
    int sec ;
    printf("Enter the no. of seconds: ");
    scanf("%d",&sec);
    calc_hour(sec);
    return 0;
}*/

//80

//Number of times digit 3 occurs in each and every number from 0 to n. 

/*
#include<stdio.h>

int searching_3(int val){
    if(val ==3)
        return 1;
    else{
        while(val!=0){
            int r = val%10;
            if(r==3){
                return 1;
            }
            val /=10;
        }
    }
    
}

int main(){
    int n,count=0,temp=0;
    printf("Enter the number of inputs: ");
    scanf("%d",&n);
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter the element %d ",i+1);
        scanf("%d",&arr[i]);
    }
    for (int j = 0; j < n; j++)
    {
        temp = searching_3(arr[j]);
        if(temp ==1){
            count++;
        }
    }
    printf("%d",count);
    return 0;
}*/

//81

//Find the count of numbers less than equal to N having exactly 9 divisors.

//82

//Floyd's triangle.
/*
#include<stdio.h>

int main(){
    int n;
    printf("Enter the number : ");
    scanf("%d",&n);
    int num=1;
    for (int i = 0; i <= n; i++)
    {
        for (int j = 0; j < i; j++)
        {
            printf("%d ",num);
            num++;
        }
        printf("\n");
        
    }
    
    return 0;
}*/

//83

//Pascal triangle.
/*
#include<stdio.h>

int main(){
    int n,num;
    printf("Enter the number: ");
    scanf("%d",&n);

    for (int i = 1; i <= n; i++)
    {
        for (int space = 1; space <= n-i; space++)
        {
            printf(" ");
        }
        num =1;
        for (int k = 1; k <= i; k++)
        {
            printf("%d ",num);
            num = num*(i-k)/k;
        }
        printf("\n");        
    }
    
    return 0;
}*/

//84

//Count the number of vowels. 
/*
#include<stdio.h>
#include<string.h>
#include<ctype.h>
int main(){
    char str[20];
    printf("Enter the string: ");
    scanf("%s",str);
    int len = strlen(str);
    int count=0;
    for (int i = 0; i < len; i++)
    {
        char ch = tolower(str[i]);
        if(str[i] == 'a'||str[i] == 'e'||str[i] == 'i'||str[i] == 'o'||str[i] == 'u'){
            count++;
        }
    }
    printf("The no. of vowels in the string is: %d",count);
    return 0;
}*/

//85

//Remove vowels from a string.
/*
#include<stdio.h>
#include<string.h>
#include<ctype.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    scanf("%s",str);

    int j=0;

    for (int i = 0; str[i]!='\0'; i++)
    {
        char ch = tolower(str[i]);
        if(ch != 'a'&&ch != 'e'&&ch != 'i'&&ch != 'o'&&ch != 'u'){
            str[j++] = str[i];
            
        }
    }
    str[j]='\0';

    printf("The new string is: %s",str);
    return 0;
}*/

//86

// Remove characters in a string except alphabets. 
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100],new[60];
    int j=0;
    printf("Enter the set of characters: ");
    scanf("%s",str);
    for (int i = 0; str[i] != '\0'; i++)
    {
        if(str[i]>=65 && str[i]<=90){
            new[j] = str[i];
            j++;
        }
        if(str[i]>=90 && str[i]<=122){
            new[j] = str[i];
            j++;
        }
    }
    new[j+1] = '\0';
    printf("%s",new);
    return 0;
}*/

//87

// Remove spaces from a string. 
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100],new[60];
    int j=0;
    printf("Enter the set of characters: ");
    fgets(str,sizeof(str),stdin);
    for (int i = 0; i < strlen(str); i++)
    {
        if(str[i]!=' '){
            new[j] = str[i];
            j++;
        }
    }
    new[j+1] ='\0';
    printf("%s",new);
    return 0;
}*/

//88

//Calculate the sum of numbers in a string. 
/*
#include<stdio.h>
#include<string.h>

int main(){
    char num[20];
    int sum=0;

    printf("Enter the numbers as string: ");
    scanf("%s",num);

    for (int i = 0; i < strlen(num); i++)
    {
        if(num[i]>='0' && num[i]<='9'){
            int n = num[i]-'0';
            sum += n;
        }
    }
    printf("%d",sum);
    return 0;
}*/

//89

//Capitalize the first and last letter of each word of a string.
/*
#include<stdio.h>
#include<string.h>
#include<ctype.h>
int main(){
    char str[100];
    printf("Enter the strings :");
    gets(str);
    char ch = toupper(str[0]);
    str[0] = ch;
    char ch_ = toupper(str[strlen(str)-1]);
    str[strlen(str)-1] = ch_;
    for (int i = 0; str[i] != '\0'; i++)
    {
        if (str[i] == ' ')
        {
            char ch1 =  toupper(str[i-1]);
            char ch2 = toupper(str[i+1]);
            str[i-1] = ch1;
            str[i+1] = ch2; 
        }
        
    }
    printf("%s",str);
    return 0;
}*/

//90

// Frequency of characters in a string. 
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    scanf("%s",str);
    
    int freq[256]={0};
    for (int i = 0; str[i] !='\0'; i++)
    {
        freq[str[i]]++;
    }

    for (int j = 0; j < 256; j++)
    {
        if(freq[j]>0){
            printf("%c : %d\n",j,freq[j]);
        }
    }
    
    
    return 0;
}*/

//91

//Replace substring in a string. 

/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100],result[200];
    int pos = -1,i=0,j=0,k=0;

    printf("Enter the sentence: ");
    fgets(str, sizeof(str), stdin);
    str[strcspn(str, "\n")] = '\0';

    char old_substr[20];
    printf("Enter new old string for replacing:");
    scanf("%s",old_substr);

    char new_substr[20];
    printf("Enter new sub string :");
    scanf("%s",new_substr);

    int mainlen = strlen(str);
    int oldlen = strlen(old_substr);
    int newlen = strlen(new_substr);

    for (int i = 0; i <= mainlen-oldlen; i++)
    {
        if(strncmp(&str[i],old_substr,oldlen)==0){
            pos = i;
            break;
        }
    }
    
    if(pos==-1){
        printf("substring not found");
        return 0;
    }

    for (int i = 0; i < pos; i++)
    {
        result[k++] = str[i];
    }
    
    for (int  i = 0; i < newlen; i++)
    {
        result[k++] = new_substr[i];
    }

    for (int i = pos + oldlen; i < mainlen; i++) {
        result[k++] = str[i];
    }

    result[k] = '\0';

    printf("The replaced string : %s",result);
    
    return 0;
}*/

//92

//Count common subsequence in two strings. 

//93

// Remove duplicate elements in an array
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

//94

// Missing elements of a range. 

/*
#include<stdio.h>

int main(){
    int n;
    printf("Enter how many elements you want to input: ");
    scanf("%d",&n);
    int arr[n];

    for (int i = 0; i < n; i++)
    {
        printf("Enter the element %d: ",i+1);
        scanf("%d",&arr[i]);
    }

    int range;
    printf("Enter the upeer limit of the range: ");
    scanf("%d",&range);

    int present[100] = {0};
    for (int k = 0; k < n; k++)
    {
        present[arr[k]] = 1;

    }
    
    for (int l = 1; l <= range; l++)
    {
        if(present[l] == 0){
            printf("%d ",l);
        }
    }
    
    return 0;
}*/

//95

//Triplets with a given sum
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

    int target;
    printf("Enter the target: ");
    scanf("%d",&target);

    for (int i = 0; i < n; i++)
    {
        for (int j = i+1; j < n; j++)
        {
            for (int k = j+1; k < n; k++)
            {
                if(arr[i]+arr[j]+arr[k] == target){
                    printf("(%d,%d,%d)\n",arr[i],arr[j],arr[k]);
                }
            }
            
        }
        
    }
    
    
    return 0;
}*/

//96

// Array rotation - Left and right. 
/*
#include<stdio.h>

int main(){
    int n,temp=0;
    printf("Enter the number of inputs: ");
    scanf("%d",&n);
    int arr[n];

    for (int i = 0; i < n; i++)
    {
        printf("Enter the element %d: ",i+1);
        scanf("%d",&arr[i]);
    }
    //left rotation by first index
    temp = arr[0];
    for (int i = 0; i < n; i++)
    {
        arr[i] = arr[i+1];
    }
    arr[n-1] = temp;
    
    for (int j = 0; j < n; j++)
    {
        printf("%d ",arr[j]);
    }

    //right rotation by first index
    temp = arr[n-1];
    for (int i = n-1; i > 0; i--)
    {
        arr[i] = arr[i-1];
    }
    arr[0] = temp;
    
    for (int j = 0; j < n; j++)
    {
        printf("%d ",arr[j]);
    }
    return 0;
}*/

//97

// Block swap algorithm for array rotation.

//98

//Array is a subset of another array or not.
/*
#include<stdio.h>

int main(){
    int n1;
    printf("Enter the number of elements of main array: ");
    scanf("%d",&n1);
    int main_arr[n1];

    for (int i = 0; i < n1; i++)
    {
        printf("Enter element %d: ",i+1);
        scanf("%d",&main_arr[i]);
    }
    

    int n2;
    printf("Enter the number of elements of sub array: ");
    scanf("%d",&n2);
    int sub_arr[n2];

    for (int i = 0; i < n2; i++)
    {
        printf("Enter element %d: ",i+1);
        scanf("%d",&sub_arr[i]);
    }
    
    int i =0,count=0;
    while(i<=n2){
        for (int k = 0; k < n1; k++)
        {
            if(sub_arr[i] == main_arr[k]){
                count++;
            }
            else{
                continue;
            }
        }
        i++;
        
    }
    if(count == n2){
        printf("The sub array is the subset of the main array");
    }
    else{
        printf("The sub array is not the subset of the main array");
    }
    return 0;
}*/

//99

//Merge two sorted arrays

/*
#include<stdio.h>

int main(){
    int n1;
    printf("Enter the number of elements of sorted array: ");
    scanf("%d",&n1);
    int s1_arr[n1];

    for (int i = 0; i < n1; i++)
    {
        printf("Enter element %d: ",i+1);
        scanf("%d",&s1_arr[i]);
    }
    

    int n2;
    printf("Enter the number of elements of sorted array: ");
    scanf("%d",&n2);
    int s2_arr[n2];

    for (int i = 0; i < n2; i++)
    {
        printf("Enter element %d: ",i+1);
        scanf("%d",&s2_arr[i]);
    }

    int new[n1+n2+1],j=0,k=0,i=0;
    
    
    while(j<n1 && k<n2){
        if(s1_arr[j]>s2_arr[k]){
            new[i] = s2_arr[k];
            i++;
            k++;
        }
        else{
            new[i] = s1_arr[j];
            i++;
            j++;
        }
        
    }
    
    while(j<n1){
        new[i++] = s1_arr[j++];
    }

    while(k<n2){
        new[i++] = s2_arr[k++];
    }
    

    for (int i = 0; i < n1+n2; i++)
    {
        printf("%d ",new[i]);
    }
    
    return 0;
}*/

//100

// Longest subarray having an average greater than or equal to k. 
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

    int k;
    printf("Enter the target: ");
    scanf("%d",&k);
    int sum =0,len=0;
    for (int i = 0; i < n; i++)
    {
        sum = sum + arr[i];
        len++;
        if(sum >=(len*k)){
            printf("True");
            break;
        }
    }
    
    
    
    return 0;
}*/


