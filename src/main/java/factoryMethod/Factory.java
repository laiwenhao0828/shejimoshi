package factoryMethod;

/**
 * @program: shejimoshi
 * @description: 抽象类工厂
 * @author: Xu Conghui
 * @create: 2019-07-11 23:04
 **/
public abstract class Factory {
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
