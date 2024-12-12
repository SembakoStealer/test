package bioskopApp.repositories;

import bioskopApp.entities.OrderLists;

import java.util.List;

public interface OrderRepository {
    // Add a new order
    void addOrder(OrderLists order);

    // Get all orders
    List<OrderLists> getAllOrders();

    // Find an order by ID
    OrderLists findOrderById(String orderId);

    // Remove an order by ID
    boolean removeOrderById(String orderId);

    // Get total number of orders
    int getTotalOrders();
}
