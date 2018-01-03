/**
 * Project Name:Wang-Haoyang
 * File Name:NullPointerExceptionTest.java
 * Package Name:hw20170103.NullPointerException
 * Date:2018年1月3日下午2:51:09
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103.NullPointerException;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午2:51:09 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */

public class NullPointerExceptionTest {
    private final static Logger LOG = Logger.getLogger(NullPointerExceptionTest.class);

    /**
     * 实现思路： 1.空指针异常的表现之一：对空的字符串进行了操作 2.设置一个空的字符串，然后对其进行查找操作（可以使用charAt()方法）
     * 3.对将要出现的异常进行捕获 4.打印到控制台
     */
    public static void main(String[] args) {

        // 定义一个空的字符串
        String str = null;

        // 尝试对空字符串进行操作，并捕获异常，输出异常
        try {
            System.out.println(str.charAt(0));
        } catch (Exception e) {

            LOG.info("异常信息:");

            e.printStackTrace();
        }
    }

}
