package Week3;

import java.util.Scanner;

//2. Write a Java program to implement stack using array.
class StackArray{
    int maxSize;
    int[] stack;
    int top;

    StackArray(int size){
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    void push(int ele){
        if(top == maxSize-1){ System.out.println("Stack Overflow");}
        else{
            top++;
            stack[top] = ele;
            System.out.println(ele + "pushed into stack");
        }
    }

    int pop(){
        int item = -1;
        if(top == -1){ System.out.println("Stack Underflow");}
        else{
            item = stack[top];
            top--;
        }
        return item;
    }

    void display(){
        if(top == -1){System.out.println("Stack Underflow");}
        else{
            for (int i =0; i<= top; i++){
                System.out.print(" " + stack[i] + " ");
            }
        }
    }

    int peek(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            return stack[top];
        }
    }
}
public class prog02 {
    public static void main(String[] args) {
        StackArray stack = new StackArray(10);
        int ch =-1;
        do {
            System.out.println("____MENU____\n" +
                    "1.Push\n" +
                    "2.Pop\n" +
                    "3.Peek\n" +
                    "4.Display\n" +
                    "5.Exit\n" +
                    "Which one do you choose :");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter the element: ");
                    int ele = sc.nextInt();
                    stack.push(ele);
                    break;
                case 2:
                    int popOut = stack.pop();
                    System.out.println(popOut);
                    break;
                case 3:
                    System.out.println("The top element of the stack" + stack.peek());
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Wrong input, Try again");
            }
        } while(ch!=5);
    }
}
