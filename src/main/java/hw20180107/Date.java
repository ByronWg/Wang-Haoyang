/**
 * Project Name:Wang-Haoyang
 * File Name:Date.java
 * Package Name:hw20180107
 * Date:2018年1月7日下午7:30:30
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;

import hw20180106.FileReaderDemo;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午7:30:30 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */
public class Date {
    private final static Logger LOG = Logger.getLogger(FileReaderDemo.class);

    public Date(int i, int j, int k) {

        // Auto-generated constructor stub

    }

    public static void main(String[] args) {

        Date date = new Date(2018 - 1900, 1, 6);// 导不了包
        LOG.info("今天是：" + date);
        SimpleDateFormat SDF = new SimpleDateFormat("yyyy年 MM月dd日 HH:mm:ss.SSSZ");
        String strDate = SDF.format(date);
        LOG.info("今天是：" + strDate);

    }

}
