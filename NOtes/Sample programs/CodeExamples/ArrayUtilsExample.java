import java.util.ArrayList;
public class ArrayUtilsExample {

    private static ArrayList<String>  arrayUtils = null;

    public static void main(String s[]) {
        populateArrayList();

        printArrayListWithWhileLoop();

        printArrayListWithDoWhileLoop();

        printArrayListWithForLoop();

        printArrayListWithForEachLoop();

        printArrayListWithForEachLambdaLoop();
    }

    /*
    This method populates the array list
     */
    public static void populateArrayList() {
        arrayUtils = new ArrayList<String>();
        arrayUtils.add("The");
        arrayUtils.add("quick");
        arrayUtils.add("brown");
        arrayUtils.add("fox");
        arrayUtils.add("jumped");
        arrayUtils.add("over");
        arrayUtils.add("the");
        arrayUtils.add("lazy");
        arrayUtils.add("dog");
    }

    public static void printArrayListWithWhileLoop() {
        int i = 0;
        System.out.println("Printing array list using while loop");
        while(i < arrayUtils.size()) {
            System.out.println(arrayUtils.get(i++));
        }
    }

    public static void printArrayListWithDoWhileLoop() {
        int i = 0;
        System.out.println("Printing array list using do - while loop");
        //Checking if the arrayUtils is not empty before iterating through it
        if(!arrayUtils.isEmpty()) {
            do{
                System.out.println(arrayUtils.get(i));
            }while(++i < arrayUtils.size());
        }
    }

    public static void printArrayListWithForLoop() {
        System.out.println("Printing array list using for loop");
        for(int i=0;i<arrayUtils.size();i++){
            System.out.println(arrayUtils.get(i));
        }
    }

    public static void printArrayListWithForEachLoop() {
        System.out.println("Printing array list using for each loop");
        for(String strArrayElement : arrayUtils){
            System.out.println(strArrayElement);
        }
    }

    //We will learn about this in week 3
    public static void printArrayListWithForEachLambdaLoop() {
        System.out.println("Printing array list using for each lambda loop");
        arrayUtils.forEach((String strArrayElement)-> System.out.println(strArrayElement));
    }

}
