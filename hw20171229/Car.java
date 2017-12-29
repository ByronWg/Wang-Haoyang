/**
 * Project Name:Wang-Haoyang
 * File Name:Car.java
 * Package Name:hw20171229
 * Date:2017年12月29日下午8:02:13
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171229;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午8:02:13 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */
// 1)在hw20171228类包中，编写一个车的抽象类，先定义车的简介方法summary()，
// 输出车的概要信息，再自由定义两个属性、两个方法；定义一个小汽车的类和大卡车的类，
// 要求：a）继承车的抽象类,b）分别定义一个以上的属性和方法
public class Car {
    public String brand;

    private String price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void summary() {
        System.out.println(brand + "无敌拉风炫酷屌炸天的车");

    }

    public void show() {
        System.out.println(brand + price);
    }

    public void brand() {
        brand = "牛批牌";
        System.out.println(brand);
    }

}
