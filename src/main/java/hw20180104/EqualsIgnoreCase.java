/**
 * Project Name:Wang-Haoyang
 * File Name:EqualsIgnoreCase.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午2:38:19
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午2:38:19 <br/>
 * @author   WangHaoyang
 * @version
 * @see
 */
/**
 * equalsIgnoreCase public boolean equalsIgnoreCase(String anotherString)将此
 * String 与另一个 String 比较， 不考虑大小写。如果两个字符串的长度相同，并且其中的相应字符都相等（忽略大小写），
 * 则认为这两个字符串是相等的。 在忽略大小写的情况下，如果下列至少一项为 true，则认为 c1 和 c2 这两个字符相同。
 * 
 * 这两个字符相同（使用 == 运算符进行比较）。 对每个字符应用方法 Character.toUpperCase(char) 生成相同的结果。
 * 对每个字符应用方法 Character.toLowerCase(char) 生成相同的结果。
 * 
 * 参数： anotherString - 与此 String 进行比较的 String。 返回： 如果参数不为 null，且这两个 String
 * 相等（忽略大小写），则返回 true；否则返回 false。 另请参见： equals(Object)
 */
public class EqualsIgnoreCase {
    private final static Logger LOG = Logger.getLogger(Equals.class);

    public static void main(String[] args) {
        String a = "asdfghjkl";
        String b = new String("Asdfghjkl");
        if (a.equalsIgnoreCase(b)) {
            LOG.info(a + b);
        }

    }

}
