package chapter6;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {
    public static void main(String[] args) {

        Order order1 = new Order()
                .setId(1001)
                .setOrderLines(Arrays.asList(
                        new OrderLine()
                                .setId(10001)
                                .setType(OrderLine.OrderLineType.PURCHASE)
                                .setAmount(BigDecimal.valueOf(5000)),
                        new OrderLine()
                                .setId(10002)
                                .setType(OrderLine.OrderLineType.PURCHASE)
                                .setAmount(BigDecimal.valueOf(4000))
                        ));

        Order order2 = new Order()
                .setId(1002)
                .setOrderLines(Arrays.asList(
                        new OrderLine()
                                .setId(10003)
                                .setType(OrderLine.OrderLineType.PURCHASE)
                                .setAmount(BigDecimal.valueOf(2000)),
                        new OrderLine()
                                .setId(10004)
                                .setType(OrderLine.OrderLineType.DISCOUNT)
                                .setAmount(BigDecimal.valueOf(-1000))
                ));

        Order order3 = new Order()
                .setId(1003)
                .setOrderLines(Arrays.asList(
                        new OrderLine()
                                .setId(10005)
                                .setType(OrderLine.OrderLineType.PURCHASE)
                                .setAmount(BigDecimal.valueOf(2000))
                ));

        List<Order> order = Arrays.asList(order1, order2, order3);
        List<OrderLine> mergerOrderLines =
                order.stream()
                        .map(Order::getOrderLines)
                        .flatMap(List::stream)
                        .collect(Collectors.toList());

        mergerOrderLines.forEach(System.out::println);

    }
}
