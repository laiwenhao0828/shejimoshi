package duoxiancheng.lianxi_4;

import java.util.List;

/**
 * @author: xu_ch[xu_ch@suixingpay.com]
 * @date: 2020-02-28 16:27
 * @version: V1.0
 * @review: xu_ch[xu_ch@suixingpay.com]2020-02-28 16:27
 **/
public class ReaderThread extends Thread{
    private final List<Integer> list;

    public ReaderThread(List<Integer> list) {
        super("ReaderThread");
        this.list = list;
    }
    public void run(){
        while (true){
            synchronized (list){//配合Collections.synchronizedList来使用
                for (int n : list){//循环list隐式调用了迭代器所以需要上锁保证其安全
                    System.out.println(n);
                }
            }
        }
    }
}

