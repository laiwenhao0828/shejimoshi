package singleton;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-07-14 23:44
 **/
public class TicketMaker {
    private int ticketNum=1000;
    private static TicketMaker singloton = new TicketMaker();

    private TicketMaker() {
    }
    public static TicketMaker getInstance(){
        return singloton;
    }
    public synchronized  int getTicketNum(){
        return ticketNum++;
    }

}
