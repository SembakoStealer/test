package bioskopApp.services;

import bioskopApp.entities.OrderLists;
import bioskopApp.repositories.OrderRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    // Constructor to inject OrderRepository
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void createOrder(OrderLists order) {
        if (order == null || order.getId() == null || order.getCustomerName() == null) {
            throw new IllegalArgumentException("Order or required fields cannot be null");
        }
        orderRepository.addOrder(order);
    }

    @Override
    public List<OrderLists> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    @Override
    public OrderLists getOrderById(String orderId) {
        if (orderId == null || orderId.isEmpty()) {
            throw new IllegalArgumentException("Order ID cannot be null or empty");
        }
        return orderRepository.findOrderById(orderId);
    }

    @Override
    public boolean deleteOrderById(String orderId) {
        if (orderId == null || orderId.isEmpty()) {
            throw new IllegalArgumentException("Order ID cannot be null or empty");
        }
        return orderRepository.removeOrderById(orderId);
    }

    @Override
    public int getOrderCount() {
        return orderRepository.getTotalOrders();
    }
}
