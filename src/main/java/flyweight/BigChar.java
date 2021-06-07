package flyweight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-09-23 23:09
 **/
public class BigChar {
    //字符关键字
    private char charname;
    //大型字符对应的字符串
    private String fontdata;

    public BigChar(char charname) {
        this.charname = charname;
            try {
                BufferedReader reader = new BufferedReader(
                        new FileReader("big"+charname+".txt")
                );
                String line;
                StringBuffer buffer = new StringBuffer();
                while ((line=reader.readLine())!=null){
                    buffer.append(line);
                    buffer.append("\n");
                }
                reader.close();
                this.fontdata=buffer.toString();
            } catch (IOException e) {
                this.fontdata=charname+"?";
            }

    }
    public void print(){
        System.out.println(fontdata);
    }
}
