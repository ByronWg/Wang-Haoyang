/**
 * Project Name:Wang-Haoyang
 * File Name:ToString.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午3:51:43
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午3:51:43 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */
public class ToString {

    public static class A

    {

        public String getString()

        {

            return "this is A";

        }

    }

    public static void main(String[] args)

    {

        A obj = new A();

        System.out.println(obj);

        System.out.println(obj.getString());

    }// 没弄懂toString的作用

}
