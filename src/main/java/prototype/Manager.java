package prototype;

import java.util.HashMap;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-07-15 23:36
 **/
public class Manager {
    private HashMap showcase = new HashMap();
    public void register(String name,Product product){
     showcase.put(name,product);
    }
    public Product create(String protoname){
        Product product = (Product) showcase.get(protoname);
        return product.createClone();
    }
}
