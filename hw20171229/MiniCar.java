/**
 * Project Name:Wang-Haoyang
 * File Name:MiniCar.java
 * Package Name:hw20171229
 * Date:2017年12月29日下午8:18:59
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171229;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午8:18:59 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */
public class MiniCar extends Car {
    String colour;

    public String colour() {
        System.out.println("颜色为：" + colour);
        return colour;
    }

    public void intro() {
        brand();
        colour();

    }

}
