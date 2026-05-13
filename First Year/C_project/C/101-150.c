//101

//. Sum of all odd frequency elements in an array. 
/*
#include<stdio.h>

int main(){
    int n;
    printf("Enter the number of inputs: ");
    scanf("%d",&n);
    int arr[n],visited[n];

    for (int i = 0; i < n; i++)
    {
        printf("Enter the element %d: ",i+1);
        scanf("%d",&arr[i]);
        visited[i] =0;
    }

    int count =0,sum=0;
    for (int i = 0; i < n; i++)
    {
        if(visited[i])  continue;
        count = 1;
        for (int j = i+1; j <n ; j++)
        {
            if(arr[i] == arr[j]){
                count++;
                visited[j] = 1;
            }
        }
        if(count%2!=0){
            sum+= arr[i];
        }
    }
    printf("%d",sum);
    
    return 0;
}*/

//102

// Matrix rotation by 90 degrees clockwise and anticlockwise. 
/*
#include<stdio.h>

int main(){
    int n;
    printf("Enter the no. of rows and cols. : ");
    scanf("%d",&n);
    int arr[n][n];
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("Enter the ele %d: ",i+1);
            scanf("%d",&arr[i][j]);   
        }
        
    }

    //Rotation 90 degree clockwise

    int r[n][n];
    
    int trans[n][n];
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            trans[j][i] = arr[i][j];
        }
        
    }
    
    for (int i = 0; i < n; i++)
    {
        for (int k = 0; k < n; k++)
        {
            r[i][k] = trans[i][n-k-1];
        }
        
    }
    

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("%d ",r[i][j]);
        }
        printf("\n");        
    }

    printf("\n");
    //Rotation 90 degree anti clockwise

    int r1[n][n];
    
    int trans1[n][n];
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            trans1[j][i] = arr[i][j];
        }
        
    }
    
    for (int i = 0; i < n; i++)
    {
        for (int k = 0; k < n; k++)
        {
            r1[i][k] = trans[n-i-1][k];
        }
        
    }
    

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("%d ",r1[i][j]);
        }
        printf("\n");        
    }
    

    
    return 0;
}*/

//103

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

//104

// Count total number of negative elements in an array.
/*
#include<stdio.h>

int main(){
    int n;
    printf("Enter the number of inputs: ");
    scanf("%d",&n);
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter the ele %d: ",i+1);
        scanf("%d",&arr[i]);
    }
    int count= 0;
    for (int j = 0; j < n; j++)
    {
        if(arr[j]<0){
            count++;
        }
    }
    
    printf("The number of negative elments in array is %d",count);
    
    return 0;
}*/

//105

// Copy all elements from an array to another array.
/*
#include<stdio.h>

int main(){
    int n;
    printf("Enter the number of inputs: ");
    scanf("%d",&n);
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter the ele %d: ",i+1);
        scanf("%d",&arr[i]);
    }
    int copied_arr[n] ;
    for (int j = 0; j < n; j++)
    {
        copied_arr[j] = arr[j];
    }
    
    printf("The copied array:");
    for (int  k = 0; k < n; k++)
    {
        printf("%d ",copied_arr[k]);
    }
    
    return 0;
}*/

//106

//. Put even and odd elements of an array in two separate arrays. 
/*
#include<stdio.h>

int main(){
    int n;
    printf("Enter the number of inputs: ");
    scanf("%d",&n);
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter the ele %d: ",i+1);
        scanf("%d",&arr[i]);
    }
    int even[10],odd[10],ev=0,od=0;
    for (int j = 0; j < n; j++)
    {
        if(arr[j]%2==0){
            even[ev] = arr[j];
            ev++;
        }
        else{
            odd[od] = arr[j];
            od++;
        }
    }
    
    printf("The even numbers: ");
    for (int k = 0; k < ev; k++)
    {
        printf("%d ",even[k]);
    }
    printf("\n");
    printf("The odd numbers: ");
    for (int l = 0; l < od; l++)
    {
        printf("%d ",odd[l]);
    }
    
    
    return 0;
}*/

//107

