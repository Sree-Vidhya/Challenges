package OrderMangementSystem;

import java.util.HashMap;

public class OrderRepository {
    private  static HashMap<Integer, Order> orderDataBase = new HashMap<>();
    public static void addOrdertoDataBase(Order order)
    {
        orderDataBase.put(order.getOrderNumber(),order);
    }
    public static Order getOrderFromDataBase(Integer orderNumber)
    {
        return orderDataBase.get(orderNumber);
    }
}
