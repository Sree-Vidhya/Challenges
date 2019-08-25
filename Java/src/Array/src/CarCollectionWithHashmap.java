import java.util.HashMap;
import java.util.Scanner;
public class CarCollectionWithHashmap {
    public static void main(String[] args) {
        HashMap<Integer, Car> CarCollection = new HashMap<Integer, Car>();
        Scanner scanner = new Scanner(System.in);
        String reply ="N";
        int i =0;
        do{
            System.out.println("Manufacturer");
            String manufacturer = scanner.nextLine();
            System.out.println("Model");
            String model = scanner.nextLine();
            System.out.println("Color");
            String color = scanner.nextLine();
            Car car = new Car(manufacturer,model,color);
            CarCollection.put(++i, car);
            System.out.println("Do you want to add another car?");
            reply= scanner.nextLine();
        }while(reply.equalsIgnoreCase("Y"));
        System.out.println("The car collection is");
        System.out.println(CarCollection);
        for(int carNum: CarCollection.keySet()){
            System.out.printf("%d   %s\n",carNum, CarCollection.get(carNum));
        }

    }
}
