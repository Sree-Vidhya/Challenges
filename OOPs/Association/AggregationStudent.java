package OOPs.Association;

class Subject
{
    String subjectName;

     Subject(String sN)
    {
        this.subjectName = sN;
    }
}

class Student
{
    Subject studentSubject;
    int rollNum;
    String name;
    String Address;
    int phNum;

    public Student(Subject ss,int sNo, String name, String address, int phNum) {
        this.studentSubject = ss;
        this.rollNum = sNo;
        this.name = name;
        Address = address;
        this.phNum = phNum;
    }
}

public class AggregationStudent
{
    public static void main(String[] args) {
        Subject subject1 = new Subject("Computer Science");
        Student student1 = new Student(subject1,1,"Andy","SouthYarra",1234567);
        System.out.println("Name:             "+student1.name);
        System.out.println("Roll number:      "+student1.rollNum);
        System.out.println("Address:          "+student1.Address);
        System.out.println("Ph:               "+student1.phNum);
        System.out.println("Subject Enrolled: "+student1.studentSubject.subjectName);
    }
}