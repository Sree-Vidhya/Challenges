import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Checkout {

     HashMap<String, Integer> listOfItems = new HashMap<>() {
        {
            put("A", 50);
            put("B", 30);
            put("C", 20);
            put("D", 15);
        }
    };
    private static List<String> scannedItems = new ArrayList<>();

    public static List<String> scan(String item) {

        scannedItems.add(item);
        System.out.println(scannedItems);
        return scannedItems;
    }

    public static void CheckingifListOfItemsHasScannedItems() {
        HashMap<String, Integer> listOfItems = new HashMap<>() {
            {
                put("A", 50);
                put("B", 30);
                put("C", 20);
                put("D", 15);
            }
        };

//        System.out.println(listOfItems.get();
//        System.out.println(listOfItems.containsValue(scannedItems));

    }

    public static void main(String[] args) {
        HashMap<String, Integer> listOfItems = new HashMap<>() {
            {
                put("A", 50);
                put("B", 30);
                put("C", 20);
                put("D", 15);
            }
        };
        Checkout.scan("A");
        Checkout.scan("B");
        Checkout.CheckingifListOfItemsHasScannedItems();
    }


}