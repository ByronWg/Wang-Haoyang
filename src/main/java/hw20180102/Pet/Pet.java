/**
 * Project Name:Wang-Haoyang
 * File Name:Pet.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午5:04:05
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102.Pet;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午5:04:05 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */
public abstract class Pet {
    private int health = 100;

    private int love = 0;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public abstract void play();

}
