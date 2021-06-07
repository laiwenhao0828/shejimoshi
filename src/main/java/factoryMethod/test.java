package factoryMethod;

/**
 * @program: shejimoshi
 * @description: 测试类
 * @author: Xu Conghui
 * @create: 2019-07-11 23:18
 **/
public class test {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        card1.use();
        card2.use();
    }
}
