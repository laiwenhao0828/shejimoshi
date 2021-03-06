package strategy;

import java.util.Random;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-07-29 23:29
 **/
public class WinningStrategy implements Strategy{
    private Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    public Hand nextHand() {
        if(!won){
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    public void study(boolean win) {
        won=win;
    }
}
