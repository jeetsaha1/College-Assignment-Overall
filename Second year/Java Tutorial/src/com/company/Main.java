package com.company;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        // 1. Practice set
        /* Write a program to calculate percentage of a given student in CBSE board exam.
        His marks from 5 subjects must be taken as input. (Marks are out of 100)*/

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the marks for subject 1: ");
//        float num1 =  input.nextFloat();
//        System.out.println("Enter the marks for subject 2: ");
//        float num2 =  input.nextFloat();
//        System.out.println("Enter the marks for subject 3: ");
//        float num3 =  input.nextFloat();
//        System.out.println("Enter the marks for subject 4: ");
//        float num4 =  input.nextFloat();
//        System.out.println("Enter the marks for subject 5: ");
//        float num5 =  input.nextFloat();
//
//        float percentage = ((num1 + num2 + num3 + num4 + num5)/500)*100;
//
//        System.out.println("The Average marks of the student is : ");
//        System.out.print(percentage);

        /*///////////////////////////////////////////////////////////////////////////////////////*/
        //2. Write a program to sum of three numbers

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter the number: ");
//        int num2 = sc.nextInt();
//        System.out.println("Enter the number: ");
//        int num3 = sc.nextInt();
//        System.out.println("The sum of the three numbers is : ");
//        System.out.print(num1+num2+num3);

        /*///////////////////////////////////////////////////////////////////////////////////////*/
        // Write a program to calculate CGPA using marks of three subjects

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of subject 1: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter the number of subject 2: ");
//        int num2 = sc.nextInt();
//        System.out.println("Enter the number of subject 3: ");
//        int num3 = sc.nextInt();
//
//        double cgpa = ((num1/10.0)+(num2/10.0)+(num3/10.0))/3;
//
//        System.out.print("The CGPA is : ");
//        System.out.println(cgpa);

        /*///////////////////////////////////////////////////////////////////////////////////////*/
        // Write a program which asks the user to enter name and greet them by "Hello <name>, have a good day." text.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please Enter your name: ");
