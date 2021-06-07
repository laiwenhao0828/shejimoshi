package adapter;

/**
 * @program: shejimoshi
 * @description: 对象适配器-测试
 * @author: Xu Conghui
 * @create: 2019-07-10 00:08
 **/
public class PrintBanner01 extends Print01{
    private Banner banner;
    public PrintBanner01(String s){
        this.banner=new Banner(s);
    }
    public void printWeak() {
        banner.showWithAster();
    }

    public void printStrong() {
        banner.showWithParen();
    }
}
