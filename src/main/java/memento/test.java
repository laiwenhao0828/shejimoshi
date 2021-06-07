package memento;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-09-04 23:46
 **/
public class test {
    public static void main(String[] args) {
       Gamer gamer = new Gamer(100);
       Memento memento = gamer.createMemento();
       for(int i =0;i<100;i++){
           System.out.println("===="+gamer);
           System.out.println("当前状态是："+gamer);
           gamer.bet();
           System.out.println("所持金钱"+gamer.getMoney()+"元");
           if(gamer.getMoney()>memento.getMoney()){
               System.out.println("所持金钱增加了很多，因此保存游戏当前的状态");
               memento=gamer.createMemento();
           }else if(gamer.getMoney()<memento.getMoney()/2){
               System.out.println("所持的金钱较少了许多，因此游戏恢复至以前的状态");
               gamer.restoreMemento(memento);
           }
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println("");
       }
    }
}
