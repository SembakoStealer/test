package bioskopApp.services;

import bioskopApp.entities.OrderLists;

import java.util.List;

public interface OrderService {
    // Create a new order
    void createOrder(OrderLists order);

    // Retrieve all orders
    List<OrderLists> getAllOrders();

    // Find an order by its ID
    OrderLists getOrderById(String orderId);

    // Delete an order by ID
    boolean deleteOrderById(String orderId);

    // Get the total number of orders
    int getOrderCount();
}
