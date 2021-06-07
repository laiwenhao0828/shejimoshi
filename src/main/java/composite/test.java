package composite;


import builder.Director;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-07-31 23:37
 **/
public class test {
    public static void main(String[] args) {
        try{
            System.out.println("making root entries...");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi",10000));
            bindir.add(new File("latex",20000));
            rootdir.printList();
            System.out.println("");
            System.out.println("making user entries..");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrdir.add(yuki);
            usrdir.add(hanako);
            usrdir.add(tomura);
            yuki.add(new File("diary.html",100));
            yuki.add(new File("Composite.java",200));
            hanako.add(new File("memo.tex",300));
            tomura.add(new File("game.doc",300));
            tomura.add(new File("junk.mail",500));
            rootdir.printList();
        }catch (FileTreatMentException e){
            e.printStackTrace();
        }
    }
}
