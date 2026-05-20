package Week6;
//15. Program to create a interface 'Mango' and implement it in classes 'Winter' and 'Summer'.
interface Mango {
    void taste();
}

class Winter implements Mango {
    public void taste() {
        System.out.println("Winter Mango: Sweet and soft");
    }
}

class Summer implements Mango {
    public void taste() {
        System.out.println("Summer Mango: Very juicy and tasty");
    }
}

public class prog15 {
    public static void main(String[] args) {

        Winter w = new Winter();
        Summer s = new Summer();

        w.taste();
        s.taste();
    }
}