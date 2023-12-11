package ObserverPattern;

public class DigitObserver extends Observer{
    @Override
    void update(NumberGenerator numberGenerator) {

        System.out.println("DigitObserver" +  numberGenerator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
