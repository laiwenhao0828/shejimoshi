package duoxiancheng.lianxi_4;

import java.util.List;

/**
 * @author: xu_ch[xu_ch@suixingpay.com]
 * @date: 2020-02-28 16:24
 * @version: V1.0
 * @review: xu_ch[xu_ch@suixingpay.com]2020-02-28 16:24
 **/
public class WrieterThread extends Thread{
    private final List<Integer> list;

    public WrieterThread(List<Integer> list) {
        super("WriterThread");
        this.list = list;
    }
    public void run(){
        for(int i = 0;true;i++){
            list.add(i);
            list.remove(0);
        }
    }
}

