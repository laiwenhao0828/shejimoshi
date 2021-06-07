package factoryMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: shejimoshi
 * @description: 卡片工厂
 * @author: Xu Conghui
 * @create: 2019-07-11 23:15
 **/
public class IDCardFactory extends Factory{
    private List owners = new ArrayList();//主要是制作卡片的人
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
    public List getOwners(){
        return owners;
    }
}
