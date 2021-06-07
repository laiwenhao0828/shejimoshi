package builder;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-07-17 23:29
 **/
public class TextBuilder implements Builder{
    private StringBuffer stringBuffer = new StringBuffer();

    public void makeTitle(String title) {
        stringBuffer.append("==============");
        stringBuffer.append("["+title+"]\n");
        stringBuffer.append("\n");
    }

    public void makeString(String str) {
        stringBuffer.append("N"+str+"\n");
        stringBuffer.append("\n");
    }

    public void makeItems(String[] items) {
        for (int i=0;i<items.length;i++){
            stringBuffer.append("  ."+items[i]+"\n");
        }
        stringBuffer.append("\n");
    }

    public void close() {
        stringBuffer.append("========================\n");
    }
    public String getResult(){
        return stringBuffer.toString();
    }
}
