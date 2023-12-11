package chapter2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test3 {

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + ": " + age;
        }
    }


    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        people.sort(Comparator.comparing(p -> p.age));

        System.out.println(people);

    }
}