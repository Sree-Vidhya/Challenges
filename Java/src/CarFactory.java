import java.util.Scanner;

public class CarFactory {
    public static void main(String[] args) {
//        Car car1 = new Car("Toyota","Black",2000);
//        car1.model = "Toyota";
//        car1.color="Black";
//        car1.year=2000;
//        System.out.println(car1);
//        Car car2 = new Car("Honda","Red",2005);
//        car2.model = "Honda";
//        car2.color ="Red";
//        car2.year = 2005;
//        System.out.println(car2);
        Scanner input = new Scanner(System.in);
        String answer;
        do {

            System.out.println("Model: ");
            String model = input.nextLine();
            System.out.println("Color: ");
            String color = input.nextLine();
            System.out.println("Year: ");
            String year = input.nextLine();
            Car car1 = new Car(model,color,year);
            System.out.println(car1);
            System.out.println("Do you want to enter another Car details? ");
             answer = input.nextLine();
        } while (answer.equalsIgnoreCase("Y"));
//    scaninput.close();

    }
}
