package produceAndConsume;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * @author: xu_ch
 * @date: 2020-06-13 11:17
 * @version: V1.0
 **/
public class Test001 {
    private ExecutorService executorService = new ThreadPoolExecutor(
            1, 1, 30, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2), new ThreadPoolExecutor.AbortPolicy()
    );
    @Test
    public void test() {
        // 仓库对象
        Storage storage = new Storage();

        // 生产者对象
        Producer p1 = new Producer(storage);
        Producer p2 = new Producer(storage);
        Producer p3 = new Producer(storage);
        Producer p4 = new Producer(storage);
        Producer p5 = new Producer(storage);
        Producer p6 = new Producer(storage);
        Producer p7 = new Producer(storage);

        // 消费者对象
        Consumer c1 = new Consumer(storage);
        Consumer c2 = new Consumer(storage);
        Consumer c3 = new Consumer(storage);

        // 设置生产者产品生产数量
        p1.setNum(10);
        p2.setNum(10);
        p3.setNum(10);
        p4.setNum(10);
        p5.setNum(10);
        p6.setNum(10);
        p7.setNum(80);

        // 设置消费者产品消费数量
        c1.setNum(50);
        c2.setNum(20);
        c3.setNum(30);

        // 线程开始执行
        try {
            executorService.execute(c1);
        }catch (RejectedExecutionException ignored){

        }
        try {
            executorService.execute(c2);
        }catch (RejectedExecutionException ignored){

        }
        try {
            executorService.execute(c3);
        }catch (RejectedExecutionException ignored){

        }
        try {
            executorService.execute(p1);
        }catch (RejectedExecutionException ignored){

        }
        try {
            executorService.execute(p2);
        }catch (RejectedExecutionException ignored){

        }
        try {
            executorService.execute(p4);
        }catch (RejectedExecutionException ignored){

        }
        try {
            executorService.execute(p5);
        }catch (RejectedExecutionException ignored){

        }
        try {
            executorService.execute(p6);
        }catch (RejectedExecutionException ignored){

        }
        try {
            executorService.execute(p7);
        }catch (RejectedExecutionException ignored){

        }

//        c1.start();
//        c2.start();
//        c3.start();
//        p1.start();
//        p2.start();
//        p3.start();
//        p4.start();
//        p5.start();
//        p6.start();
//        p7.start();
    }
}
