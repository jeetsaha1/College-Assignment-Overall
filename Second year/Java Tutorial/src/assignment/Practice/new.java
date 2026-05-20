class Print {
public void printCount() {
for(int i = 5; i > 0; i--) {
System.out.println("Counter --- " + i );
}
}
}
class abc extends Thread {
public void run() {
Print pd=new Print();
synchronized(pd) {System.out.println("Starting thread");}
pd.printCount();
System.out.println("Thread exiting.");
}
}
public class new {
public static void main(String args[]) {
abc a = new abc();
abc b = new abc();
a.start();
b.start();
}
}