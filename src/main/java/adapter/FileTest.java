package adapter;

import java.io.IOException;

/**
 * @program: shejimoshi
 * @description: 文件上传测试类
 * @author: Xu Conghui
 * @create: 2019-07-10 23:24
 **/
public class FileTest {
    public static void main(String[] args) {
        FileIO fileIO = new FileAdapter();
        try {
            fileIO.readFromFile("new.txt");
            String value = fileIO.getFile("key");
            System.out.println(value);
//            fileIO.setFile("key","123");
//            fileIO.writeToFile("new.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
