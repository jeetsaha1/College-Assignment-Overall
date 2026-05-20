package Week5;

//2. Create a class called Time, which has three private instance variables – hour, min and
//sec. It contains a method called add( ) which takes one Time object as parameter and
//print the added value of the calling Time object and passes Time object. In the main
//method, declare two Time objects and assign values using constructor and call the add()
//method.

import java.util.Scanner;

class Time{
    private int hour;
    private int min;
    private int sec;
    Time(int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec= sec;
    }
    Time(){};
    void add(Time t){
        int totalHour = this.hour + t.hour;
        int totalMin = this.min + t.min;
        int totalSec = this.sec + t.sec;

        if(totalSec >= 60){
            totalMin += totalSec/60;
            totalSec = totalSec%60;
        }
        if(totalMin >= 60){
            totalHour += totalMin/60;
            totalMin = totalMin%60;
        }
        System.out.println("Time : "+totalHour + " hour "
        +totalMin + " minute "
        +totalSec + " second ");

    }
}
public class prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hour, Minutes, Seconds respectively (1st): ");
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int sec = sc.nextInt();
        Time t1 = new Time(hour, min, sec);

        System.out.println("Enter the Hour, Minutes, Seconds respectively (2nd): ");
        int hour1 = sc.nextInt();
        int min1 = sc.nextInt();
        int sec1 = sc.nextInt();
        Time t2 = new Time(hour1, min1, sec1);

        t1.add(t2);
    }
}
