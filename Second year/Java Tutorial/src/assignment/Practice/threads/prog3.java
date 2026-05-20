
// import java.util.*;

// public class prog3 {
//     public static void main(String[] args)throws Exception {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the number: ");
//          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.print("Enter number: ");
//         int x = Integer.parseInt(br.readLine());
//         System.out.println(x);
//     }
// }
// class prog3 {
//     public static void main(String[] args) {
//         String s = "Hello World";
//         String[] arr =s.split(" ");
//         System.out.println(arr);
//         System.out.println(s.replace("l",""));
//     }
// }

public class prog3{
    public static void main(String[] args) {
        String s1 = "jeet";
        String s2 = "e";
        for (char c:s2.toCharArray()){
            s1 = s1.replace(String.valueOf(c), "");
        }
        System.out.println(s1);
    }
}