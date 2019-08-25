import java.util.Scanner;
//Array
public class Main {
    public static void main(String[] args) {
        Car[] carCollection = new Car[3];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<carCollection.length;i++){
            System.out.println("Manufacturer");
            String manufacturer = scanner.nextLine();
            System.out.println("Model");
            String model = scanner.nextLine();
            System.out.println("Color");
            String color =scanner.nextLine();
            carCollection[i] = new Car(manufacturer ,model ,color);
        }
        for(Car eachCar:carCollection){
            System.out.println(eachCar);
        }
    }
}