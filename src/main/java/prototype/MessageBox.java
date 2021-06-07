package prototype;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-07-15 23:40
 **/
public class MessageBox extends ConcreteProduct {
    private char decochar;
    public MessageBox(char decochar){
        this.decochar=decochar;
    }
    public void use(String s) {
        int length = s.getBytes().length;
        for(int i=0;i<length+4;i++){
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar+" "+s+" "+decochar);
        for (int i=0;i<length+4;i++){
            System.out.print(decochar);
        }
        System.out.println("");
    }
}
