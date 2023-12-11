package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test4 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(3, "Alice"));
        users.add(new User(1, "Chalie"));
        users.add(new User(5, "Bob"));

        printUserField(users, User::getId);
    }

    private static void printUserField(List<User> users, Function<User,Object> getter) {

        for(User user : users){
            System.out.println(getter.apply(user));
        }
    }
}
