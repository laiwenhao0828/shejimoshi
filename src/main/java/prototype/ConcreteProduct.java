package prototype;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-07-17 22:55
 **/
public class ConcreteProduct implements Product{
    public void use(String s) {

    }

    public Product createClone() {
        Product p=null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return p;
    }
}
