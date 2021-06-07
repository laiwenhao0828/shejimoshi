package prototype;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-07-15 23:48
 **/
public class UnderlinePen extends ConcreteProduct{
    private char ulchar;
    public UnderlinePen(char ulchar){
        this.ulchar=ulchar;
    }
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\""+s+"\"");
        System.out.print("");
        for (int i=0;i<length;i++){
            System.out.print(ulchar);
        }
        System.out.println("");
    }
}
