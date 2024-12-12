package bioskopApp.views;

import bioskopApp.entities.OrderLists;
import bioskopApp.services.OrderService;
import org.springframework.stereotype.Component;

import java.util.Scanner;
import java.util.List;

@Component
public class OrderListsTerminalView implements OrderListView{
    private final OrderService orderService;
    private final Scanner scanner;

    // Constructor
    public OrderListsTerminalView(OrderService orderService) {
        this.orderService = orderService;
        this.scanner = new Scanner(System.in);
    }

    // Main menu
    public void displayMenu() {
        while (true) {
            System.out.println("\n=== Order Management System ===");
            System.out.println("1. Create Order");
            System.out.println("2. View All Orders");
            System.out.println("3. View Order by ID");
            System.out.println("4. Delete Order by ID");
            System.out.println("5. View Total Order Count");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> createOrder();
                case 2 -> viewAllOrders();
                case 3 -> viewOrderById();
                case 4 -> deleteOrderById();
                case 5 -> viewTotalOrderCount();
                case 0 -> {
                    System.out.println("Exiting... Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Create a new order
    private void createOrder() {
        System.out.println("\n=== Create Order ===");
        System.out.print("Enter Order ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();
        System.out.print("Enter Movie Title: ");
        String movieTitle = scanner.nextLine();
        System.out.print("Enter Seat Number: ");
        String seatNumber = scanner.nextLine();
        System.out.print("Enter Show Time: ");
        String showTime = scanner.nextLine();
        System.out.print("Enter Studio Type: ");
        String studioType = scanner.nextLine();
        System.out.print("Enter Payment Method: ");
        String paymentMethod = scanner.nextLine();
        System.out.print("Enter Rating (1-5): ");
        int rating = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Review: ");
        String review = scanner.nextLine();

        OrderLists order = new OrderLists(id, customerName, userId, phone, movieTitle, seatNumber, showTime, studioType, paymentMethod, rating, review);
        orderService.createOrder(order);
        System.out.println("Order created successfully!");
    }

    // View all orders
    private void viewAllOrders() {
        System.out.println("\n=== All Orders ===");
        List<OrderLists> orders = orderService.getAllOrders();
        if (orders.isEmpty()) {
            System.out.println("No orders found.");
        } else {
            for (OrderLists order : orders) {
                System.out.println(order);
            }
        }
    }

    // View order by ID
    private void viewOrderById() {
        System.out.print("\nEnter Order ID to view: ");
        String orderId = scanner.nextLine();
        OrderLists order = orderService.getOrderById(orderId);
        if (order == null) {
            System.out.println("Order not found.");
        } else {
            System.out.println(order);
        }
    }

    // Delete order by ID
    private void deleteOrderById() {
        System.out.print("\nEnter Order ID to delete: ");
        String orderId = scanner.nextLine();
        boolean removed = orderService.deleteOrderById(orderId);
        if (removed) {
            System.out.println("Order deleted successfully!");
        } else {
            System.out.println("Order not found.");
        }
    }

    // View total order count
    private void viewTotalOrderCount() {
        System.out.println("\nTotal Orders: " + orderService.getOrderCount());
    }
}
