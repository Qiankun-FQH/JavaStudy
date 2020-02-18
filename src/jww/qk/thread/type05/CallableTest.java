package jww.qk.thread.type05;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Qiankun
 * @date 2020/2/18 0018 -14:27
 * @title
 **/
public class CallableTest {
    public static void main(String[] args){
        MyThread myThread = new MyThread();

        FutureTask myThreadFutureTask = new FutureTask(myThread);

        new Thread(myThreadFutureTask).start();

        try {
            Object myThread1 = myThreadFutureTask.get();
            System.out.println(myThread1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class MyThread implements Callable{

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if(i%2 == 0){
                sum += i;
            }
        }
        return sum;
    }
}

