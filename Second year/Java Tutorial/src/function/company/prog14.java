package function_methods.com;

/* Write a program to print "Good Morning" and "Welcome" continuously on the screen in Java using threads. */
/* Add a sleep method in welcome thread of 1 to delay its execution for 200 ms*/
/* Demonstrate getPriority() and setPriority() methods in Java threads */
/* How to get state of a given thread in java */
/* How to get reference to the current in Java*/

class Thr1 extends Thread{
    @Override
    public void run(){
//        int i = 0;
//        while (i<4000) {
//            System.out.println("Good Morning");
//            i++;
//        }
    }
}

class Thr2 extends Thread{
    @Override
    public void run(){
        try{
            Thread.sleep(200);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Welcome");

    }
}

public class prog14 {
    public static void main(String[] args) {
        Thr1 t1 = new Thr1();
        Thr2 t2 = new Thr2();
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        t1.start();
        t2.start();
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
