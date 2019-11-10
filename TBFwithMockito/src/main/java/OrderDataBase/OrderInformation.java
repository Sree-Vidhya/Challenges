package OrderDataBase;

import java.util.ArrayList;

public interface OrderInformation {
    ArrayList creatingBlockCollectionFromUserInput();
    int generateNextOrderNumber();
    Order generateAnOrderFromTheInformationProvided();
    Order getOrderWithOrderNumber(int orderNumber);
    Order getOrderFromDatabase();
}
