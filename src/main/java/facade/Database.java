package facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-08-21 23:25
 **/
public class Database {
    public Database() {
    }
    public static Properties getProperties(String dbname){
        String filename = dbname+".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch (IOException e) {
            System.out.println("warning: "+filename+" is found.");
        }
        return prop;
    }
}
