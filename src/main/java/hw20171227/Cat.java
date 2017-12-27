/**
 * Project Name:Wang-Haoyang
 * File Name:Cat.java
 * Package Name:pet
 * Date:2017年12月26日上午11:58:39
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月26日 上午11:58:39 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */

// 10.5.编写一个类，定义几个属性，每个属性前添加private修饰符；为每个属性，添加g
// et/set方法，方法前添加public修饰符；再编写一个类，定义main方法，在main方法中，
// 构造前一个类的实例对象，并调用实例对象的set方法，设置对应数据值；最后调用get方法，输出对应属性值到控制台。
public class Cat {
    private String name = "花花";

    private int health = 100;

    private int love = 0;

    private String strain = "巴菲猫";

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public int getLove() {
        return love;
    }

    public String getStrain() {
        return strain;
    }

    public String setName(String name) {
        if (equals(name)) {
            System.out.println(name);
        }
        return name;
    }

    public String setstrain(String strain) {
        if (equals(strain)) {
            System.out.println(strain);
        }
        return name;
    }

    public void setLove(int love) {
        if (love > 100 || love < 0) {
            this.love = 40;
            System.out.println("亲密度应该再0-100之间，默认值是40");
        } else
            this.love = love;
    }

    public void setHealth(int health) {
        if (health > 100 || health < 0) {
            this.health = 40;
            System.out.println("健康值应该再0-100之间，默认值是40");
        } else
            this.health = health;

    }
}
