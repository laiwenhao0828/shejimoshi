package duoxiancheng.lianxi_1;

/**
 * @author: xu_ch[xu_ch@suixingpay.com]
 * @date: 2020-02-26 15:18
 * @version: V1.0
 * @review: xu_ch[xu_ch@suixingpay.com]2020-02-26 15:18
 **/
public class ClientTread extends Thread {
    private Bank bank;

    public ClientTread(Bank bank) {
        this.bank = bank;
    }

    public void run() {
        while (true) {
            boolean ok = bank.withdraw(1000);
            if (ok) {
                bank.deposit(1000);
            }
        }
    }

}

