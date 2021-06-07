package duoxiancheng.lianxi_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author: xu_ch[xu_ch@suixingpay.com]
 * @date: 2020-02-28 16:30
 * @version: V1.0
 * @review: xu_ch[xu_ch@suixingpay.com]2020-02-28 16:30
 **/
public class test {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>();
//        List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());
        final List<Integer> list = new CopyOnWriteArrayList<Integer>();
        new WrieterThread(list).start();
        new ReaderThread(list).start();
        String s = "Abc";
        String replace = s.replace("A", "a");

    }
}

