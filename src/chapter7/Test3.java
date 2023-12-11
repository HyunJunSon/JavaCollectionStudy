package chapter7;

import java.util.Optional;

public class Test3 {
    public static void main(String[] args) {
        Optional<User> maybeUser = Optional.ofNullable(maybegGetUser(false));
//        maybeUser.ifPresent(System.out::println);

        Optional<Integer> maybeId = Optional.ofNullable(maybegGetUser(true))
                .map(User::getId);

        maybeId.ifPresent(System.out::println);
    }

    public static User maybegGetUser(boolean returnUser) {
        if (returnUser){
            return new User()
                    .setId(101)
                    .setName("Alice")
                    .setVerified(true);
        }
        return null;
    }
}
