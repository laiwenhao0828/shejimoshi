package duoxiancheng.lianxi_6;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author: xu_ch[xu_ch@suixingpay.com]
 * @date: 2020-03-16 17:47
 * @version: V1.0
 * @review: xu_ch[xu_ch@suixingpay.com]2020-03-16 17:47
 **/
public class Test {
//    public static void main(String[] args) {

        String str1 ="127";
        String str2 ="20";
//        int[] num1 = new int[str1.length()];  //num1[]存储第一个大数
//        int[] num2 = new int[str2.length()];  //num2[]存储第二个大数
//        int len = 1 + Math.max(str1.length(), str2.length());//找到两个大数中位数更高的一个并+1，设置为求和数组的长度
//        int[] sum = new int[len];             //sum[]存储两大数之和
//        for (int a = 0; a < str1.length(); a++) {
//            //将str1数字逐个倒序放入数组num1[]
//            num1[str1.length() - a - 1] = Integer.parseInt(str1.substring(a, a + 1));
//        }
//        for (int b = 0; b < str2.length(); b++) {
//            //将str2数字逐个倒序放入数组num2[]
//            num2[str2.length() - b - 1] = Integer.parseInt(str2.substring(b, b + 1));
//        }
//        int overflow = 0;
//        for (int i = 0; i < len - 1; i++) {
//            //逐位相加，满10进1
//            sum[i] = num2[i] + num1[i] + overflow;
//            if (sum[i] >= 10) {
//                sum[i] = sum[i] % 10;
//                overflow = 1;
//            } else {
//                overflow = 0;
//            }
//        }
//        for (int j = len - 1; j >= 0; j--) {
//            System.out.print(sum[j]);
//        }
//        int [] num1 = new int[str1.length()];
//        int [] num2 = new int[str2.length()];
//        int max = Math.max(str1.length(), str2.length());
//        int [] sum = new int[max];
//        for(int i = 0;i<str1.length()-1;i++){
//         num1[str1.length()-i] = Integer.parseInt(str1.substring(i,i+1));
//        }
//        for(int i = 0;i<str2.length()-1;i++){
//            num1[str2.length()-i] = Integer.parseInt(str2.substring(i,i+1));
//        }
//        for(int j = 0;j<max;j++){
////            sum[j]=
//        }
//        AtomicInteger i = new AtomicInteger();
//        i.incrementAndGet();
//    }
    public static void main(String [] args) {

        int i = 1;
        i = i++;
        i = ++i;
        int j = i++;
        int k = ++j;
        int m = i++ * ++i;
        System.out.println("m: " + m);
    }


}

