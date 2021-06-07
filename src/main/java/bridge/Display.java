package bridge;

/**
 * @program: shejimoshi
 * @description: todo 抽象化
 * @author: Xu Conghui
 * @create: 2019-07-24 22:46
 **/
public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }
    public void open(){
        impl.rawOpen();
    }
    public void print(){
        impl.rawPrint();
    }
    public void close(){
        impl.rawClose();
    }
    public final void display(){
        open();
        print();
        close();
    }
}
