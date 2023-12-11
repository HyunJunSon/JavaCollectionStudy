package chapter3;

import java.util.function.Function;

public class Test2 {
    public static void main(String[] args) {
        Function<String, Integer> function = Integer::parseInt;
        System.out.println(function.apply("123"));

        String str = "hello";

    }
}