// Find a total number of alphabets, digits or special character in a string.
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    scanf("%s",str);
    int len = strlen(str);
    int alpha=0,digit=0, special_char=0;
    for (int i = 0; i < len; i++)
    {
        if(str[i]<='A'&& str[i]>='Z'){
            alpha++;
        }
        else if(str[i]>='a'&& str[i]<='z'){
            alpha++;
        }
        else if(str[i]>='0'&& str[i]<='9'){
            digit++;
        }
        else{
            special_char++;
        }
    }
    
    printf("Alphabet: %d , Digits: %d , Special Characters: %d",alpha,digit,special_char);
    return 0;
}*/

//108

//. Find the first occurrence of a character in a given string. 
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    scanf("%s", str);

    char ch;
    printf("Enter the character for searching: ");
    scanf(" %c", &ch);

    int f=0;
    for (int i = 0; str[i] != 0; i++)
    {
        if(str[i] == ch){
            printf("The character is found at index %d",i);
            f=1;
            break;
        }
    }
    if(!f)
        printf("Character is not found");
}*/

//109

// Find the last occurrence of a character in a given string.
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    scanf("%s", str);

    char ch;
    printf("Enter the character for searching: ");
    scanf(" %c", &ch);

    int f=0,idx=0;
    for (int i = 0; str[i] != 0; i++)
    {
        if(str[i] == ch){
            idx= i;
            f=1;
        }
    }
    if(!f)
        printf("Character is not found");
    else
        printf("The character is found at index %d",idx);
    
    return 0;

}*/

//110

// Search all occurrences of a character in a given string.
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    scanf("%s", str);

    char ch;
    printf("Enter the character for searching: ");
    scanf(" %c", &ch);

    int f=0,idx[30];
    for (int i = 0; str[i] != 0; i++)
    {
        if(str[i] == ch){
            idx[f]= i;
            f++;
        }
    }

    printf("The all occurences of the given character are: \n");

    for (int k = 0; k < f; k++)
    {
        printf("%d ",idx[k]);
    }
    
    
    return 0;

}*/

//111

// Count occurrences of a character in a given string. 
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    scanf("%s", str);

    char ch;
    printf("Enter the character for searching: ");
    scanf(" %c", &ch);

    int f=0;
    for (int i = 0; str[i] != 0; i++)
    {
        if(str[i] == ch){
            f++;
        }
    }

    printf("The all occurences of the given character is %d \n",f);
    return 0;

}*/

//112

// Find highest frequency character in a string. 
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    scanf("%s",str);

    int freq[256]={0};

    for (int i = 0; str[i]!='\0'; i++)
    {
        freq[str[i]]++;
    }
    
    int max =0;
    char max_char;
    for (int j = 0; j < 256; j++)
    {
        if(max<freq[j]){
            max = freq[j];
            max_char = j;
        }
    }
    printf("The highest frequency character is %c",max_char);
    return 0;
}*/

//113

// Find lowest frequency character in a string.
/*
#include<stdio.h>
#include<string.h>
#include<limits.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    scanf("%s",str);

    int freq[256]={0};

    for (int i = 0; str[i]!='\0'; i++)
    {
        freq[str[i]]++;
    }
    
    int min = INT_MAX;
    char min_char = '\0';
    for (int j = 0; j < 256; j++)
    {
        if(min>freq[j] && freq[j]>0){
            min = freq[j];
            min_char = j;
        }
    }
    printf("The lowest frequency character is %c",min_char);
    return 0;
}*/

//114

// Count frequency of each character in a string. 
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    scanf("%s",str);

    int freq[256]={0};

    for (int i = 0; str[i]!='\0'; i++)
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

//115

// Remove the first occurrence of a character from a string. 
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    scanf("%s", str);

    char ch;
    printf("Enter the character for searching: ");
    scanf(" %c", &ch);

    int f=0;
    for (int i = 0; str[i] != 0; i++)
    {
        if(str[i] == ch){
            for (int j = i; str[j]!='\0' ;j++)
            {
                str[j] = str[j+1];
            }
            break;
        }

    }
    printf("%s",str);
}*/

//116

