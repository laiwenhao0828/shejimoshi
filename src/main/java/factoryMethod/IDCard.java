package factoryMethod;

/**
 * @program: shejimoshi
 * @description: 实现类
 * @author: Xu Conghui
 * @create: 2019-07-11 23:10
 **/
public class IDCard extends Product{
    private String owner;
    public IDCard(String owner){
        System.out.println("制作"+owner+"ID卡");
        this.owner=owner;
    }
    public void use() {
        System.out.println("使用"+owner+"ID卡");
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
