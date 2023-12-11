package chapter8;

import chapter6.Order;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test5 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Seoul"));

        Order order1 = new Order()
                .setId(1001)
                .setStatus(Order.OrderStatus.CREATED)
                .setCreatedByUserId(101)
                .setAmount(BigDecimal.valueOf(2000))
                .setCreatedAt(now.minusHours(4));

        Order order2 = new Order()
                .setId(1002)
                .setStatus(Order.OrderStatus.ERROR)
                .setCreatedByUserId(102)
                .setAmount(BigDecimal.valueOf(4000))
                .setCreatedAt(now.minusHours(1));

        Order order3 = new Order()
                .setId(1003)
                .setStatus(Order.OrderStatus.PROCESSED)
                .setCreatedByUserId(103)
                .setAmount(BigDecimal.valueOf(3000))
                .setCreatedAt(now.minusHours(36));

        Order order4 = new Order()
                .setId(1004)
                .setStatus(Order.OrderStatus.ERROR)
                .setCreatedByUserId(104)
                .setAmount(BigDecimal.valueOf(7000))
                .setCreatedAt(now.minusHours(15));

        Order order5 = new Order()
                .setId(1005)
                .setStatus(Order.OrderStatus.IN_PROGRESS)
                .setCreatedByUserId(105)
                .setAmount(BigDecimal.valueOf(9000))
                .setCreatedAt(now.minusHours(10));


        List<Order> order = Arrays.asList(order1, order2, order3, order4, order5);

        //error 상태 + 가장 비싼 주문을 찾아서 출력해볼것

        Optional<Order> mostExpensiveOrder = order.stream()
                .filter(ord -> ord.getStatus() == Order.OrderStatus.ERROR)
                .max((o1, o2) -> o1.getAmount().compareTo(o2.getAmount()));

        System.out.println("mostExpensiveOrder.orElse(new Order()) = " + mostExpensiveOrder.orElse(new Order()));


        BigDecimal bigDecimal = order.stream()
                .filter(ord -> ord.getStatus() == Order.OrderStatus.ERROR)
                .map(Order::getAmount)
                .max(BigDecimal::compareTo)
                .orElse(BigDecimal.ZERO);

        System.out.println("bigDecimal = " + bigDecimal);
//                 .ifPresent(System.out::println);

    }
}
