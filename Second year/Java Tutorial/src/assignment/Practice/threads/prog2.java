class A{}

class B{}

class Thread1 extends Thread{
    A a;
    B b;

    Thread1(A a, B b){
        this.a = a;
        this.b = b;
    }
    public void run(){
        synchronized (a) {
            System.out.println("Thread A");
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
            synchronized (b) {
                System.out.println("Thread B");
            }
        }
    }
}

class Thread2 extends Thread {
    A a;
    B b;

    Thread2(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        synchronized(b) {
            System.out.println("Thread2 locked B");

            try { Thread.sleep(100); } catch (Exception e) {}

            synchronized(a) {
                System.out.println("Thread2 locked A");
            }
        }
    }
}

public class prog2 {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        Thread1 t1 = new Thread1(a, b);
        Thread2 t2 = new Thread2(a, b);

        t1.start();
        t2.start();
    }
}