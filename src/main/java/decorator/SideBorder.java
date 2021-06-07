package decorator;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-08-05 22:05
 **/
public class SideBorder extends Border{
    private char borderChar;
    protected SideBorder(Display display,char ch) {
        super(display);
        this.borderChar = ch;
    }

    public int getColumns() {
        return 1+display.getColumns()+1;
    }

    public int getRows() {
        return display.getRows();
    }

    public String getRowText(int row) {
        return borderChar+display.getRowText(row)+borderChar;
    }
}
