package jww.qk.thread.type04;

/**
 * @author Qiankun
 * @date 2020/2/18 0018 -14:10
 * @title
 **/
public class ProductTest {

    public static void main(String[] args){
        Clerk c = new Clerk();
        Producer producer = new Producer(c);
        Consumer consumer = new Consumer(c);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);


        t1.start();
        t2.start();
    }

}
class Clerk{

    private int num = 0;

    public synchronized void pro() {
        if(num < 20){
            num++;
            System.out.println(Thread.currentThread().getName() +"开始生产" + num + "个");

            notify();
        }else{

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void dec() {
        if(num > 0){
            System.out.println(Thread.currentThread().getName() +"开始消费" + num + "个");
            num--;
            notify();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Producer implements Runnable{

    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {

        System.out.println("生产者" + Thread.currentThread().getName());

        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.pro();
        }
    }
}
class Consumer implements Runnable{

    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("消费者" + Thread.currentThread().getName());

        while(true){
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.dec();
        }
    }
}

