package chapter8;

import java.util.Optional;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        Optional<Integer> max = Stream.of(-21, -212, 312, 23, 125, 57, 56, 432, 123, 456)
                .max(Integer::compare);

        max.ifPresent(System.out::println);

        Optional<Integer> min = Stream.of(-21, -212, 312, 23, 125, 57, 56, 432, 123, 456)
                .min(Integer::compare);

        min.ifPresent(System.out::println);


    }
}
