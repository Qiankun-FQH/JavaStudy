package jww.qk.thread.type06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Qiankun
 * @date 2020/2/18 0018 -14:45
 * @title
 **/
public class TheadPool {
    public static void main(String[] args){
        ExecutorService service = Executors.newFixedThreadPool(10);

        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;

        service.execute(new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 100; i++) {
                            if(i%2 == 0){
                                System.out.println("i :" +i );

                            }
                        }
                    }
                }
        ));
        service.shutdown();


    }
}
