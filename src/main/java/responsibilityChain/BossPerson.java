package responsibilityChain;

/**
 * @author: xu_ch[xu_ch@suixingpay.com]
 * @date: 2020-02-03 09:27
 * @version: V1.0
 * @review: xu_ch[xu_ch@suixingpay.com]2020-02-03 09:27
 **/
public class BossPerson extends ReviewPerson{
    private String NAME = "boss";
    void chain(String program) {
        if("无bug".equals(program)){
            System.out.println(NAME+"上线");
        }else{
            System.out.println("去调整");
        }
    }
}

