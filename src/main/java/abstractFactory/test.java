package abstractFactory;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-07-22 23:53
 **/
public class test {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("usage:java main class.name.of.ConcreateFactory");
            System.out.println("Example 1:java main listfactory.ListFactory");
            System.out.println("Example 2:java main tablefactory.TableFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);
        Link people = factory.createLink("人民日报","http://www.people.com.cn");
        Link gmw = factory.createLink("光明日报","http://www.gmw.cn");
        Link us_yahoo = factory.createLink("Yahoo!Japan","http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan","http://www.yahoo.co.jp/");
        Link excite = factory.createLink("Excite","http://www.excite.com");
        Link google = factory.createLink("Google","http://www.google.com");
        Tray tray = factory.createTray("日报");
        tray.add(people);
        tray.add(gmw);
        Tray tray1 = factory.createTray("Yahoo!");
        tray1.add(us_yahoo);
        tray1.add(jp_yahoo);
        Tray tray2 = factory.createTray("检索引擎");
        tray2.add(tray1);
        tray2.add(excite);
        tray2.add(google);
        Page page = factory.createPage("LinkPage","杨文轩");
        page.add(tray);
        page.add(tray2);
        page.output();
    }
}
