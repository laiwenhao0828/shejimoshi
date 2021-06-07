package responsibilityChain;

/**
 * @author: xu_ch[xu_ch@suixingpay.com]
 * @date: 2020-02-03 09:12
 * @version: V1.0
 * @review: xu_ch[xu_ch@suixingpay.com]2020-02-03 09:12 责任链模式
 **/
public abstract class ReviewPerson {
    private ReviewPerson reviewPerson;

    public ReviewPerson getReviewPerson() {
        return reviewPerson;
    }

    public void setReviewPerson(ReviewPerson reviewPerson) {
        this.reviewPerson = reviewPerson;
    }
    abstract void chain(String program);
}

