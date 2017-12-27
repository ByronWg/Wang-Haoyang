/**
 * Project Name:Wang-Haoyang
 * File Name:TypeDefaultVaule.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午1:13:42
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午1:13:42 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */
public class TypeDefaultVaule {
    /**
     * 经运行，默认值为： byte: 0 short: 0 int: 0 long: 0 float: 0.0 double: 0.0 char:
     */
    byte by;

    short s;

    int i;

    long l;

    float f;

    double d;

    char c;

    boolean b;

    String str;

    int[] arr;

    public String showValue() {

        return "byte: " + by + "\nshort: " + s + "\nint: " + i + "\nlong: " + l + "\nfloat: " + f + "\ndouble: " + d
                + "\nchar: " + c + "\nboolean: " + b + "\nString: " + str + "\nInt[]: " + arr;
    }

}
