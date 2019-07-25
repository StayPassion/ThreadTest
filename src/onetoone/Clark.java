package onetoone;

public class Clark {
    public int count = 0;

    public synchronized void save() {
        if (count >= 20) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("生产者生产了一件产品，剩余了" + (++count));
        this.notify();
    }

    public synchronized void get() {
        if (count <= 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("消费者消费了一件产品，剩余了" + (--count));
        this.notify();
    }

}
