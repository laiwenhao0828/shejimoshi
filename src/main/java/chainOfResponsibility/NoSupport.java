package chainOfResponsibility;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-08-19 23:17
 **/
public class NoSupport extends Support{
    public NoSupport(String name) {
        super(name);
    }

    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
