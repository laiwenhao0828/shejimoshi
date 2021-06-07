package strategy;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-07-29 23:28
 **/
public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
