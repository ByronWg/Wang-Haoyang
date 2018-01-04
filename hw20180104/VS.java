/**
 * Project Name:Wang-Haoyang
 * File Name:VS.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午3:24:38
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午3:24:38 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */
public class VS {

    public static void main(String[] args) {

        String c1 = "i am good";
        String c2 = "i am good";
        String c3 = "I AM GOOD";
        String c4 = new String("i am good");
        String c5 = new String("i am good");
        String c6 = new String("I AM GOOD");
        System.out.println("c1==c2:" + (c1 == c2));// true
        System.out.println("c1==c3:" + (c1 == c3));// 大写 false
        System.out.println("c4==c5:" + (c4 == c5));// new 出来的开辟了新的内存空间，因此false
        System.out.println("c4==c6:" + (c4 == c6));// 同上
        System.out.println("c1.equals(c2)" + c1.equals(c2));// true
        System.out.println("c1.equals(c3)" + c1.equals(c3));// false
        System.out.println("c4.equals(c5)" + c4.equals(c5));// true
        System.out.println("c4.equals(c6)" + c4.equals(c6));// false
        System.out.println("c1.equalsIgnoreCase(c2)" + c1.equalsIgnoreCase(c2));// true
        System.out.println("c1.equalsIgnoreCase(c3)" + c1.equalsIgnoreCase(c3));// true
        System.out.println("c4.equalsIgnoreCase(c5)" + c4.equalsIgnoreCase(c5));// true
        System.out.println("c4.equalsIgnoreCase(c6)" + c4.equalsIgnoreCase(c6));// true

    }

}
// 通用程度： equalsIgnoreCase()>equals()>new>直接赋值