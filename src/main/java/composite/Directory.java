package composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-07-31 23:31
 **/
public class Directory extends Entry{
    private String name;
    private ArrayList directory = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        int size = 0;
        Iterator integer = directory.iterator();
        while (integer.hasNext()){
            Entry next = (Entry) integer.next();
            size+=next.getSize();
        }
        return size;
    }
    public Entry add(Entry entry){
        directory.add(entry);
        return this;
    }
    protected void printList(String prefix) {
        System.out.println(prefix+"/"+this);
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()){
            Entry next = (Entry) iterator.next();
            next.printList(prefix+"/"+name);
        }
    }
}
