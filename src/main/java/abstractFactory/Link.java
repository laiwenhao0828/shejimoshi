package abstractFactory;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-07-22 23:40
 **/
public abstract class Link extends Item{
    protected String url;
    public Link(String caption,String url) {
        super(caption);
        this.url=url;
    }
}
