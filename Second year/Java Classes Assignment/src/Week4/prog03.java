package Week4;
//3. Write a Java program to show method overriding.

class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}

public class prog03 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.sound();
        dog.sound();
    }
}
