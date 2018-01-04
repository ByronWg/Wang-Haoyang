/**
 * Project Name:Wang-Haoyang
 * File Name:List_Map.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午4:07:19
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午4:07:19 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */
public class List_Map {
    private final static Logger LOG = Logger.getLogger(List_Map.class);

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("对酒当歌");
        list.add("人生几何");
        list.add("譬如朝露");
        list.add("去日苦多");
        int size = list.size();
        LOG.info(size);
        list.add(0, "短歌行");
        LOG.info(list);
        size = list.size();
        LOG.info(size);
        LOG.info(list.get(2));
        list.remove(2);
        LOG.info(list);

        Map map = new HashMap();
        map.put("一", "蒹葭苍苍");
        map.put("二", "白露为霜");
        map.put("三", "所谓伊人");
        map.put("四", "在水一方");
        LOG.info("map的长度：" + map.size());

        Iterator ite = map.values().iterator();
        while (ite.hasNext()) {
            LOG.info(ite.next());
        }

    }

}
