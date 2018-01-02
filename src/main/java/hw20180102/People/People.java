/**
 * Project Name:Wang-Haoyang
 * File Name:People.java
 * Package Name:hw20180102.People
 * Date:2018年1月2日下午9:02:40
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102.People;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午9:02:40 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */
public abstract class People {
    private String name;

    private int age;

    private char gender;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void speak();

}
