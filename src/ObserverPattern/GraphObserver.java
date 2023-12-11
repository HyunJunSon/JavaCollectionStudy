package ObserverPattern;

public class GraphObserver extends Observer{
    @Override
    void update(NumberGenerator numberGenerator) {
        System.out.println("GraphObserver");
        int number = numberGenerator.getNumber();

        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
