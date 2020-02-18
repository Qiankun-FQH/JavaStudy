package jww.qk.thread.exercise;

import javax.lang.model.element.AnnotationMirror;

/**
 * @author Qiankun
 * @date 2020/2/18 0018 -13:37
 * @title
 **/
public class ExerciseTest {

    public static void main(String[] args){

        Count c = new Count();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();

    }
}
class Count implements Runnable{

    private  int salary = 0;
    private Object obj = new Object();

    @Override
    public void run() {
            for(int i = 0; i < 3; i++){
                aaa();
            }
    }

    public synchronized void aaa(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        salary += 1000;
        System.out.println(Thread.currentThread().getName() + " : " + salary);
    }
}
