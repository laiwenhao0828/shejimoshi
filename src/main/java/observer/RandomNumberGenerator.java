package observer;

import java.util.Random;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-09-02 23:05
 **/
public class RandomNumberGenerator extends NumberGenerator{
    private Random random = new Random();
    private int number;
    public int getNumber() {
        return number;
    }

    public void excute() {
        for(int i=0;i<20;i++){
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