// Remove the last occurrence of a character from a string. 
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    scanf("%s", str);

    char ch;
    printf("Enter the character for searching: ");
    scanf(" %c", &ch);

    int f=0,idx=0;
    for (int i = 0; str[i] != 0; i++)
    {
        if(str[i] == ch){
            idx= i;
        }
    }
    for (int j = 0; str[j]!='\0'; j++)
    {
        if(j==idx){
            continue;
        }
        else{
            printf("%c",str[j]);
        }
    }
    
    return 0;

}*/

//117

// Delete all occurrences of a character from a string. 

/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    scanf("%s", str);

    char ch;
    printf("Enter the character for searching: ");
    scanf(" %c", &ch);

    for (int i = 0; str[i] != '\0'; i++)
    {
        if(str[i] == ch){
            continue;
        }
        else{
            printf("%c",str[i]);
        }
    }
    return 0;
}*/

//118

// Remove all repeated characters from a given string.
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    scanf("%s",str);
    int len = strlen(str);
    for (int i = 0; str[i]!='\0'; i++)
    {
        for (int j = i+1; str[j]!='\0'; j++)
        {
            if(str[i] == str[j]){
                for (int l = j; str[l]!='\0'; l++)
                {
                    str[l] = str[l+1];
                }
                
            }
            else{
                j++;
            }
        }
        
    }

    printf("%s",str);
    return 0;
}*/

//119

// Replace the first occurrence of a character with another in a string.

/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    scanf("%s", str);

    char ch;
    printf("Enter the character for searching: ");
    scanf(" %c", &ch);

    char ch1;
    printf("Enter the character for replacing: ");
    scanf(" %c", &ch1);

    int f=0;
    for (int i = 0; str[i] != 0; i++)
    {
        if(str[i] == ch){
            str[i] = ch1;
            break;
        }

    }
    printf("%s",str);
}*/

//120

// Replace the last occurrence of a character with another in a string. 
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    scanf("%s", str);

    char ch;
    printf("Enter the character for searching: ");
    scanf(" %c", &ch);

    char ch1;
    printf("Enter the character for replacing: ");
    scanf(" %c", &ch1);

    int f=0,idx=0;
    for (int i = 0; str[i] != 0; i++)
    {
        if(str[i] == ch){
            idx= i;
        }
    }
    str[idx] = ch1;
    printf("%s",str);
    
    return 0;

}*/

//121

// Put all occurrences of a character with another in a string. 

/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    scanf("%s", str);

    char ch;
    printf("Enter the character for replacing: ");
    scanf(" %c", &ch);

    char ch1;
    printf("Enter the character for inserting: ");
    scanf(" %c", &ch1);

    int i =0;
    for(i = 0 ; str[i] != '\0'; i++ ){
        if(str[i] == ch){
            str[i] = ch1;
        }
    }
    printf("%s",str);
    return 0;
}*/

//122

// Find the first occurrence of a word in a given string. 

/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    fgets(str, sizeof(str),stdin);
    str[strcspn(str,"\n")]='\0';

    char sub_str[20];
    printf("Enter the sub string: ");
    scanf("%s",sub_str);

    int str_len = strlen(str);
    int sub_strlen = strlen(sub_str);
    int f = 0;

    for (int i = 0; i < str_len - sub_strlen; i++)
    {
        if (strncmp(&str[i],sub_str,sub_strlen)==0)
        {
            printf("The word is found at index %d",i);
            f=1;
        }
        
    }
    if(!f)
        printf("The word is not found");
    return 0;
}*/

//123

// Find the last occurrence of a word in a given string.

/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    fgets(str, sizeof(str),stdin);
    str[strcspn(str,"\n")]='\0';

    char sub_str[20];
    printf("Enter the sub string: ");
    scanf("%s",sub_str);

    int str_len = strlen(str);
    int sub_strlen = strlen(sub_str);
    int f = -1;

    for (int i = 0; i < str_len - sub_strlen; i++)
    {
        if (strncmp(&str[i],sub_str,sub_strlen)==0)
        {
            
            f=i;
        }
        
    }
    if(f!=-1)
        printf("The word is  found at index %d",f);
    else
        printf("The word is not found");
    return 0;
}*/

//124

