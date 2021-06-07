package bridge;

/**
 * @program: shejimoshi
 * @description: todo 改善后的抽象化
 * @author: Xu Conghui
 * @create: 2019-07-24 22:48
 **/
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void multiDisplay(int times){
        open();
        for (int i=0;i<times;i++){
            print();
        }
        close();
    }
}
