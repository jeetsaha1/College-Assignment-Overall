package Week2;


//1           1
//  2       2
//    3   3
//      4


public class prog25 {
    public static void main(String[] args) {
        int n = 4,space = 4;

        for(int i = 0; i<= n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("  ");
            }
            System.out.print(i);
            // Middle spaces
            for (int s = 1; s <= (n - i) * 4; s++) {
                System.out.print(" ");
            }

            // Second number (except last row)
            if (i != n) {
                System.out.print(i);
            }


            System.out.println();
        }
    }
}
