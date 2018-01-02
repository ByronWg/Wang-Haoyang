/**
 * Project Name:Wang-Haoyang
 * File Name:Animal.java
 * Package Name:hw20171229.huxury
 * Date:2017年12月29日下午8:47:34
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171229.huxury;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午8:47:34 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */
public class Animal {
    private String species;

    private String name;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("这种动物属于" + species + "名字叫" + name);
    }

}
