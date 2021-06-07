package duoxiancheng.lianxi_2;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * @author: xu_ch[xu_ch@suixingpay.com]
 * @date: 2020-02-28 10:18
 * @version: 信号量
 * @review: xu_ch[xu_ch@suixingpay.com]2020-02-28 10:18
 **/
class Log {
    public static void println(String s) {
        System.out.println(Thread.currentThread().getName() + ":  " + s);
    }
}

class BoundedResource {
    private final Semaphore semaphore;
    private final int permits;
    private final static Random random = new Random(314159);

    public BoundedResource(int permits) {
        this.permits = permits;
        this.semaphore = new Semaphore(permits);
    }

    public void use() throws InterruptedException {
        semaphore.acquire();
        try {
            douUse();
        } finally {
            semaphore.release();
        }
    }

    private void douUse() throws InterruptedException {
        Log.println("BEGIN: use = " + (permits - semaphore.availablePermits()));
        Thread.sleep(random.nextInt(500));
        Log.println("END:  used = " + (permits - semaphore.availablePermits()));
    }
}