// Search all occurrences of a word in a given string.
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    fgets(str, sizeof(str),stdin);
    str[strcspn(str,"\n")]='\0';

    char sub_str[20];
    printf("Enter the sub string: ");
    scanf("%s",sub_str);

    int str_len = strlen(str);
    int sub_strlen = strlen(sub_str);
    int f=0 ,idx[10];

    for (int i = 0; i < str_len - sub_strlen; i++)
    {
        if (strncmp(&str[i],sub_str,sub_strlen)==0)
        {
            
            idx[f]=i;
            f++;
        }
        
    }
    if(f==0){
        printf("The word is not found");
    }
    for (int k = 0; k < f; k++)
    {
        printf("The word is  found at index %d\n",idx[k]);
    }
    return 0;
}*/

//125

// Count occurrences of a word in a given string. 
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    fgets(str, sizeof(str),stdin);
    str[strcspn(str,"\n")]='\0';

    char sub_str[20];
    printf("Enter the sub string: ");
    scanf("%s",sub_str);

    int str_len = strlen(str);
    int sub_strlen = strlen(sub_str);
    int f=0 ;

    for (int i = 0; i < str_len - sub_strlen; i++)
    {
        if (strncmp(&str[i],sub_str,sub_strlen)==0)
        {
            f++;
        }
        
    }
    if(f==0){
        printf("The word is not found");
    }
    else{
        printf("The word is found %d times",f);
    }
    return 0;
}*/

//126

// Remove the first occurrence of a word from string.

/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    fgets(str, sizeof(str),stdin);
    str[strcspn(str,"\n")]='\0';

    char sub_str[20];
    printf("Enter the sub string: ");
    scanf("%s",sub_str);

    int str_len = strlen(str);
    int sub_strlen = strlen(sub_str);
    int f = 0;

    for (int i = 0; i <= str_len - sub_strlen; i++)
    {
        if (strncmp(&str[i],sub_str,sub_strlen)==0)
        {
            for (int j = i; str[j]!='\0'; j++)
            {
                str[j] = str[j+sub_strlen];
            }
            break;
            
        }
        
    }
    for (int i = 0; str[i] !='\0' ; i++)
    {
        printf("%c",str[i]);
    }
    
}*/

//127

// Remove the last occurrence of a word in a given string. 
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter the string: ");
    fgets(str, sizeof(str),stdin);
    str[strcspn(str,"\n")]='\0';

    char sub_str[20];
    printf("Enter the sub string: ");
    scanf("%s",sub_str);

    int str_len = strlen(str);
    int sub_strlen = strlen(sub_str);
    int f = -1;

    for (int i = 0; i < str_len - sub_strlen; i++)
    {
        if (strncmp(&str[i],sub_str,sub_strlen)==0)
        {
            
            f=i;
        }
       
    }
    for (int j = f; j<str_len-sub_strlen; j++)
    {
        str[j] = str[j+sub_strlen];
    }
    printf("%s",str);
    
    return 0;
}*/

//128

//Delete all occurrence of a word in a given string. 

/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100],result[100];
    printf("Enter the string: ");
    fgets(str, sizeof(str),stdin);
    str[strcspn(str,"\n")]='\0';

    char sub_str[20];
    printf("Enter the sub string: ");
    scanf("%s",sub_str);

    int str_len = strlen(str);
    int sub_strlen = strlen(sub_str);
    int f=0 ,idx[10],i=0,j=0;

    while(i<str_len){
        if (strncmp(&str[i],sub_str,sub_strlen)==0)
        {
            
            i+= sub_strlen;
        }else{
            result[j++]=str[i++];
        }
    }
    result[j] ='\0';
    printf("%s",result);
    return 0;
}*/

//129

// A Trim leading white space characters from a given string. 

/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100],res[100];
    printf("Enter the character: ");
    fgets(str,sizeof(str),stdin);
    int j=0;

    while (str[j] == ' ')
    {
        j++;
    }
    
    for (int i = j; str[i] !='\0'; i++)
    {
        printf("%c",str[i]);
    }
    
    return 0;
}*/

//130

// Trim trailing white space characters from a given string. 

