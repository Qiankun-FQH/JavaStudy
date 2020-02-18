package jww.qk.thread.type02;

/**
 * @author Qiankun
 * @date 2020/2/17 0017 -19:47
 * @title
 **/
public class ThreadTest02 {
    public static void main(String[] args){
        MyThread thread = new MyThread();

        Thread thread1 = new Thread(thread);

        thread1.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("AAAAAAAAAAAAAAAAAi : " + i);
        }
    }
}