//        String str = sc.next();
//        System.out.print("Hello ");
//        System.out.print(str);
//        System.out.println(", have a good day");

        /*///////////////////////////////////////////////////////////////////////////////////////*/
        // Write a program to convert kilometer to meter

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length in kilometer (km): ");
//        int kilo = sc.nextInt();
//        System.out.println("The length in metre (m) : ");
//        System.out.println(kilo*1000);

        /*///////////////////////////////////////////////////////////////////////////////////////*/
        // Write a program to check whether is integer or not
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        double num = sc.nextDouble();
//        if(num == (int)num){
//            System.out.println("The number is integer.");
//        }
//        else{
//            System.out.println("The number is decimal");
//        }

        /*///////////////////////////////////////////////////////////////////////////////////////*/
        // Write a program to encrypt a grade by adding 8 and decrypt it to show actual grade

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        double grade = sc.nextDouble();
//        double enc = grade+8;
//        System.out.print("The encrypted number is:");
//        System.out.println(enc);
//        System.out.print("The decrypted number is:");
//        System.out.println(enc-8);

        /*///////////////////////////////////////////////////////////////////////////////////////*/
        // Write the expression (v^2 - u^2)/(2*a*5)

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of v: ");
//        int v = sc.nextInt();
//        System.out.println("Enter the value of u: ");
//        int u = sc.nextInt();
//        System.out.println("Enter the value of a: ");
//        int a = sc.nextInt();
//
//        double exp = ((v*v)-(u*u) *1.0) / (2*a*5);
//        System.out.println(exp);

        /*///////////////////////////////////////////////////////////////////////////////////////*/
        // Convert string to lowercase

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the string: ");
//        String str = sc.next();
//        System.out.println(str.toLowerCase());

        /*///////////////////////////////////////////////////////////////////////////////////////*/
        // Replace spaces with underscores

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the string: ");
//        String str = sc.nextLine();
//        System.out.println(str.replace(' ','_'));

        /*///////////////////////////////////////////////////////////////////////////////////////*/
        // Replace the name in quote " Dear <name>, thanks a lot" with another name

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the name: ");
//        String str = sc.next();
//        System.out.println("Dear "+str+", thanks a lot");
//
//        System.out.print("Enter the new name: ");
//        String str2 = sc.next();
//        System.out.println("Dear "+str2+", thanks a lot");


        /*///////////////////////////////////////////////////////////////////////////////////////*/
        // Detect whether double or triple spaces are there or not

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the string: ");
//        String str = sc.nextLine();
//        if (str.contains("   ")){
//            System.out.println("Triple spaces is detected.");
//        }
//        else if (str.contains("  ")){
//            System.out.println("Double spaces is detected.");
//        }
//        else{
//            System.out.println("No double or triple spaces.");
//        }

        /*///////////////////////////////////////////////////////////////////////////////////////*/
        // To find out whether a student is pass or fail. If it requires total 40 % and at least 33% in each subject.to pass in 3 subject

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of subject 1: ");
//        float num1 = sc.nextFloat();
//        System.out.println("Enter the number of subject 2: ");
//        float num2 = sc.nextFloat();
//        System.out.println("Enter the number of subject 3: ");
//        float num3 = sc.nextFloat();
//
//        float total = num1+num2+num3;
//
//        if (num1 > 33 && num2 > 33 && num3 > 33 && total >40){
//            System.out.println("The student is passed");
//        }
//        else{
//            System.out.println("The student is not passed");
//        }

        /*///////////////////////////////////////////////////////////////////////////////////////*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the income: ");
//        float income = sc.nextFloat();
//        float res = 0;
//        if(income < 250000){
//            res = income;
//        }
//        else if(income > 250000 && income <500000){
//            res = ((income*5)/100);
//        }
//        else if(income > 500000 && income <1000000){
//            res = ((income*20)/100);
//        }
//        else if(income > 100000){
//            res = income+((income*30)/100);
//        }
//        else{
//            System.out.println("Enter valid value.");
//        }
//        System.out.println("The Tax is: "+res);
//        sc.close();
        /*///////////////////////////////////////////////////////////////////////////////////////*/
        // To print day on the given no. basis
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number for predicting days: (Between 1-7) ");
//        int num = sc.nextInt();
//        switch (num){
//            case 1:
//                System.out.println("Today is Monday");
//                break;
//            case 2:
//                System.out.println("Today is Tuesday");
//                break;
//            case 3:
//                System.out.println("Today is Wenesday");
//                break;
//            case 4:
//                System.out.println("Today is Thursday");
//                break;
//            case 5:
//                System.out.println("Today is Friday");
//                break;
//            case 6:
//                System.out.println("Today is Saturday");
//                break;
//            case 7:
//                System.out.println("Today is Sunday");
//                break;
//            default:
//                System.out.println("You have given wrong input, please try again ");
//        }
//        sc.close();

        /*///////////////////////////////////////////////////////////////////////////////////////*/
        // Print the pattern
        //* * * *
        //* * *
        //* *
        //*

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the no. of lines: ");
//        int num = sc.nextInt();
//        for (int i = 0; i<num; i++){
//            for (int j = num; j > i; j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        /*///////////////////////////////////////////////////////////////////////////////////////*/
        // Sum of first n even numbers using while loop
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        int num = sc.nextInt();
//        int i = 0;
//        int sum = 0;
//        while(i<=num){
//            if (i%2 == 0){
//                sum += i;
//            }
//            i++;
//        }
//        System.out.println("The output is : "+sum);

        /*///////////////////////////////////////////////////////////////////////////////////////*/

        // Multiplication table for given number n
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number :");
//        int n = sc.nextInt();
//
//        for(int i = 1; i<= 10 ; i++){
//            System.out.println(n+"*"+i+"="+(n*i));
//        }
//        sc.close();

        /*///////////////////////////////////////////////////////////////////////////////////////*/
        // Print multiplication of 10 in reverse order

//        int n = 10;
//        for(int i = 10; i >= 1 ; i--){
//            System.out.println(n+"*"+i+"="+(n*i));
//        }

        /*///////////////////////////////////////////////////////////////////////////////////////*/
        // Factorial

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number :");
//        int n = sc.nextInt();
//        int fact = 1;
//        for(int i = 1; i<= n ; i++){
//            fact *= i;
//        }
//        System.out.println("The factorial of "+n+" is : "+fact);
//        sc.close();

        /*///////////////////////////////////////////////////////////////////////////////////////*/

        //Calculate the sum of the numbers occurring in the multiplication table of 8

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number :");
//        int n = sc.nextInt();
//        int sum = 0;
//        for(int i = 1; i<= 10 ; i++){
//            sum += (n*i);
//        }
//        System.out.println(sum);
//        sc.close();

        /*///////////////////////////////////////////////////////////////////////////////////////*/
        // Create an array of 5 floats and calculate their sum
//        Scanner sc = new Scanner(System.in);
//        float []arr = new float [5];
//        for (int i = 0; i < 5; i++){
//            System.out.print("Enter the number  "+(i+1) + ": ");
//            arr[i] = sc.nextFloat();
//        }
//        int sum = 0;
//        for (int i = 0; i < 5; i++){
//            sum += arr[i];
//        }
//        System.out.println("The sum of the 5 numbers : "+sum);

        /*///////////////////////////////////////////////////////////////////////////////////////*/
        // Check whether a given integer is present in array or not
