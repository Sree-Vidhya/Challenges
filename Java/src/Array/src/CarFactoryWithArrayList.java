import java.util.ArrayList;
import java.util.Scanner;

public class CarFactoryWithArrayList {
    public static void main(String[] args) {
        ArrayList<Car> carCollection = new ArrayList<Car>();
        Scanner scanner = new Scanner(System.in);
        String answer = "N";
        do{
            System.out.println("Manufacturer");
            String manufacturer = scanner.nextLine();
            System.out.println("Model");
            String model = scanner.nextLine();
            System.out.println("Color");
            String color = scanner.nextLine();
            System.out.println("Do you want to continue?");
            answer = scanner.nextLine();
        }while(answer.equalsIgnoreCase("Y"));
        for(Car eachCar:carCollection) {
            System.out.println(eachCar);
        }
    }
}
