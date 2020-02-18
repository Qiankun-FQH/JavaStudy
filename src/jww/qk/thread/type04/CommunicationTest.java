package jww.qk.thread.type04;

/**
 * @author Qiankun
 * @date 2020/2/18 0018 -13:54
 * @title
 **/
public class CommunicationTest {
    public static void main(String[] args){
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.start();
        t2.start();
    }
}
class Number implements Runnable{


    private int num = 1;
    @Override
    public void run() {
        while(true){
            synchronized (this) {

                notify();


                if(num <= 100){

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+" : "+ num);
                    num++;


                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }
        }
    }
}
