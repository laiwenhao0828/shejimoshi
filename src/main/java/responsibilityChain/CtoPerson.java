package responsibilityChain;

/**
 * @author: xu_ch[xu_ch@suixingpay.com]
 * @date: 2020-02-03 09:24
 * @version: V1.0
 * @review: xu_ch[xu_ch@suixingpay.com]2020-02-03 09:24
 **/
public class CtoPerson extends ReviewPerson{
    private String NAME = "cto";
    void chain(String program) {
        if("无bug".equals(program)){
            System.out.println(NAME+":无bug");
            getReviewPerson().chain(program);
        }else{
            System.out.println("再修改修改");
        }
    }
}

