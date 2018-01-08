/**
 * Project Name:Wang-Haoyang
 * File Name:TheadMode.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午7:47:05
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午7:47:05 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */
public class ThreadMode {

    public static void main(String[] args) {

        SubThread st = new SubThread();
        Thread thread = new Thread(st);

        SubThread st1 = new SubThread();
        st.start();
        thread.setPriority(Thread.MIN_PRIORITY);
        st1.start();

        for (int i = 0; i < 50; i++) {
            System.out.println("main..." + i);
        }
    }
}
