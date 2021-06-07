package responsibilityChain;

/**
 * @author: xu_ch[xu_ch@suixingpay.com]
 * @date: 2020-02-03 09:29
 * @version: V1.0
 * @review: xu_ch[xu_ch@suixingpay.com]2020-02-03 09:29
 **/
public class test {
    public static void main(String[] args) {
        TestPerson testPerson = new TestPerson();
        CtoPerson ctoPerson = new CtoPerson();
        BossPerson bossPerson = new BossPerson();
        testPerson.setReviewPerson(ctoPerson);
        ctoPerson.setReviewPerson(bossPerson);
        testPerson.chain("无bug");
    }
}

