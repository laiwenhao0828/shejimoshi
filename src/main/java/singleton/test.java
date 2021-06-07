package singleton;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-07-14 22:48
 **/
public class test {
    public static void main(String[] args) {
//        System.out.println("start....");
//        Singleton s1 = Singleton.getInstance();
//        Singleton s2 = Singleton.getInstance();
//        if(s1==s2){
//            System.out.println("是相同实例");
//        }else {
//            System.out.println("不是相同实例");
//        }
//        ball ball1 = ball.builder().daxiao("10").yanse("红色").build();
//        System.out.println(ball1.getDaxiao());
        for (int i=0;i<10;i++){
            System.out.println(i+":"+TicketMaker.getInstance().getTicketNum());
        }
    }
}
