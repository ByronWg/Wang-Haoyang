/**
 * Project Name:Wang-Haoyang
 * File Name:music.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:51:53
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:51:53 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */

/* 10.4.编写一个类，定义三个以上属性，并定义三个构造方法；再编写一个类，定义main方法，用三种方式构造前一个类的实例对象； */
public class Music {

    String name = "青鸟之歌";

    String kind = "校歌";

    String language = "中文";

    double minute = 3.4;

    public Music() {

    }

    public Music(String name, String kind, String language) {
        this.name = name;
        this.kind = kind;
        this.language = language;

    }

    public Music(String name, String kind, String language, double minute) {
        this(name, kind, language);
        this.minute = minute;
    }

}
