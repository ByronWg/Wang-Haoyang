/**
 * Project Name:Wang-Haoyang
 * File Name:Testpeope.java
 * Package Name:hw20180102.People
 * Date:2018年1月2日下午9:03:00
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102.People;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午9:03:00 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */
public class Testpeope {

    public static void main(String[] args) {
        People p1 = new MrJack();
        p1.setName("Jack");
        p1.setGender('M');
        p1.setAge(16);
        System.out.print("\t人物介绍" + "\n名字" + p1.getName() + "\n性别" + p1.getGender() + "\n年龄" + p1.getAge() + "\n今日留言:");
        p1.speak();

        MrJack MJ = (MrJack) p1;
        MJ.Swimming();
        System.out.println("\n");

        People p2 = new MissJanny();
        p2.setName("Janny");
        p2.setGender('F');
        p2.setAge(66);
        System.out.print("\t人物介绍" + "\n名字" + p2.getName() + "\n性别" + p2.getGender() + "\n年龄" + p2.getAge() + "\n今日留言:");
        p2.speak();

        MissJanny SJ = (MissJanny) p2;
        SJ.fishing();

    }

}
