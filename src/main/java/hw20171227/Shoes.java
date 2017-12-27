/**
 * Project Name:Wang-Haoyang
 * File Name:Shoes.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午4:07:17
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午4:07:17 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */
// 10.6.编写一个类，定义两个属性，其中一个属性前添加static关键字；再定义两个方法
// ，其中一个方法前添加static关键字；再编写一个类，定义main方法，在main方法中，
// 分别输出前一个类的两个属性，以及调用两个方法；注意观察不同处，并写上注释
public class Shoes {
    String brand;

    static String model;

    static int size;

    public String showShoes() {

        return "厂商" + brand + "样式为：" + model + ",大小为： " + size + "码";// 也可以同时返回定义为
        // static的属性

    }

    public static String seeShoes() {
        return "样式为：" + model + ",大小为： " + size + "码";// static中的return不能返回非satitic的属性

    }

    public static void main(String[] args) {
        Shoes s = new Shoes();
        s.brand = "Nike";
        Shoes.model = "sportShoes";// static的属性可以用"shoes."赋值
        Shoes.size = 42;
        System.out.println("厂商为： " + s.brand + "，样式为：" + Shoes.model + ",大小为： " + Shoes.size + "码");
        System.out.println(seeShoes());// 可以直接调用static的方法

    }
}
