package proxoy;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-10-24 22:20
 **/
public class PrinterProxy implements Printable{
    private String name;//名字
    private Printer real;//本人

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {
        this.name = name;
    }

    public void setPrinterName(String name) {
        if(real!=null){
            real.setPrinterName(name);
        }
        this.name=name;
    }

    public String getPrinterName() {
        return name;
    }

    public void print(String s) {
        realize();
        real.print(s);
    }
    private synchronized void realize(){
        if(real==null){
            real=new Printer(name);
        }
    }
}
