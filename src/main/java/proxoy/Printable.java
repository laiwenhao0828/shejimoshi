package proxoy;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-10-24 22:09
 **/
public interface Printable{
    public abstract void setPrinterName(String name);
    public abstract String getPrinterName();
    public abstract void print(String s);
}
