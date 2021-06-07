package abstractFactory;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-07-22 23:39
 **/
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHtml();
}
