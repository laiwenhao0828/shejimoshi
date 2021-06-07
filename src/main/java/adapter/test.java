package adapter;

/**
 * @program: shejimoshi
 * @description: 适配器测试
 * @author: Xu Conghui
 * @create: 2019-07-09 23:54
 **/
public class test {
    public static void main(String[] args) {
//        Print p = new PrintBanner("hello");
//        p.printStrong();
//        p.printWeak();
        Print01 p = new PrintBanner01("hello");
        p.printStrong();
        p.printWeak();
    }
}
