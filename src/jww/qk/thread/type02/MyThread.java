package jww.qk.thread.type02;

/**
 * @author Qiankun
 * @date 2020/2/17 0017 -19:47
 * @title
 **/
public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("i : " + i);
        }
    }
}
