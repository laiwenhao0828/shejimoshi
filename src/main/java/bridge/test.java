package bridge;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-07-24 22:55
 **/
public class test {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("hello,china."));
        Display d2 = new CountDisplay(new StringDisplayImpl("hello,world."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("hello,universe"));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}
