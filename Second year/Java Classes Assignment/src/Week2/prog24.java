package Week2;

//                    1
//                  2 1 2
//                3 2 1 2 3
//              4 3 2 1 2 3 4


public class prog24 {
    public static void main(String[] args) {
        int n = 4;

        for(int i = 0; i<= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print("  ");
            }

            for(int j = i; j>= 1; j--){
                System.out.print(j+" ");
            }
            for(int j =2; j<= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
}
