package builder;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-07-17 23:25
 **/
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct(){
        builder.makeTitle("标题");
        builder.makeString("从早上到下午");
        builder.makeItems(new String[]{"早上好","下午好"});
        builder.makeString("晚上");
        builder.makeItems(new String[]{"晚上好","晚安","再见"});
        builder.close();
    }
}
