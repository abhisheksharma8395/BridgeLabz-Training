package collectors.order_revenue_summary;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();
        Order order1 = new Order("Virat Kohli", 5000.0);
        Order order2 = new Order("Abhishek Sharma", 2500.0);
        Order order3 = new Order("Rohit Sharma", 24000.0);
        Order order4 = new Order("Josh Hazlewood", 1500.0);
        Order order5 = new Order("Rajat Patidar", 1800.0);
        Order order6 = new Order("Phil Salt", 1250.0);

        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        orderList.add(order4);
        orderList.add(order5);
        orderList.add(order6);


        double total = orderList.stream().collect(Collectors.summingDouble((Order order) -> order.totalCost));
        System.out.printf("Total cost : %.2f",total);
    }
}
