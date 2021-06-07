package observer;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-09-02 23:14
 **/
public class test {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        numberGenerator.addObserver(observer1);
        numberGenerator.addObserver(observer2);
        numberGenerator.excute();
    }
}
