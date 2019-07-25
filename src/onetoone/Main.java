package onetoone;

/**
 * 一对一
 */
public class Main {
    public static void main(String[] args) {
        Clark clark = new Clark();
        Productor productor = new Productor(clark);
        productor.start();

        Consumer consumer = new Consumer(clark);
        consumer.start();
    }
}