/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100],res[100];
    printf("Enter the character: ");
    fgets(str,sizeof(str),stdin);
    str[strcspn(str, "\n")] = '\0';
    int j=strlen(str);

    while (str[j-1] == ' '&&j>0)
    {
        j--;
    }
    
    res[j] ='\0';
    printf("%s",str);
    
    
    return 0;
}*/

//131

// Trim both leading and trailing white space characters from a given string.
/*
#include<stdio.h>
#include<string.h>

int main(){
    char str[100],res[100];
    printf("Enter the character: ");
    fgets(str,sizeof(str),stdin);
    str[strcspn(str, "\n")] = '\0';
    int start = 0;
    int end = strlen(str)-1;

    while(str[start]==' '){
        start++;
    }
    while (str[end]==' ')
    {
        end--;
    }
    int j=0;
    for (int i = start; i < end; i++)
    {
        res[j++] = str[i];
    }
    res[j]='\0';
    printf("%s",res);
    return 0;

}*/

//132

// Add two numbers using pointers. 
/*
#include<stdio.h>
int add(int *a, int *b){
    return *a + *b;
}
int main(){
    int a,b;
    printf("Enter the two numbers respectively: ");
    scanf("%d %d",&a,&b);
    int res = add(&a,&b);
    printf("The sum is : %d",res);
    return 0;
}*/

//133

// Swap two numbers using pointers. 

/*
#include<stdio.h>
void swap(int *a, int *b){
    int t= *a;
    *a = *b;
    *b =t;
}
int main(){
    int a,b;
    printf("Enter the two numbers of a and b respectively: ");
    scanf("%d %d",&a,&b);
    swap(&a,&b);
    printf("a: %d, b:%d",a,b);
    return 0;
}*/

//134

// Input and print array elements using a pointer. 
/*
#include<stdio.h>

int main(){
    int n;
    printf("Enter the no. of inputs: ");
    scanf("%d",&n);
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter the element %d: ",i+1);
        scanf("%d",(arr+i));
    }
    for (int i = 0; i < n; i++)
    {
        printf("%d ",*(arr+i));
    }
    return 0;
}*/

//135

// Copy one array to another using pointer. 
/*
#include<stdio.h>

int main(){
    int n;
    printf("Enter the no. of inputs: ");
    scanf("%d",&n);
    int arr[n],cpy[n];

    for (int i = 0; i < n; i++)
    {
        printf("Enter the element %d: ",i+1);
        scanf("%d",(arr+i));
    }

    printf("Main array:\n");
    for (int i = 0; i < n; i++)
    {
        printf("%d ",*(arr+i));
    }

    printf("\n");

    int *p = cpy;
    for (int i = 0; i < n; i++)
    {
        *(p+i) = arr[i];
    }

    printf("Copied array:\n");
    for (int i = 0; i < n; i++)
    {
        printf("%d ",*(cpy+i));
    }
    
    return 0;
}*/

//136

//Swap two arrays using pointers. 
/*
#include<stdio.h>

int main(){
    //The first array
    int n,i;
    printf("Enter the no. of elements: ");
    scanf("%d",&n);
    int arr1[n];
    for ( i = 0; i < n; i++)
    {
        printf("Enter the element %d: ",i+1);
        scanf("%d",&arr1[i]);
    }
    printf("\n\n");
    //The second array
    //printf("Enter the no. of elements: ");
    // scanf("%d",&n);
    int arr2[n];
    for ( i = 0; i < n; i++)
    {
        printf("Enter the element %d: ",i+1);
        scanf("%d",&arr2[i]);
    }
    int *p1 = arr1;
    int *p2 = arr2;
    int *temp = p1;
    p1 = p2;
    p2 = temp;

    printf("swapped arrays:\n");
    for (int i = 0; i < n; i++)
    {
        printf("%d ",*(p1+i));
    }
    printf("\n");
    for (int i = 0; i < n; i++)
    {
        printf("%d ",*(p2+i));
    }
    
    
    return 0;
}*/

//137

// Reverse an array using pointers. 

