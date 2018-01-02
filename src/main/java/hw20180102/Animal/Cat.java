/**
 * Project Name:Wang-Haoyang
 * File Name:Cat.java
 * Package Name:hw20180102.Animal
 * Date:2018年1月2日下午8:26:03
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102.Animal;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午8:26:03 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */
class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("吃鱼");
    }

    void catchMouse() {
        System.out.println("抓老鼠");
    }
}
