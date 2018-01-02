/**
 * Project Name:Wang-Haoyang
 * File Name:Pig.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午5:25:08
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102.Pet;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午5:25:08 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */
public class Pig extends Pet {

    @Override
    public void play() {
        this.setHealth(getHealth() - 5);
        this.setLove(getLove() + 5);
    }
}
