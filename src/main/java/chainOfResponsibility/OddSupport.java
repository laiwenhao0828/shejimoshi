package chainOfResponsibility;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-08-19 23:22
 **/
public class OddSupport extends Support{
    public OddSupport(String name) {
        super(name);
    }

    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber()%2==1){
            return true;
        }else {
            return false;
        }
    }
}
