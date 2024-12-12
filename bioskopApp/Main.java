package bioskopApp;

import bioskopApp.views.OrderListView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import bioskopApp.config.Database;
import bioskopApp.repositories.OrderRepository;
import bioskopApp.repositories.OrderRepositoryImpl;
import bioskopApp.services.OrderService;
import bioskopApp.services.OrderServiceImpl;
import bioskopApp.views.OrderListsTerminalView;

@ComponentScan(basePackages = "bioskopApp")
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        OrderListView mainMenu = (OrderListView) context.getBean(OrderListsTerminalView.class);
        mainMenu.displayMenu();
    }

    // Database bean
    @Bean
    public Database database() {
        Database database = new Database("cinema_db", "root", "", "localhost", "3306");
        database.setup();
        return database;
    }


}
