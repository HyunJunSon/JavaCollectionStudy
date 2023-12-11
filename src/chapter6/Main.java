package chapter6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        User user1 = new User()
                .setId(101)
                .setName("Alice")
                .setVerified(true)
                .setEmailAddress("alice@fastcampus.co.kr");

        User user2 = new User()
                .setId(102)
                .setName("Bob")
                .setVerified(false)
                .setEmailAddress("bob@fastcampus.co.kr");

        User user3 = new User()
                .setId(103)
                .setName("Charlie")
                .setVerified(false)
                .setEmailAddress("charlie@fastcampus.co.kr");

//        List<User> users = Arrays.asList(user1, user2, user3);
//        Predicate<User> predicate = User::isVerified;
//        users.stream().filter(predicate.negate()).forEach(System.out::println);


        Order order1 = new Order()
                .setId(1001)
                .setStatus(Order.OrderStatus.CREATED);
        Order order2 = new Order()
                .setId(1002)
                .setStatus(Order.OrderStatus.ERROR);
        Order order3 = new Order()
                .setId(1001)
                .setStatus(Order.OrderStatus.PROCESSED);
        Order order4 = new Order()
                .setId(1001)
                .setStatus(Order.OrderStatus.ERROR);
        Order order5 = new Order()
                .setId(1001)
                .setStatus(Order.OrderStatus.IN_PROGRESS);

        List<Order> order = Arrays.asList(order1, order2, order3, order4, order5);

        order.stream().filter(or -> or.getStatus() == Order.OrderStatus.ERROR)
                .forEach(System.out::println);


    }
}
