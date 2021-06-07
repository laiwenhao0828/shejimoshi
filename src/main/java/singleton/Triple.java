package singleton;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-07-14 23:59
 **/
public class Triple {
    private static Triple[] triple = new Triple[]{
      new Triple(0),
            new Triple(1),
            new Triple(2),
    };
    private int id;
    private Triple(int id){
        System.out.println("the instance "+id+" is created.");
        this.id=id;
    }
    public static Triple getInstance(int id){
        return triple[id];
    }
    public String toString(){
        return "[Triple id ="+id+"]";
    }

    public static void main(String[] args) {
        System.out.println("start..");
        for (int i=0;i<9;i++){
            Triple triple = Triple.getInstance(i%3);
        }
        System.out.println("end...");
    }
}
