package duoxiancheng.lianxi_5;

/**
 * @author: xu_ch[xu_ch@suixingpay.com]
 * @date: 2020-02-28 21:16
 * @version: V1.0
 * @review: xu_ch[xu_ch@suixingpay.com]2020-02-28 21:16
 **/
public class UserInfo {
    private final String info;
//    private final StringBuffer info; 因为String的变量是不可变的，当String的变量调用replace的时候，如果变量里面包含替换的单词会返回一个   新的变量，原来的变量还是不变的，如果变量里面不包含则返回原变量
//    如果是StringBuffer 的变量，调用replace的时候，原有的变量会被改变

    public UserInfo(String name, String address) {
        this.info = "<info name=\"" + name + "\" address\"" + address + "\" />";
    }

    public String getInfo() {
        return info;
    }

    public String toString() {
        return "[ UserInfo: " + info + "]";
    }

    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("alice","alaska");
        System.out.println("userInfo = " + userInfo);
        String info = userInfo.getInfo();
        String replace = info.replace("alice", "bobby");
        System.out.println("userinfo:"+userInfo);
        System.out.println(replace);
    }
}

