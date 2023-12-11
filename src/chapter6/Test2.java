package chapter6;

import AdapterPattern.Print;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x>0;
        Stream.of(1,2,3,4,5,-1,2,3,-9,0).filter(predicate.or(x-> x==0))
                .forEach(System.out::println);
    }
}
