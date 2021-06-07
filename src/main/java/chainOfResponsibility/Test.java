package chainOfResponsibility;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-08-19 23:27
 **/
public class Test {
    public static void main(String[] args) {
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob",100);
        Support charlie = new SpecialSupport("Charlie",429);
        Support diana = new LimitSupport("Diana",200);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred",300);
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
        for(int i=0;i<501;i++){
            alice.support(new Trouble(i));
        }
    }
}
