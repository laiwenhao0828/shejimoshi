package duoxiancheng.lianxi_1;

/**
 * @author: xu_ch[xu_ch@suixingpay.com]
 * @date: 2020-02-26 15:00
 * @version: V1.0
 * @review: xu_ch[xu_ch@suixingpay.com]2020-02-26 15:00
 **/
public class main {
    public static void main(String[] args) {
        Bank bank = new Bank(10000,"A Bad Bank");
        new ClientTread(bank).start();
        new ClientTread(bank).start();
        new ClientTread(bank).start();
    }
}

