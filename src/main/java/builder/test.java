package builder;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-07-17 23:44
 **/
public class test {
    public static void main(String[] args) {
//        if(args.length!=1){
//            usage();
//            System.exit(0);
//        }
//        String s = "plain";
//        if(s.equals("plain")){
//            TextBuilder textBuilder = new TextBuilder();
//            Director director = new Director(textBuilder);
//            director.construct();
//            String result = textBuilder.getResult();
//            System.out.println(result);
//        }else if(s.equals("html")){
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String result = htmlBuilder.getResult();
            System.out.println(result+"文件编写完成");
//        }
    }
    public static void usage(){
        System.out.println("usage:java main plain 编写纯文本文档");
//        System.out.println("usage:java main html 编写HTML文档");
    }
}
