package vistor;

import builder.Director;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-08-13 00:19
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
            rootdir.accept(new ListVisitor());
            System.out.println("");
            System.out.println("making user entries...");
            Directory yuki = new Directory("yuki");
            Directory hanko = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrdir.add(yuki);
            usrdir.add(hanko);
            usrdir.add(tomura);
            yuki.add(new File("diary.html",100));
            yuki.add(new File("Composite.java",200));
            hanko.add(new File("memo.tex",300));
            tomura.add(new File("game.doc",400));
            rootdir.accept(new ListVisitor());
        }catch (FileTreatmentException f){
            f.printStackTrace();
        }
    }
}
