package adapter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @program: shejimoshi
 * @description: 适配器
 * @author: Xu Conghui
 * @create: 2019-07-10 23:18
 **/
public class FileAdapter extends Properties implements FileIO {

    public void readFromFile(String fileName) throws IOException {
        load(new FileInputStream(fileName));
    }

    public void writeToFile(String fileName) throws IOException {
        store(new FileOutputStream(fileName),"write by FileProperties");
    }

    public void setFile(String key, String value) {
        setProperty(key,value);
    }

    public String getFile(String key) {
        return (String) get(key);
    }
}
