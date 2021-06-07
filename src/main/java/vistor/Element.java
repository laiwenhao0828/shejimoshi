package vistor;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-08-12 23:40
 **/
public interface Element {
    public abstract void accept(Visitor visitor);
}
