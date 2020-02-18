package jww.qk.thread.type03;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Qiankun
 * @date 2020/2/18 0018 -13:26
 * @title
 **/
public class LockTest {
        public static void main(String[] args){
                Window w= new Window();
                Thread t1 = new Thread(w);
                Thread t2 = new Thread(w);
                Thread t3 = new Thread(w);

                t1.setName("窗口1");
                t2.setName("窗口2");
                t3.setName("窗口3");

                t1.start();
                t2.start();
                t3.start();
        }

}
class Window implements Runnable{
    private int ticket = 100;

    private ReentrantLock lock =
            new ReentrantLock(true);

    @Override
    public void run() {
        while (true){
            try {
                    lock.lock();
                    if(ticket > 0){
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() +"i: "+ ticket);
                        ticket--;
                    }else{
                        break;
                    }

            } finally {
                lock.unlock();
            }
        }
    }
}
