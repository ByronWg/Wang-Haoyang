/**
 * Project Name:Wang-Haoyang
 * File Name:TestAnimal.java
 * Package Name:hw20180102.Animal
 * Date:2018年1月2日下午8:29:27
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102.Animal;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午8:29:27 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */
public class TestAnimal {
    public static void main(String[] args) {

        Animal a = new Dog();
        a.eat();
        if (!(a instanceof Dog)) {
            System.out.println("类型不匹配，不能转换");
            return;
        }
        Dog d = (Dog) a;
        d.lookHome();
    }
}
