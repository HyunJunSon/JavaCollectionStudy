package chapter6;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1,1,2,2,4,4,5,5,6,6,6,7,8,-1);
//        numbers.stream().distinct().forEach(s-> System.out.print(s+" "));

        LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Seoul"));

        Order order1 = new Order()
                .setId(1001)
                .setStatus(Order.OrderStatus.CREATED)
                .setCreatedByUserId(101)
                .setCreatedAt(now.minusHours(4));

        Order order2 = new Order()
                .setId(1002)
                .setStatus(Order.OrderStatus.ERROR)
                .setCreatedByUserId(102)
                .setCreatedAt(now.minusHours(1));

        Order order3 = new Order()
                .setId(1003)
                .setStatus(Order.OrderStatus.PROCESSED)
                .setCreatedByUserId(103)
                .setCreatedAt(now.minusHours(36));

        Order order4 = new Order()
                .setId(1004)
                .setStatus(Order.OrderStatus.ERROR)
                .setCreatedByUserId(105)
                .setCreatedAt(now.minusHours(15));

        Order order5 = new Order()
                .setId(1005)
                .setStatus(Order.OrderStatus.IN_PROGRESS)
                .setCreatedByUserId(105)
                .setCreatedAt(now.minusHours(10));


        List<Order> order = Arrays.asList(order1, order2, order3, order4, order5);



        order.stream()
                .map(Order::getCreatedByUserId)
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }
}
