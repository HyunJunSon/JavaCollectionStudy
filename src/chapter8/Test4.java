package chapter8;


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test4 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Seoul"));


        User user1 = new User()
                .setId(101)
                .setName("Alice")
                .setVerified(true)
                .setEmailAddress("alice@fastcampus.co.kr")
                .setCreatedAt(now.minusDays(2));


        User user2 = new User()
                .setId(102)
                .setName("Bob")
                .setVerified(false)
                .setEmailAddress("bob@fastcampus.co.kr")
                .setCreatedAt(now.minusHours(10));

        User user3 = new User()
                .setId(103)
                .setName("Charlie")
                .setVerified(false)
                .setEmailAddress("charlie@fastcampus.co.kr")
                .setCreatedAt(now.minusHours(1));

        User user4 = new User()
                .setId(104)
                .setName("David")
                .setVerified(true)
                .setEmailAddress("david@fastcampus.co.kr")
                .setCreatedAt(now.minusHours(27));

        List<User> users = Arrays.asList(user1, user2, user3, user4);

        Predicate<User> isVerified = User::isVerified;
        long count = users.stream()
                .filter(user -> user.getCreatedAt().isAfter(now.minusDays(1)))
                .filter(isVerified.negate())
                .count();

        System.out.println("count = " + count);

    }
}