//        Scanner sc = new Scanner(System.in);
//        int []arr = new int [5];
//        for (int i = 0; i < 5; i++){
//            System.out.print("Enter the number  "+(i+1) + ": ");
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Enter the number for searching: ");
//        int num = sc.nextInt();
//        for (int i = 0; i < 5; i++){
//            if (arr[i] == num) {
//                System.out.println("The element is found at index: "+i);
//                break;
//            }
//        }
        /*///////////////////////////////////////////////////////////////////////////////////////*/
        // Calculate the avg marks from an array containing marks of all students in Physics using for-each loop
//        Scanner sc = new Scanner(System.in);
//        float []arr = new float [5];
//        for (int i = 0; i < 5; i++){
//            System.out.print("Enter the marks  "+(i+1) + ": ");
//            arr[i] = sc.nextFloat();
//        }
//        float sum = 0;
//        for (float mark : arr){
//            sum += mark;
//        }
//
//        float avg = sum/arr.length;
//        System.out.println("The acg marks in Physics : "+avg);
        /*///////////////////////////////////////////////////////////////////////////////////////*/
//        Scanner sc = new Scanner(System.in);
//        int [][]arr1 = new int [2][3];
//        int [][]arr2 = new int [2][3];
//        int [][]arr3 = new int [2][3];
//
//        for(int i = 0; i < 2 ; i++){
//            for (int j = 0; j < 3; j++) {
//                System.out.print("Enter the number "+(i)+(j)+" : ");
//                arr1[i][j] = sc.nextInt();
//            }
//        }
//        for(int i = 0; i < 2 ; i++){
//            for (int j = 0; j < 3; j++) {
//                System.out.print("Enter the number "+(i)+(j)+" : ");
//                arr2[i][j] = sc.nextInt();
//            }
//        }
//
//        for(int i = 0; i < 2 ; i++){
//            for (int j = 0; j < 3; j++) {
//                arr3[i][j] = arr1[i][j] + arr2[i][j];
//            }
//        }
//
//        for(int i = 0; i < 2 ; i++){
//            for (int j = 0; j < 3; j++) {
//                System.out.print(" "+arr3[i][j]+" ");
//            }
//            System.out.println();
//        }
        /*///////////////////////////////////////////////////////////////////////////////////////*/
        //Reverse an array
//        Scanner sc = new Scanner(System.in);
//        int []arr = new int [5];
//        int []arr1 = new int [5];
//        for (int i = 0; i < 5; i++){
//            System.out.print("Enter the number  "+(i+1) + ": ");
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < 5; i++)
//            arr1[i] = arr[4-i];
//        for (int i = 0; i < 5 ; i++)
//            System.out.print(arr1[i]+" ");

        /*///////////////////////////////////////////////////////////////////////////////////////*/
        //Find the maximum element in an array
//        Scanner sc = new Scanner(System.in);
//        int []arr = new int[5];
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Enter the number "+(i+1)+":");
//            arr[i] = sc.nextInt();
//        }
//        int max = 0;
//        for(int i = 0; i < 5 ; i++)
//            if(max < arr[i])
//                max = arr[i];
//        System.out.println("The maximum element is: "+max);

        /*///////////////////////////////////////////////////////////////////////////////////////*/
        //Find the minimum element in an array
//        Scanner sc = new Scanner(System.in);
//        int []arr = new int[5];
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Enter the number "+(i+1)+":");
//            arr[i] = sc.nextInt();
//        }
//        int min = 999999;
//        for(int i = 0; i < 5 ; i++)
//            if(min > arr[i])
//                min = arr[i];
//        System.out.println("The maximum element is: "+min);

        /*///////////////////////////////////////////////////////////////////////////////////////*/
        // Check whether an array is sorted or not
//        Scanner sc = new Scanner(System.in);
//        int []arr = new int[5];
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Enter the number "+(i+1)+":");
//            arr[i] = sc.nextInt();
//        }
//        int sorted = 0;
//        for(int i = 0; i < 4 ; i++) {
//            if (arr[i] > arr[i + 1]) {
//                sorted = 0;
//                break;
//            } else {
//                sorted = 1;
//            }
//        }
//
//        if(sorted == 1)
//            System.out.println(("The array is sorted."));
//        else
//            System.out.println("The array is not sorted");

        /*///////////////////////////////////////////////////////////////////////////////////////*/

    }
}