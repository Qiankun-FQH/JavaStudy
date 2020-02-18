package jww.qk.thread.type01;

/**
 * @author Qiankun
 * @date 2020/2/17 0017 -19:01
 * @title
 **/
public class MyThread extends Thread{
    //1      、   2
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
 class MyThread2 extends Thread{
    //1      、   2
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2 == 1){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}