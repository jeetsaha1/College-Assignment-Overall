package function_methods.com;

// Create a class cellphone with methods to print ringing... , vibrating....

class cellphone{
    public void callFriend(String name){
        System.out.println("Calling "+name+"...");
    }

    public void ring(){
        System.out.println("Ringing...");
    }

    public void Vibrate(){
        System.out.println("Vibrating...");
    }
}
public class prog8 {
    public static void main(String[] args) {
        String name = "Soham";
        cellphone phn  = new cellphone();
        phn.callFriend(name);
        phn.ring();
        phn.Vibrate();
    }
}
