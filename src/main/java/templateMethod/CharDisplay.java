package templateMethod;

/**
 * @program: shejimoshi
 * @description: 实现类
 * @author: Xu Conghui
 * @create: 2019-07-10 23:49
 **/
public class CharDisplay extends AbstractDisplay{
    private String s;
    public CharDisplay(String s){
        this.s=s;
    }
    public void start() {
        System.out.println("<<");
    }

    public void print() {
        System.out.println(s);
    }

    public void end() {
        System.out.println(">>");
    }
}
