package chapter7;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test2 {
    public static void main(String[] args) {

        Optional<List<String>> maybe1 = Optional.of(Arrays.asList("hi","hello"));
        List<String> hi = maybe1.filter(list -> list.contains("hi")).orElseThrow();
        System.out.println(hi.get(0));


    }
}
