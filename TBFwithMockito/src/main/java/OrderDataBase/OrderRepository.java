package OrderDataBase;


import java.util.HashMap;

public class OrderRepository {
    private static HashMap<Integer, Order> orderDataBase = new HashMap<>();

    public static void addOrdertoDatabase(Order order)
    {
        orderDataBase.put(order.orderNumer,order);
    }
    public static Order getOrderFromDataBase(Integer orderNumber)
    {
        return orderDataBase.get(orderNumber);
    }
}
