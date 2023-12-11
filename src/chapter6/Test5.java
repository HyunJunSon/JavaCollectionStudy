package chapter6;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {

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
                .setCreatedByUserId(104)
                .setCreatedAt(now.minusHours(15));

        Order order5 = new Order()
                .setId(1005)
                .setStatus(Order.OrderStatus.IN_PROGRESS)
                .setCreatedByUserId(105)
                .setCreatedAt(now.minusHours(10));


        List<Order> order = Arrays.asList(order1, order2, order3, order4, order5);


//        List<Long> idList = order.stream().filter(or -> or.getStatus() == Order.OrderStatus.ERROR)
//                .map(Order::getCreatedByUserId)
//                .collect(Collectors.toList());
//
//        idList.forEach(System.out::println);

        //에러상태이면서 만들어진지 24시간 이내 주문만 골라내기
        Predicate<Order> predicate = or -> or.getStatus() == Order.OrderStatus.ERROR;
        order.stream().filter(predicate.and(or -> or.getCreatedAt().isAfter(now.minusHours(24))))
                .forEach(System.out::println);



    }
}
