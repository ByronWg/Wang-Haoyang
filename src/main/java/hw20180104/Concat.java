/**
 * Project Name:Wang-Haoyang
 * File Name:Concat.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午2:52:48
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午2:52:48 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */

/**
 * public String concat(String str)将指定字符串连接到此字符串的结尾。 如果参数字符串的长度为 0，则返回此 String
 * 对象。否则，创建一个新的 String 对象， 用来表示由此 String 对象表示的字符序列和参数字符串表示的字符序列连接而成的字符序列。
 * 
 * 示例：
 * 
 * "cares".concat("s") returns "caress" "to".concat("get").concat("her") returns
 * "together"
 * 
 * 参数： str - 连接到此 String 结尾的 String。 返回： 一个字符串，它表示在此对象字符后连接字符串参数字符而成的字符。
 * 
 */

public class Concat {
    String Concat() {

        {
            String str1 = "ABCDEFGHIJKLM";
            String str2 = "NOPQRSTUVWXYZ";
            String s = str1.concat(str2);
            // 返回连接好的字符串。
            return (s);
        }
    }

    public static void main(String[] args) {

        System.out.println("to".concat("get").concat("her"));
        Concat c = new Concat();
        System.out.println(c.Concat());

    }

}
