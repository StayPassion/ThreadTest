package manytomany;

/**
 * 多对多消费者
 * notifyAll()
 * while
 */
public class Clark {
    public int count = 0;

    public synchronized void save() {
        while (count >= 20) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"生产了一件产品，剩余了" + (++count));
        this.notifyAll();
    }

    public synchronized void get() {
        while (count <= 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"消费了一件产品，剩余了" + (--count));
        this.notifyAll();
    }

}
