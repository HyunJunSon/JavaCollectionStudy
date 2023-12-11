package chapter4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {

        Map<String, BiFunction<String,String,Car>> carTypeToConsructorMap
                = Map.of("sedan", Sedan::new, "van" , Van::new, "suv", SUV::new);


        String[][] inputs = new String[][]{
                {"sedan" ,"Sonata","Hyundai"},
                {"van" ,"Sienna","Toyota"},
                {"sedan" ,"Model S","Tesla"},
                {"suv" ,"Sorento","KIA"}
        };

        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < inputs.length; i++) {
            String[] input = inputs[i];
            cars.add(carTypeToConsructorMap.get(input[0]).apply(input[1], input[2]));
        }

        cars.forEach(Car::drive);


    }
}
