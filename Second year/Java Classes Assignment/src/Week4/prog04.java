package Week4;
//4. Write a Java program to show method hiding.

class Animal1{
    static void sound(){
        System.out.println("The animal barks");
    }
}

class Cat extends Animal1{
    static void sound(){
        System.out.println("Cat meows");
    }
}
public class prog04 {
    public static void main(String[] args) {
        Animal1 animal = new Animal1();
        Animal1 cat = new Cat();
        animal.sound();
        cat.sound();
    }
}

