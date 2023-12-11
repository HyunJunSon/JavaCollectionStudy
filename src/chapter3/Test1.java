package chapter3;

import java.util.function.Predicate;

public class Test1 {
    public static void main(String[] args) {

        String str = "hello";

        Predicate<String> predicate = str::equals;
        System.out.println(predicate.test("hello"));
    }
}
