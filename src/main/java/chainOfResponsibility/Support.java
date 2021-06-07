package chainOfResponsibility;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-08-19 23:10
 **/
public abstract class Support {
    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }
    public Support setNext(Support next){
        this.next=next;
        return next;
    }
    public final void support(Trouble trouble){
        if(resolve(trouble)){
            done(trouble);
        }else if(next!=null){
            next.support(trouble);
        }else {
            fail(trouble);
        }
    }

    protected void fail(Trouble trouble){
        System.out.println(trouble+"cannot be resolved.");
    }

    protected void done(Trouble trouble){
        System.out.println(trouble+"is resolve by "+this+".");
    }

    protected abstract boolean resolve(Trouble trouble);

    @Override
    public String toString() {
        return "Support{" +
                "name='" + name + '\'' +
                '}';
    }
}
