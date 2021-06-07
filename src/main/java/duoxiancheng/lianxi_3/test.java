package duoxiancheng.lianxi_3;

/**
 * @author: xu_ch[xu_ch@suixingpay.com]
 * @date: 2020-02-28 15:00
 * @version: V1.0
 * @review: xu_ch[xu_ch@suixingpay.com]2020-02-28 15:00
 **/
public class test {
    public static void main(String[] args) {
        Person alice = new Person("Alice","Alaska");
        new PrintPersonThread(alice).start();
        new PrintPersonThread(alice).start();
        new PrintPersonThread(alice).start();
    }
}

