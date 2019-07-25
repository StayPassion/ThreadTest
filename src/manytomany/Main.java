package manytomany;

public class Main {
    public static void main(String[] args) {
        Clark clark = new Clark();
        Productor productor = new Productor(clark,"生产者A");
        productor.start();
        Productor productor2 = new Productor(clark,"生产者B");
        productor2.start();

        Consumer consumer1 = new Consumer(clark,"消费者A");
        consumer1.start();
        Consumer consumer2 = new Consumer(clark,"消费者B");
        consumer2.start();
        Consumer consumer3 = new Consumer(clark,"消费者C");
        consumer3.start();
    }
}
