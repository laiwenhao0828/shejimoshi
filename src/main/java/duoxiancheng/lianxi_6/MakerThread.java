package duoxiancheng.lianxi_6;



import duoxiancheng.lianxi_3.Person;

import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author: xu_ch[xu_ch@suixingpay.com]
 * @date: 2020-03-16 16:01
 * @version: V1.0
 * @review: xu_ch[xu_ch@suixingpay.com]2020-03-16 16:01
 **/
public class MakerThread extends Thread {
    private final Random random;
    private final Table table;
    private static int id = 0;

    public MakerThread(String name, Table table, long seed) {
        super(name);
        this.table = table;
        this.random = new Random(seed);
    }
    public void run(){
        try {
            while (true){
                Thread.sleep(random.nextInt(1000));
                String cake = "[Cake No.]"+nextId() + " by " + getName() + "]";
                table.put(cake);
            }
        }catch (InterruptedException e){
        }
    }

    private static synchronized int nextId() {
        return id++;
    }
    public static void main(String[] args) {
        //如果当前值 == 预期值，则以原子方式将该值设置为给定的更新值。
        // 通过AtomicReference存储person的值，地址引用是不变的，值会被新的person重新赋值
        Person test = new Person("test3" , "123");
        AtomicReference<Person> atomicReference2 = new AtomicReference<Person>(test);
        Boolean bool = atomicReference2.compareAndSet(test, new Person("test4", "abc"));
        System.out.println("simpleObject  Value: " + bool);
        System.out.println(atomicReference2.get());
        System.out.println(atomicReference2.getAndSet(test));
    }
}

