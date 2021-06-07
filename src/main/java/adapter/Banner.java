package adapter;

/**
 * @program: shejimoshi
 * @description: 适配器测试
 * @author: Xu Conghui
 * @create: 2019-07-09 23:50
 **/
public class Banner {
    private String string;
    public Banner(String string){
        this.string=string;
    }
    public void showWithParen(){
        System.out.println("("+string+")");
    }
    public void showWithAster(){
        System.out.println("*"+string+"*");
    }
}
