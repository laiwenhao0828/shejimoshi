package singleton;

/**
 * @program: shejimoshi
 * @description: 单例
 * @author: Xu Conghui
 * @create: 2019-07-14 22:46
 **/
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){
        System.out.println("生成了一个实例");
    }
    public static Singleton getInstance(){
        return singleton;
    }
}
