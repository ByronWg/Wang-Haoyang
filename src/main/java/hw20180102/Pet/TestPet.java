/**
 * Project Name:Wang-Haoyang
 * File Name:TestPet.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午5:31:44
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102.Pet;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午5:31:44 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */
public class TestPet {

    public static void main(String[] args) {

        Pet pet1 = new Pig();
        Pet pet2 = new Goose();
        pet1.play();
        pet2.play();
        System.out.println("猪的健康值：" + pet1.getHealth() + "\t与猪的亲密度：" + pet1.getLove());

        System.out.println("鹅的健康值：" + pet2.getHealth() + "\t与猪的亲密度：" + pet2.getLove());

    }
}