/*
#include<stdio.h>

int main(){
    //The first array
    int n,i;
    printf("Enter the no. of elements: ");
    scanf("%d",&n);
    int arr1[n];
    for ( i = 0; i < n; i++)
    {
        printf("Enter the element %d: ",i+1);
        scanf("%d",&arr1[i]);
    }

    int *start = &arr1[0];
    int *end = &arr1[n-1];
    int temp;
    while (start<end)
    {
        temp = *start;
        *start = *end;
        *end = temp;
        start++;
        end--;
    }
    
    for (int i = 0; i < n; i++)
    {
        printf("%d ",*(arr1+i));
    }
    
    
    return 0;
}*/

//138

//. Search an element in an array using pointers
/*
#include<stdio.h>

int main(){
    //The first array
    int n,i;
    printf("Enter the no. of elements: ");
    scanf("%d",&n);
    int arr[n];
    for ( i = 0; i < n; i++)
    {
        printf("Enter the element %d: ",i+1);
        scanf("%d",&arr[i]);
    }

    int ele,f=0;
    printf("Enter the element for searching: ");
    scanf("%d",&ele);

    int *p = arr;
    int l;
    for ( i = 0; i < n; i++)
    {
        if(*(p+i) == ele){
            f=1;
            l=i;
            break;
        }
    }
    
    if(f){
        printf("The ele is found at index %d",i);
    }
    else{
        printf("The element is not found");
    }

    return 0;
}*/

//139

// Access two-dimensional array using pointers.
/*
#include<stdio.h>

int main(){
    int m,n;
    printf("Enter the no. of rows columns: ");
    scanf("%d %d",&m,&n);
    int arr[m][n];
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("Enter the element [%d][%d]:",i+1,j+1);
            scanf("%d",&arr[i][j]);
        }
        
    }
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("%d ",*(*(arr+i)+j));
        }
        printf("\n");
    }
    
    return 0;
}*/

//140

// Add two matrix using pointers.
/*
#include<stdio.h>

int main(){
    int m,n;
    printf("Enter the no. of rows columns: ");
    scanf("%d %d",&m,&n);
    int arr[m][n];
    //For first matrix
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("Enter the element [%d][%d]:",i+1,j+1);
            scanf("%d",&arr[i][j]);
        }
    }
    //For second matrix
    printf("\n\n");
    int arr2[m][n];
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("Enter the element [%d][%d]:",i+1,j+1);
            scanf("%d",&arr2[i][j]);
        }
    }
    int sum [m][n];

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
           *(*(sum+i)+j) = *(*(arr+i)+j)  +  *(*(arr2+i)+j);
        }

    }
    
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("%d ",*(*(sum+i)+j));
        }
        printf("\n");
    }
    
    return 0;
}*/

//141

// Multiply two matrix using pointers. 
/*
#include<stdio.h>

int main(){
    int m,n;
    printf("Enter the no. of rows columns: ");
    scanf("%d %d",&m,&n);
    int arr[m][n];
    //For first matrix
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("Enter the element [%d][%d]:",i+1,j+1);
            scanf("%d",&arr[i][j]);
        }
    }
    //For second matrix
    printf("\n\n");
    int arr2[m][n];
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("Enter the element [%d][%d]:",i+1,j+1);
            scanf("%d",&arr2[i][j]);
        }
    }
    int mul [m][n];
    int s = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
           for (int k = 0; k < n; k++)
           {
                s += *(*(arr+i)+k) * *(*(arr2+k)+j);
           }
           mul[i][j] = s;
           
        }

    }
    
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("%d ",*(*(mul+i)+j));
        }
        printf("\n");
    }
    
    return 0;
}*/

//142

// Find the length of string using pointers.
/*
#include<stdio.h>
#include<string.h>

int str_length(char *str){
    int i,count=0;
    for ( i = 0; str[i]!='\0'; i++)
    {
        count++;
    }
    return count;
}
int main(){
    char str[100];
    printf("Enter the string: ");
    scanf("%s",str);
    int len = str_length(str);
    printf("The len of the string is :%d",len);
    return 0;
}*/

//143

// In short How to Copy one string to another using pointer.
/*
#include<stdio.h>
#include<string.h>

void str_cpy(char *str, char * cpy){
    int i,count=0;
    for ( i = 0; str[i]!='\0'; i++)
    {
        *(cpy+i) = *(str+i);
    }
    cpy[i] = '\0';
}
int main(){
    char str[100],cpy[100];
    printf("Enter the string: ");
    scanf("%s",str);
    str_cpy(str,cpy);
    printf("The copied string is :%s",cpy);
    return 0;
}*/

