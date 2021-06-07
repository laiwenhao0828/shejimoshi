package observer;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-09-02 23:12
 **/
public class GraphObserver implements Observer{
    public void update(NumberGenerator generator) {
        System.out.println("GraphObserver:");
        int count = generator.getNumber();
        for(int i=0;i<count;i++){
            System.out.println("*");
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
