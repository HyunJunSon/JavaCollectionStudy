package chapter4;

public class Van extends Car{
    public Van(String name, String brand) {
        super(name, brand);
    }

    @Override
    public String toString() {
        return "Van{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public void drive() {
        System.out.println("Driving a Van" + name + " from" + brand);
    }
}
