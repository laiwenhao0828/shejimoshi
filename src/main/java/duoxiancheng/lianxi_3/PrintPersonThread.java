package duoxiancheng.lianxi_3;

/**
 * @author: xu_ch[xu_ch@suixingpay.com]
 * @date: 2020-02-28 14:59
 * @version: V1.0
 * @review: xu_ch[xu_ch@suixingpay.com]2020-02-28 14:59
 **/
public class PrintPersonThread extends Thread {
    private Person person;

    public PrintPersonThread(Person person) {
        this.person = person;
    }

    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " prints " + person);
        }
    }
}

