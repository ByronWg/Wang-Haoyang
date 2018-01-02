/**
 * Project Name:Wang-Haoyang
 * File Name:Goose.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午5:21:36
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102.Pet;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午5:21:36 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */
public class Goose extends Pet {

    @Override
    public void play() {
        super.setHealth(super.getHealth() - 10);
        super.setLove(super.getLove() + 5);

    }

}
