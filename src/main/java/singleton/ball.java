package singleton;

import java.io.Serializable;

/**
 * @program: shejimoshi
 * @description:
 * @author: Xu Conghui
 * @create: 2019-07-14 23:24
 **/
public class ball implements Serializable {
    private String yanse;
    private String daxiao;

    private ball(String yanse, String daxiao) {
        this.yanse = yanse;
        this.daxiao = daxiao;
    }
    static  ballBuilder builder(){
        return new ballBuilder();
    }
    public static class ballBuilder{
        private String yanse;
        private String daxiao;

        private ballBuilder() {
        }

        public ballBuilder yanse(String yanse) {
            this.yanse = yanse;
            return this;
        }

        public ballBuilder daxiao(String daxiao) {
            this.daxiao = daxiao;
            return this;
        }
        public ball build(){
            return new ball(yanse,daxiao);
        }
    }

    public String getYanse() {
        return yanse;
    }

    public String getDaxiao() {
        return daxiao;
    }
}
