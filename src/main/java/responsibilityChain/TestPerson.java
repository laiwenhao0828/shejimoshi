package responsibilityChain;

import java.util.logging.Logger;

/**
 * @author: xu_ch[xu_ch@suixingpay.com]
 * @date: 2020-02-03 09:19
 * @version: V1.0
 * @review: xu_ch[xu_ch@suixingpay.com]2020-02-03 09:19
 **/
public class TestPerson extends ReviewPerson{
    private String NAME = "测试人员";
    void chain(String program) {
        if("无bug".equals(program)){
            System.out.println(NAME+":测试无bug");
            getReviewPerson().chain(program);
        }else {
            System.out.println("再修改修改");
        }
    }
}


