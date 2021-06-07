package adapter;

/**
 * @program: shejimoshi
 * @description: 适配器测试
 * @author: Xu Conghui
 * @create: 2019-07-09 23:53
 **/
public class PrintBanner extends Banner implements Print{
    public PrintBanner(String string) {
        super(string);
    }

    public void printWeak() {
        showWithAster();
    }

    public void printStrong() {
        showWithParen();
    }
}
