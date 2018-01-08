/**
 * Project Name:Wang-Haoyang
 * File Name:Thread.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午7:40:13
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午7:40:13 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */

public class SubThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("run..." + i);
        }
    }
}
