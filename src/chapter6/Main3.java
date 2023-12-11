package chapter6;

import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        Order order1 = new Order()
                .setId(1001)
                .setStatus(Order.OrderStatus.CREATED)
                .setCreatedByUserId(101);

        Order order2 = new Order()
                .setId(1002)
                .setStatus(Order.OrderStatus.ERROR)
                .setCreatedByUserId(102);

        Order order3 = new Order()
                .setId(1003)
                .setStatus(Order.OrderStatus.PROCESSED)
                .setCreatedByUserId(103);

        Order order4 = new Order()
                .setId(1004)
                .setStatus(Order.OrderStatus.ERROR)
                .setCreatedByUserId(104);

        Order order5 = new Order()
                .setId(1005)
                .setStatus(Order.OrderStatus.IN_PROGRESS)
                .setCreatedByUserId(105);


        List<Order> order = Arrays.asList(order1, order2, order3, order4, order5);


        order.stream().map(Order::getId).forEach(System.out::println);
    }
}
