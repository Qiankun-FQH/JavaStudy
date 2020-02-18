package jww.qk.thread.type02;

/**
 * @author Qiankun
 * @date 2020/2/17 0017 -19:54
 * @title
 **/
public class WindowTest01 {
    public static void main(String[] args){
            Window1 w = new Window1();

        Thread thread = new Thread(w);
        Thread thread1 = new Thread(w);
        Thread thread2 = new Thread(w);
        thread.setName("线程一");
        thread1.setName("线程二");
        thread2.setName("线程三");
        thread.start();
        thread1.start();
        thread2.start();

    }
}
class Window1 implements Runnable{
    private int t = 100;

    @Override
    public void run() {
        while (true){
            synchronized (Window1.class){
                if(t > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " ： "+t);
                    t--;
                }
                else{
                    break;
                }
            }
        }
    }
}
