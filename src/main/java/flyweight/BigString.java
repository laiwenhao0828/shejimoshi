package flyweight;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-09-23 23:24
 **/
public class BigString {
    //大型字符的数组
    private BigChar[]bigChars;
    //构造函数
    public BigString(String string){
        bigChars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for(int i=0;i<bigChars.length;i++){
            bigChars[i]=factory.getBigChar(string.charAt(i));
        }
    }
    //显示
    public void print(){
        for(int i=0;i<bigChars.length;i++){
            bigChars[i].print();
        }
    }
    public static void main(String [] args){
        String s = "hello world";
        System.out.println(s.charAt(2));
    }
}
