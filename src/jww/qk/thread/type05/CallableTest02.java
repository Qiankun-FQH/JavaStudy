package jww.qk.thread.type05;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Qiankun
 * @date 2020/2/18 0018 -14:36
 * @title
 **/
public class CallableTest02 {
    public static void main(String[] args){
        MyThread02 t = new MyThread02();
        FutureTask futureTask = new FutureTask(t);
        new Thread(futureTask).start();

        try {
            Object o = futureTask.get();
            System.out.println(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}

class MyThread02 implements Callable{

    //private int s = 0;

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for(int i = 0; i < 10; i++){
            sum += i;
        }
        return sum;
    }
}
