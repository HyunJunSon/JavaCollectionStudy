package chapter8;

import chapter6.User;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test2 {
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

        Optional<User> optionalUser = users.stream().min((u1, u2) -> u1.getName().compareTo(u2.getName()));
        optionalUser.ifPresent(user -> System.out.print(user.getName()));



    }
}
