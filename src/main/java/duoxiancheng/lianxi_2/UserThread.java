package duoxiancheng.lianxi_2;

import java.util.Random;

/**
 * @author: xu_ch[xu_ch@suixingpay.com]
 * @date: 2020-02-28 10:27
 * @version: V1.0
 * @review: xu_ch[xu_ch@suixingpay.com]2020-02-28 10:27
 **/
public class UserThread  extends Thread{
    private final static Random random = new Random(26535);
    private final BoundedResource resource;

    public UserThread(BoundedResource resource) {
        this.resource = resource;
    }
    public void run(){
        try{
            while(true){
                resource.use();
                Thread.sleep(random.nextInt(3000));
            }
        }catch (InterruptedException e){

        }
    }

    public static void main(String[] args) {
        BoundedResource boundedResource = new BoundedResource(3);
        for(int i = 0 ; i<10;i++){
            new UserThread(boundedResource).start();
        }
    }
}

