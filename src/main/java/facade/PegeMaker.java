package facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-08-21 23:40
 **/
public class PegeMaker {
    public PegeMaker() {
    }
    public static void makeWelcomePage(String mailaddr,String filename){
        Properties mailprop = Database.getProperties("maildata");
        String username = mailprop.getProperty(mailaddr);
        try {
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("welcome to "+username+"'s page");
            writer.paragraph(username+"欢迎来到"+username+"的主页。");
            writer.paragraph("等着你的邮件！");
            writer.mailto(mailaddr,username);
            writer.close();
            System.out.println(filename+" is createed for "+mailaddr+"("+username+")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
