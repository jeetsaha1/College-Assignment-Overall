package Week6;
//5. Create three interfaces, each with two methods. Inherit a new interface from the three,
//        adding a new method. Create a class by implementing the new interface and also
//        inheriting from a concrete class. Now write four methods, each of which takes one of the
//        four interfaces as an argument. In main ( ), create an object of your class and pass it to
//        each of the methods.

class BaseClass{
    void baseClassMethod(){
        System.out.println("This is from base class");
    }
}

interface A{
    void methodA1();
    void methodA2();
}
interface B{
    void methodB1();
    void methodB2();
}
interface C{
    void methodC1();
    void methodC2();
}
interface D extends A, B, C{
    void methodD1();
}

class DerivedClass extends BaseClass implements D{
    public void methodA1(){System.out.println("Method A1");}
    public void methodA2(){System.out.println("Method A2");}
    public void methodB1(){System.out.println("Method B1");}
    public void methodB2(){System.out.println("Method B2");}
    public void methodC1(){System.out.println("Method C1");}
    public void methodC2(){System.out.println("Method C2");}
    public void methodD1(){System.out.println("Method D1");}
}

public class prog05 {
    static void useA(A obj){
        obj.methodA1();
        obj.methodA2();
    }
    static void useB(B obj){
        obj.methodB1();
        obj.methodB2();
    }
    static void useC(C obj){
        obj.methodC1();
        obj.methodC2();
    }
    static void useD(D obj){
        obj.methodD1();
    }
    public static void main(String[] args) {

        DerivedClass obj = new DerivedClass();

        obj.baseClassMethod();

        useA(obj);
        useB(obj);
        useC(obj);
        useD(obj);
    }
}

