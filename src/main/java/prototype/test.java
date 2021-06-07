package prototype;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-07-15 23:51
 **/
public class test {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox messageBox = new MessageBox('*');
        MessageBox messageBox1 = new MessageBox('/');
        manager.register("strong message",underlinePen);
        manager.register("warning box",messageBox);
        manager.register("slash box",messageBox1);
        Product p1 = manager.create("strong message");
        p1.use("Hello world.");
        Product p2 = manager.create("warning box");
        p2.use("Hello world.");
        Product p3 = manager.create("slash box");
        p3.use("Hello world.");
    }
}