//144

//Concatenate two strings using pointers. 
/*
#include<stdio.h>
#include<string.h>

void str_concat(char *str1, char * str2, char *concat){
    int k=0;
    for (int i = 0; str1[i]!='\0'; i++)
    {
        *(concat+k) = *(str1+i);
        k++; 
    }
     for (int i = 0; str2[i]!='\0'; i++)
    {
        *(concat+k) = *(str2+i);
        k++; 
    }
    concat[k] = '\0';
}
int main(){
    char str1[100],str2[100],concat[100];
    printf("Enter the string: ");
    scanf("%s",str1);
    printf("Enter the string: ");
    scanf("%s",str2);
    str_concat(str1,str2,concat);
    printf("The concated string is :%s",concat);
    return 0;
}*/

//145

//  Compare two strings using pointers. 
/*
#include<stdio.h>
#include<string.h>

void str_compare(char *str1, char * str2){
    int f =1;
    for (int i = 0; str1[i]!='\0', str2[i]!='\0'; i++)
    {
        if(*(str1+i) != *(str2+i)){
            f=0;
            break;
        }
    }
    if(f)
        printf("Both strings are same");
    else
        printf("Strings are not same");
}
int main(){
    char str1[100],str2[100];
    printf("Enter the string: ");
    scanf("%s",str1);
    printf("Enter the string: ");
    scanf("%s",str2);
    str_compare(str1,str2);
    return 0;
}*/

//146

// Find reverse of a string using pointers.
/*
#include<stdio.h>
#include<string.h>

int reverse(char *str, char *rev){
    int len = strlen(str),i;
    for ( i = 0; i<len; i++)
    {
        *(rev+i) = *(str+(len-i-1));
    }
    rev[len] = '\0';
}
int main(){
    char str[100],rev[100];
    printf("Enter the string: ");
    scanf("%s",str);
    reverse(str,rev);
    printf("The reversed string is :%s",rev);
    return 0;
}*/

//147

// Sort array using pointers.
/*
#include<stdio.h>
void bubble_sort(int *arr, int n){
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n-i-1; j++)
        {
            if( *(arr+j) > *(arr+j+1) ){
                int t = *(arr+j);
                *(arr+j) = *(arr+j+1);
                *(arr+j+1) = t;
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
        printf("Enter the element %d:",i+1);
        scanf("%d",(arr+i));
    }

    bubble_sort(arr,n);
    for (int i = 0; i < n; i++)
    {
        printf("%d ",*(arr+i));
    }
    
    return 0;
}*/

//148

// Return multiple values from a function using pointers. 
/*
#include<stdio.h>
void multiple_val(int *a, int *b, int *sum , int * product){
    *sum = *a +*b;
    *product = *a * *b;
}
int main(){
    int a,b;
    printf("Enter two numbers respectively: ");
    scanf("%d %d",&a,&b);
    int sum,product;
    multiple_val(&a,&b,&sum,&product);
    printf("The sum is: %d\n",sum);
    printf("The product is:%d",product);
    return 0;
}*/

//149

//. Cube of any number using the function.
/*
#include<stdio.h>

int cube(int num){
    int f =1;
    for (int i = 0; i < 3; i++)
    {
        f=f*num;
    }
    return f;
}

int main(){
    int num;
    printf("Enter the number : ");
    scanf("%d",&num);
    int c= cube(num);
    printf("The cube of the number is: %d",c);
    return 0;
}*/

//150

// Find diameter, circumference and area of a circle using functions. 
/*
#include<stdio.h>

float dia(float radius){
    return radius*2;
}

float circum(float radius){
    return 2*3.14*radius;
}

float area(float radius){
    return 3.14*radius*radius;
}

int main(){
    float radius;
    printf("Enter the radius of the circle :");
    scanf("%f",&radius);
    printf("The diameter of the circle is %.2f\n",dia(radius));
    printf("The circumference of the circle is %.2f\n",circum(radius));
    printf("The area of the circle is %.2f\n",area(radius));
    return 0;
}*/

