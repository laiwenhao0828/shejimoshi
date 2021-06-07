package decorator;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-08-05 22:01
 **/
public class StringDisplay extends Display{
    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    public int getColumns() {
        return string.getBytes().length;
    }

    public int getRows() {
        return 1;
    }

    public String getRowText(int row) {
        if(row==0){
            return string;
        }else {
            return null;
        }
    }
}
