/**
 * Project Name:Wang-Haoyang
 * File Name:Equals.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午2:22:16
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;
/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午2:22:16 <br/>
 * @author   WangHaoyang
 * @version
 * @see
 */

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * equals public boolean equals(Object anObject)将此字符串与指定的对象比较。 当且仅当该参数不为
 * null，并且是与此对象表示相同字符序列的 String 对象时，结果才为 true。
 * 
 * 覆盖： 类 Object 中的 equals 参数： anObject - 与此 String 进行比较的对象。 返回： 如果给定对象表示的 String
 * 与此 String 相等，则返回 true；否则返回 false。 另请参见： compareTo(String),
 * equalsIgnoreCase(String)
 */
public class Equals {
    private final static Logger LOG = Logger.getLogger(Equals.class);

    public static void main(String[] args) {
        String a = "人生几何A";
        Scanner scanner = new Scanner(System.in);
        LOG.info("请输入数据:");
        String b = scanner.next();
        if (a.equals(b)) {
            LOG.info(true);
        } else {
            LOG.info(false);
        }

    }

}
