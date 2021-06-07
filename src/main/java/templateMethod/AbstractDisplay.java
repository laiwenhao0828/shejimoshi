package templateMethod;

/**
 * @program: shejimoshi
 * @description: 抽象类
 * @author: Xu Conghui
 * @create: 2019-07-10 23:47
 **/
public abstract class AbstractDisplay {
    public abstract void start();
    public abstract void print();
    public abstract void end();
    final void display(){
        start();
        for (int i=0;i<5;i++){
            print();
        }
        end();
    }
}
