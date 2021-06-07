package duoxiancheng.lianxi_1;

/**
 * @author: xu_ch[xu_ch@suixingpay.com]
 * @date: 2020-02-26 14:32
 * @version: V1.0
 * @review: 多线程
 **/
public class Bank {
    private int money;
    private String name;

    public Bank(int money, String name) {
        this.money = money;
        this.name = name;
    }

    public void deposit(int m) {
        money += m;
    }

    public boolean withdraw(int m) {
        if (money >= m) {
            money -= m;
            check();
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    private void check() {
        if (money < 0) {
            System.out.println("可用余额为负数！money = " + money);
        }
    }

}

