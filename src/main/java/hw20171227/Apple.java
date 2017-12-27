/**
 * Project Name:Wang-Haoyang
 * File Name:Apple.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:23:40
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:23:40 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */

// 10.3.编写一个类，定义几个属性，再定义一个带参构造方法，（参数包括所有属性）；再定义一个类，定义main方法，构造前一个类的实例对象，输出其属性值；
public class Apple {
    String name = "苹果";

    char size = '大';

    String colour = "鲜红";

    public Apple() {

    }

    public Apple(String name, char size, String colour) {
        this.name = name;
        this.size = size;
        this.colour = colour;

    }

}
