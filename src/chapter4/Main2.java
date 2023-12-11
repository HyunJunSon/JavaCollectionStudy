package chapter4;

import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        Stream<Car> stream =
            Stream.of(new Sedan("test", "samsung"), new SUV("test2","hyundai")
                        ,new Van("test3","toyota"));
    }
}
