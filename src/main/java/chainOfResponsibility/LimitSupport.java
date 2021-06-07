package chainOfResponsibility;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-08-19 23:20
 **/
public class LimitSupport extends Support{
    private int limit;
    public LimitSupport(String name,int limit) {
        super(name);
        this.limit=limit;
    }

    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber()<limit){
            return true;
        }else{
            return false;
        }
    }
}
