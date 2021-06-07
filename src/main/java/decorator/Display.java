package decorator;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-08-05 21:57
 **/
public abstract class Display {
    public abstract int getColumns();
    public abstract int getRows();
    public abstract String getRowText(int row);
    public final void show(){
        for (int i=0;i<getRows();i++){
            System.out.println(getRowText(i));
        }
    }
}
