package templateMethod;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-07-10 23:52
 **/
public class test {
    public static void main(String[] args) {
        AbstractDisplay abstractDisplay = new CharDisplay("H");
        abstractDisplay.display();
    }
}
