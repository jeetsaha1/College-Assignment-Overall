
import java.util.Scanner;

// At first make the number from decimal to binary, toggle the no. of ones with zeros and vice-versa, and then make bin-to-dec

class dec_to_bin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num =sc.nextInt();

        // dec to bin
        int bin = 0, pos = 1;
        while (num > 0){
            int rem = num % 2;
            bin += rem*pos;
            pos *= 10;
            num /= 2;
        }

        System.out.println(bin);
        // Toggle the case
        int temp = 0,p=1;
        while ( bin > 0){
            int rem = bin % 10;
            if (rem == 1) rem = 0;
            else if(rem == 0) rem = 1;
            temp += p * rem;
            p *= 10;
            bin /= 10;
        }
        System.out.println(temp);

        // Make it bin to dec
        int findec = 0, i=0;
        while (temp > 0){
            findec += (temp % 10) * Math.pow(2,i);
            temp /= 10;
            i ++;
        }
        System.out.println(findec);

    }
}