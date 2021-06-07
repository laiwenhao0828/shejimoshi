package composite;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-07-31 23:23
 **/
public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatMentException{
        throw new FileTreatMentException();
    }
    public void printList(){
        printList("");
    }
    protected abstract void printList(String prefix);
    public String toString(){
        return getName() + "("+getSize()+")";
    }
}
