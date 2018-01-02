/**
 * Project Name:Wang-Haoyang
 * File Name:Dog.java
 * Package Name:hw20180102.Animal
 * Date:2018年1月2日下午8:22:46
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102.Animal;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午8:22:46 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */
class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("啃骨头");
    }

    void lookHome() {
        System.out.println("看家");
    }
}
