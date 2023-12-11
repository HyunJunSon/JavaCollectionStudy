package chapter6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        Stream<String> nameStream = Stream.of("Alice", "Bod", "Carlie");
        nameStream.forEach(System.out::println);

        Arrays.stream(new String[]{"san jose", "Seoul" ,"Tokyo"})
                .forEach(System.out::println);


        Set<Integer> set = new HashSet<>(Arrays.asList(3,3,3,5,6,7));
        set.stream().forEach(System.out::println);

    }
}
