package duoxiancheng.lianxi_6;

import java.util.Random;

/**
 * @author: xu_ch[xu_ch@suixingpay.com]
 * @date: 2020-03-16 17:37
 * @version: V1.0
 * @review:
 **/
public class EaterThread extends Thread{
    private final Random random;
    private final Table table;
    public EaterThread(String name,Table table,long seed){
        super(name);
        this.table = table;
        this.random = new Random(seed);
    }
    public void run(){
        try{
            while(true){
                String cake = table.take();
                Thread.sleep(random.nextInt(1000));
            }
        }catch (InterruptedException e){

        }
    }
}

