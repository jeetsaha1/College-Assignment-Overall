package Week2;


//        1
//        2 3 4
//        5 6 7 8 9



public class prog23 {
    public static void main(String[] args) {
        int n = 3;
        int sum = 1;
        for(int i = 0; i< n; i++){
            for(int j = 0; j< 2*i+1; j++){
                System.out.print(" "+sum+" ");
                sum++;
            }
            System.out.println();
        }
    }
}
