// import java.io.*;
// public class prog2{
//     public static void main(String[] args) throws IOException{
//         String str = "This is a book of Java."+"\nI am the learner of Java.";
//         FileWriter fw = new FileWriter("mytext.txt");
//         for(int i = 0; i < str.length(); i++){
//             fw.write(str.charAt(i));
//         }
//         fw.close();
//     }
// }

class Demo {

    Demo() {
        this.show(this); // passing current object
    }

    void show(Demo obj) {
        System.out.println("this passed as argument");
    }

    public static void main(String[] args) {
        new Demo();
    }
}