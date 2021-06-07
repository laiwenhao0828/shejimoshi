package decorator;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-08-05 22:03
 **/
public abstract class Border extends Display{
    protected Display display;
    protected Border(Display display){
        this.display=display;
    }
}
