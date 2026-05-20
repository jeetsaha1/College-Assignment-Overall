package Week3;
//3. Write a Java program to implement Queue using array.

import java.util.Scanner;

class QueueArray{
    int[] queue;
    int f,r,size;

    QueueArray(int size){
        this.size = size;
        queue = new int[size];
        f = r = -1;
    }

    void enqueue(int ele){
        if(r == size - 1){
            System.out.println("Queue Overflow");
        }
        else{
            r++;
            queue[r] = ele;
            System.out.println(ele + " is enqueued in queue");
        }
    }

    int dequeue(){
        int item = -1;
        if(f == r){
            System.out.println("Queue Underflow");
        }
        else{
            f++;
            item = queue[f];
        }
        return item;
    }

    void display(){
        if(f == r){
            System.out.println("Queue Underflow");
        }
        else{
            for(int i = f+1; i <=r;i++){
                System.out.print(" " + queue[i] + " ");
            }
        }
    }
}
public class prog03 {
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(10);
        int ch =-1;
        do {
            System.out.println("____MENU____\n" +
                    "1.Enqueue\n" +
                    "2.Dequeue\n" +
                    "3.Display\n" +
                    "4.Exit\n" +
                    "Which one do you choose :");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter the element: ");
                    int ele = sc.nextInt();
                    queue.enqueue(ele);
                    break;
                case 2:
                    int dequeued= queue.dequeue();
                    System.out.println(dequeued);
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Wrong input, Try again");
            }
        } while(ch!=4);
    }
}
