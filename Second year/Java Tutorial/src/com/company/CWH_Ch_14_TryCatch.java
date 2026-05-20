package com.company;

public class CWH_Ch_14_TryCatch {
    public static void main(String[] args) {
        // Learning about Try - catch
        int a = 6000;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("Th result is: " + c);
        }
        catch (Exception e){
            System.out.println("We failed to divide. Reason...");
            System.out.println(e);
        }

        // Without Try catch
        System.out.println("The result is : "+(a/b));
    }
}
