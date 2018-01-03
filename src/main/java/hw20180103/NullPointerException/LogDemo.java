/**
 * Project Name:Wang-Haoyang
 * File Name:LogDemo.java
 * Package Name:hw20170103.NullPointerException
 * Date:2018年1月3日下午3:29:57
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103.NullPointerException;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:29:57 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */
public class LogDemo {
    private final static Logger LOG = Logger.getLogger(LogDemo.class);

    public static void main(String[] args) {
        LOG.info("fff");
    }
}
