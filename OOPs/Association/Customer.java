package OOPs.Association;

class Pizza
{
    String pizzaName;
    String base;
    String ingredient1;
    String ingredient2;
    String ingredient3;
    Pizza(String pizzaName,String base,String ingredient1,String ingredient2,String ingredient3)
    {
        this.pizzaName = pizzaName;
        this.base = base;
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
    }
}
class Person extends Pizza
{
    String personName;
    Person(String personName, String pizzaName, String base, String ingredient1, String ingredient2, String ingredient3) {
        super(pizzaName, base, ingredient1, ingredient2, ingredient3);
        this.personName = personName;
    }

}
class Customer
{
    public static void main(String[] args) {
        Person customer = new Person("Andy","Margharita","Tomato Sauce","Cheese","Herbs","Garlic Seasoning");
        System.out.println(customer.pizzaName + " with Base " + customer.base + " and the ingredients are: " + customer.ingredient1 + ", "+ customer.ingredient2 + " and "+ customer.ingredient3 + " for "+customer.personName);
    }
}