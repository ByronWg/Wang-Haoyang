/**
 * Project Name:Wang-Haoyang
 * File Name:MyPet.java
 * Package Name:MyPet
 * Date:2017年12月24日下午4:19:28
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package MyPet;

/**
 * Description: <br/>
 * Date: 2017年12月24日 下午4:19:28 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */
public class MyPet {
    private String name;

    private String ability;

    private double length;

    public void setName(String n) {
        name = n;
    }

    public void setAbility(String a) {
        ability = a;
    }

    public void setLength(double l) {
        length = l;
    }

    public void speak() {
        System.out.println("我的宠物龙叫" + name + "," + "能力是" + ability + "," + "长度" + length);
    }

}
