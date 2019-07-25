package onetoone;

/**
 * 生产者
 */
public class Productor extends Thread{
    private Clark c;
    public Productor(Clark c){
        this.c = c;
    }
    @Override
    public void run(){
        while (true){
            c.save();
        }
    }
}
