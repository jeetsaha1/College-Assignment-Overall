package Week6;
//7. Create an interface called Player. The interface has an abstract method called play()
//that displays a message describing the meaning of “play” to the class. Create classes
//        called Child, Musician, and Actor that all implement Player. Create an application
//that demonstrates the use of the classes(UsePlayer.java )

interface Player{
    public void play();
}
class Child implements Player{
    public void play(){
        System.out.println("Child plays football");
    }
}
class Musician implements Player{
    public void play(){
        System.out.println("Child plays Guitar");
    }
}
class Actor implements Player{
    public void play(){
        System.out.println("Actor plays Drama");
    }
}
public class prog07 {
    public static void main(String[] args) {
        Child child = new Child();
        child.play();
        Musician musician = new Musician();
        musician.play();
        Actor actor = new Actor();
        actor.play();
    }
}
