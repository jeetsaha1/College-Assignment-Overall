package Week4;
//An educational institution maintains a database of its employees. The database is
//divided into a number of classes whose hierarchical relationships are shown below.
//Write all the classes and define the methods to create the database and retrieve
//individual information as and when needed.
//Write a driver program to test the classes.
//Staff (code, name)
//Officer (grade) is a Staff
//RegularTypist (remuneration) is a Typist
//Teacher (subject, publication) is a Staff
//Typist (speed) is a Staff
//CasualTypist (daily wages) is a Typist.
class Staff{
    protected int code;
    protected String name;
    Staff(int code, String name){
        this.code = code;
        this.name = name;
    }
    void showStaff(){
        System.out.println("The Name is : " + name);
        System.out.println("Code : " + code);
    }
}

class Officer extends Staff{
    private String Grade;
    Officer(int code, String name, String Grade){
        super(code,name);
        this.Grade = Grade;
    }

    void showOfficer(){
        super.showStaff();
        System.out.println("Grade : " + Grade);
    }
}

class Teacher extends Staff{
    private String subject;
    private String publication;
    Teacher(int code, String name, String subject, String publication){
        super(code,name);
        this.subject= subject;
        this.publication = publication;
    }
    void showTeacher(){
        super.showStaff();
        System.out.println("Subject : " + subject);
        System.out.println("Publication : " + publication);
    }
}

class Typist extends Staff{
    private int speed;
    Typist(int code, String name, int speed){
        super(code,name);
        this.speed = speed;
    }

    void showTypist(){
        super.showStaff();
        System.out.println("Speed : " + speed);
    }
}

class RegularTypist extends Typist{
    private double remuneration;
    RegularTypist(int code, String name, int speed, double remuneration){
        super(code,name,speed);
        this.remuneration = remuneration;
    }
    void showRegularTypist(){
        super.showTypist();
        System.out.println("Remuneration : " + remuneration);
    }
}

class CasualTypist extends Typist {
    private double dailyWages;

    CasualTypist(int code, String name, int speed, double dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }

    void showCasualTypist() {
        super.showTypist();
        System.out.println("Daily Wages: " + dailyWages);
    }
}

public class prog07 {
    public static void main(String[] args) {
        Officer officer = new Officer(101, "Rahul", "A");
        Teacher teacher = new Teacher(102, "Anita", "Math", "5 Papers");
        RegularTypist regTypist = new RegularTypist(103, "Amit", 60, 25000);
        CasualTypist casTypist = new CasualTypist(104, "Riya", 50, 800);

        System.out.println("---- Officer Details ----");
        officer.showOfficer();

        System.out.println("\n---- Teacher Details ----");
        teacher.showTeacher();

        System.out.println("\n---- Regular Typist Details ----");
        regTypist.showRegularTypist();

        System.out.println("\n---- Casual Typist Details ----");
        casTypist.showCasualTypist();
    }
}
