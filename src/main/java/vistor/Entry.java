package vistor;


import java.util.Iterator;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-08-12 23:41
 **/
public abstract class Entry implements Element {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }
    public Iterator iterator() throws FileTreatmentException{
        throw new FileTreatmentException();
    }
    public String toString(){
        return getName()+"("+getSize()+")";
    }
}
