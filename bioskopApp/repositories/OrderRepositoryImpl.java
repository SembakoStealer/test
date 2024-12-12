package bioskopApp.repositories;

import bioskopApp.entities.OrderLists;
import bioskopApp.repositories.OrderRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderRepositoryImpl implements OrderRepository {
    private List<OrderLists> orders;

    public OrderRepositoryImpl() {
        this.orders = new ArrayList<>();
    }

    @Override
    public void addOrder(OrderLists order) {
        orders.add(order);
    }

    @Override
    public List<OrderLists> getAllOrders() {
        return new ArrayList<>(orders); // Return a copy of the list
    }

    @Override
    public OrderLists findOrderById(String orderId) {
        for (OrderLists order : orders) {
            if (order.getId().equals(orderId)) {
                return order;
            }
        }
        return null; // Return null if not found
    }

    @Override
    public boolean removeOrderById(String orderId) {
        return orders.removeIf(order -> order.getId().equals(orderId));
    }

    @Override
    public int getTotalOrders() {
        return orders.size();
    }
}
