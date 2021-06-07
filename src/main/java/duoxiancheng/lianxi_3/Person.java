package duoxiancheng.lianxi_3;

/**
 * @author: xu_ch[xu_ch@suixingpay.com]
 * @date: 2020-02-28 14:57
 * @version: V1.0
 * @review: xu_ch[xu_ch@suixingpay.com]2020-02-28 14:57
 **/
public class Person {
    private final String name;
    private final String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

