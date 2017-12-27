/**
 * Project Name:Wang-Haoyang
 * File Name:Banana.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:05:09
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午2:05:09 <br/>
 * @author   WangHaoyang
 * @version
 * @see
 */
/**
 * 编写一个类，定义几个属性，同时给属性赋值；再定义一个无参数构造方法， 在构造方法中，首先输出各属性值到控制台，再给属性赋值；观察输出值内容。
 * Description: <br/>
 * date: 2017年12月27日 下午2:09:16 <br/>
 *
 * @author WangHaoyang
 * @version
 */
public class Orange {

    public static void main(String[] args) {

        new Orange();

    }

    String name = "橘子";

    double weight = 0.2;

    String colour = "黄";

    String introduction = "吃";

    public Orange() {
        System.out.println("这个" + name + "重量是" + weight + "kg, " + "色泽很" + colour + ", 想不想" + introduction + "?");
    }
}
