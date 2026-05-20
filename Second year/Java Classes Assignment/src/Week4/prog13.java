package Week4;
//13. Create a base class Distance which stores the distance between two locations in miles
//        and a method travelTime(). The method prints the time taken to cover the distance when
//the speed is 60 miles per hour. Now in a derived class DistanceMKS, override
//        travelTime() so that it prints the time assuming the distance is in kilometers and the
//speed is 100 km per second. Demonstrate the working of the classes.

class Distance{
    double miles;
    Distance(double miles){
        this.miles = miles;
    }
    void TravelTime(){
        System.out.println("The Time (in seconds,miles): " + ((miles*3600)/60));
    }
}
class DistanceMKS extends Distance{
    double kilometer;
    DistanceMKS(double kilometer){
        super(kilometer);
    }
    void TravelTime(){
        System.out.println("The Time (in seconds,kilometers): " + ((miles)/100.0));
    }
}
public class prog13 {
    public static void main(String[] args) {
        Distance d1 = new Distance(60);
        DistanceMKS d2 = new DistanceMKS(500);
        d1.TravelTime();
        d2.TravelTime();
    }
}
