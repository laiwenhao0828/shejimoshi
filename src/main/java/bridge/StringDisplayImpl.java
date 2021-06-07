package bridge;

/**
 * @program: shejimoshi
 * @description: todo 具体实现者
 * @author: Xu Conghui
 * @create: 2019-07-24 22:52
 **/
public class StringDisplayImpl extends DisplayImpl{
    private String string;
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    public void rawOpen() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i=0;i<width;i++){
            System.out.print("-");
        }
        System.out.println("+");
    }

    public void rawPrint() {
        System.out.println("|"+string+"|");
    }

    public void rawClose() {
        printLine();
    }
}
