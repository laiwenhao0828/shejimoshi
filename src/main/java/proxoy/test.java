package proxoy;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-10-24 22:25
 **/
public class test {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("现在的名字是"+p.getPrinterName()+"。");
        p.setPrinterName("Bob");
        System.out.println("现在的名字是"+p.getPrinterName()+"。");
        p.print("hello,world");
    }
}
