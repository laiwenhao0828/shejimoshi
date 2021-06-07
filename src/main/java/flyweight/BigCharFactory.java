package flyweight;

import java.util.HashMap;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-09-23 23:18
 **/
public class BigCharFactory {
    //管理已经生成的BigChar
    private HashMap pool = new HashMap();
    //singleton 模式
    private static BigCharFactory singleton = new BigCharFactory();
    //构造函数

    public BigCharFactory() {
    }
    public static BigCharFactory getInstance(){
        return singleton;
    }
    //生成(共享)BigChar类的实例
    public synchronized BigChar getBigChar(char charname){
        BigChar bc = (BigChar) pool.get(""+charname);
        if(bc == null){
            bc=new BigChar(charname);
            pool.put(""+charname,bc);
        }
        return bc;
    }
}
