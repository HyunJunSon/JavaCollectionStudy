package chapter6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test8 {
    public static void main(String[] args) {
        String[][] cities = new String[][]{
                {"Seoul","Busan"},
                {"San Francisco", "New York"},
                {"Madrid", "Barcelona"}
        };

        //#1
        Stream<String[]> citystream =  Arrays.stream(cities);
        Stream<Stream<String>> citystream2 = citystream.map(x -> Arrays.stream(x));
        List<Stream<String>> cityStreamlist = citystream2.collect(Collectors.toList());

        //#2
        Stream<String[]> citystream3 =  Arrays.stream(cities);
        Stream<String> citystream4 = citystream3.flatMap(x -> Arrays.stream(x));
        List<String> cityStreamlist2 = citystream4.collect(Collectors.toList());




    }
}
