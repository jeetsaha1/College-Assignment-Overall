package function_methods.com;


// For the class of Pen and fountain pen
abstract class Pen{
    abstract public void Write();
    abstract public void Refill();
}

class FountainPen extends Pen{
    public void ChangeNib(){
        System.out.println("Changing the nib");
        System.out.println("Changing completed");
    }

    public void Write(){
        System.out.println("Writing...");
    }

    public void Refill(){
        System.out.println("Refilling the ink");
    }
}

class Monkey{
    public void jump(){
        System.out.println("Jumping...");
    }
    public void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{
    public void Eat();
    public void Sleep();
}

class Human extends Monkey implements BasicAnimal{
    public void Eat(){
        System.out.println("Eating...");
    }

    public void Sleep(){
        System.out.println("Sleeping...");
    }
}

abstract class Telephone{
    abstract public void Ring();
    abstract public void Lift();
    abstract public void Disconnect();
}

class SmartTelephone extends Telephone{
    public void Ring(){
        System.out.println("Ringing...");
    }
    public void Lift(){
        System.out.println("Taking the call...");
    }
    public void Disconnect(){
        System.out.println("Disconnecting...");
    }
}


interface TVRemote{
    public void ON();
    public void OFF();
    public void Control();
}

interface SmartTVRemote extends TVRemote{
    public void GetNetwork();
    public void SmartAutomation();
}

class TV implements SmartTVRemote{
    public void ON(){
        System.out.println("Switch on the TV.");
    }
    public void OFF(){
        System.out.println("Switch off the TV.");
    }
    public void Control(){
        System.out.println("Controlling...");
    }
    public void GetNetwork(){
        System.out.println("Getting the network...");
    }
    public void SmartAutomation(){
        System.out.println("Automating");
    }
}

public class prog13 {
    public static void main(String[] args) {
        /*

        this is for pen and fountain pen  ✒️

        FountainPen fp = new FountainPen();
        fp.Write();
        fp.Refill();
        fp.ChangeNib();

        // For human 🙂
        Human Jeet = new Human();
        Jeet.Eat();
        Jeet.jump();
        Jeet.Sleep();


        // For Mobile 📱
        Telephone phone = new SmartTelephone();
        phone.Ring();
        phone.Lift();
        phone.Disconnect();
        */


    }
}
