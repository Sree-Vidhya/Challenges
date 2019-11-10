package OrderDataBase;

import java.util.ArrayList;

public class Order {
    int orderNumer = 0;
    String dueDate;
    ArrayList blockCollection;

    public Order(String dueDate, ArrayList blockCollection) {
        this.dueDate = dueDate;
        this.blockCollection = blockCollection;
    }

    public int getNextOrderNumer() {
        return ++orderNumer;
    }
    public int getOrderNumer(){return orderNumer;}

    public String getDueDate() {
        return dueDate;
    }

    public ArrayList getBlockCollection() {
        return blockCollection;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumer=" + orderNumer +
                ", dueDate='" + dueDate + '\'' +
                ", blockCollection=" + blockCollection +
                '}';
    }
}
