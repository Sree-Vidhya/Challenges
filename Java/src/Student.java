// import java.util.Scanner;
// public class Student {
//   String name;
//   int registrationNumber;
//   double avgMarks;

//   public Student(String[] s){
//   this.name = s[0];
//   this.registrationNumber = Integer.parseInt(s[1]);;
//   this.avgMarks = Double.parseDouble(s[2]);;
  
//   }
 
//   public static void main(String[] s){
//     Scanner input = new Scanner(System.in);
//     Student student1 = new Student(s);
//     System.out.println("Name: ");
//     String name = input.next();
//     System.out.println("Registration Number: ");
//     String registrationNumber = input.next();
//     System.out.println("Average marks: ");
//     String avgMarks = input.next();
//     System.out.println(student1);
//   }
//   public String toString() {
//     return "Student{" +
//             "name='" + name + '\'' +
//             ", registrationNumber='" + registrationNumber + '\'' +
//             ", avgMarks=" + avgMarks +
//             '}';
// }
// }

import java.util.Scanner;
public class Student {
  String name;
  int registrationNumber;
  double avgMarks;

  public Student(String name, int registrationNumber, double avgMarks ){
  this.name = name;
  this.registrationNumber = registrationNumber;
  this.avgMarks = avgMarks;
  
  }
 
  public static void main(String []args){
    Scanner input = new Scanner(System.in);
    String answer;
    do {

      System.out.println("Name: ");
      String name = input.nextLine();
      System.out.println("Registration Number: ");
      int registrationNumber = Integer.parseInt(input.nextLine());
      System.out.println("Average marks: ");
      double avgMarks = Double.parseDouble(input.nextLine());
      Student student1 = new Student(name, registrationNumber, avgMarks);
      System.out.println(student1);
      System.out.println("Do you want to enter another Student details? ");
       answer = input.nextLine();
    } while (answer.equalsIgnoreCase("Y"));
//    scaninput.close();

  }
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", registrationNumber='" + registrationNumber + '\'' +
            ", avgMarks=" + avgMarks +
            '}';
}
}



