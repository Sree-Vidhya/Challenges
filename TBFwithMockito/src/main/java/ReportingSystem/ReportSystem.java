package ReportingSystem;

import OrderDataBase.Order;

public interface ReportSystem {
    String displayOutputToTerminal(String name, String address, Order generatingOrder);
}
