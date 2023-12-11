package chapter3;

import java.util.function.BiFunction;

public class Test5 {
    public static void main(String[] args) {
        BiFunction<Integer, String, User> biFunction = User::new;
        System.out.println(biFunction.apply(1, "hyunjun").getId());
    }
}
