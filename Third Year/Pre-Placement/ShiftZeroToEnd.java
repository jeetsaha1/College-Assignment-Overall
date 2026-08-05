// There is an array, we have to shift the zeros to the end of the array

class ShiftZeroToEnd{
    public static void main(String[] args) {
        int n = 8,k=0;
        int[] arr = {4,5,0,1,9,0,5,0};
        int[] temp = new int[8];
        for(int i=0; i < n;i++){
            if (arr[i] != 0)    temp[k++] = arr[i];
        }
        while (k < n) temp[k++] = 0;

        for(int i=0; i<n;i++){
            System.out.print(temp[i] + " ");
        }
    }
}