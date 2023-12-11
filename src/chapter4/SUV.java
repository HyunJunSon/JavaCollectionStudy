package chapter4;

public class SUV extends Car{
    public SUV(String name, String brand) {
        super(name, brand);
    }

    @Override
    public String toString() {
        return "SUV{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public void drive() {
        System.out.println("Driving a SUV" + name + " from" + brand);
    }
}
