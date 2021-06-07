package adapter;

import java.io.IOException;

public interface FileIO {
    public void readFromFile(String fileName) throws IOException;
    public void writeToFile(String fileName) throws IOException;
    public void setFile(String key,String value);
    public String getFile(String key);
}
