package chapter6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test4 {
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

        List<User> users = Arrays.asList(user1, user2, user3);

        users.stream().filter(((Predicate<User>) User::isVerified).negate()).map(User::getEmailAddress)
                .forEach(System.out::println);
    }
}
