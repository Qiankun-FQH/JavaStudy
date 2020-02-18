package jww.qk.thread.type01;

/**
 * @author Qiankun
 * @date 2020/2/17 0017 -19:00
 * @title  线程
 **/
public class ThreadTest02 {

    public static void main(String[] args){
        MyThread thread = new MyThread();
        MyThread2 thread2 = new MyThread2();
        /**
         * Causes this thread to begin execution;
         *          the Java Virtual Machine calls the run
         * method of this thread.
         */
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        thread2.start();
        new Thread(){

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if(i % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + Thread.currentThread().getPriority() + ":" + i + " ******************Hello");
                    }
                }
                thread.setPriority(10);
            }
        }.start();
        for (int i = 0; i < 100; i++) {
            if(i%2 == 0){
                System.out.println(Thread.currentThread().getName() + Thread.currentThread().getPriority() + ":" + i + " ******************Hello");
            }
        }
    }

}
