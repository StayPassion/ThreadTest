package onetoone;

/**
 * 消费者
 */
public class Consumer extends Thread{
    private Clark c;
    public Consumer(Clark c){
        this.c = c;
    }
    @Override
    public void run(){
        while (true){
            c.get();
        }
    }
}
