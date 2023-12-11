package chapter2;

import java.util.Collections;
import java.util.Comparator;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name == null ? "null" : "Person{name='" + name + "', age=" + age + '}';
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }
}
