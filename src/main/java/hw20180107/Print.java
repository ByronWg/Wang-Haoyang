/**
 * Project Name:Wang-Haoyang
 * File Name:Print.java
 * Package Name:hw20180107
 * Date:2018年1月7日下午7:21:33
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import hw20180106.FileReaderDemo;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午7:21:33 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */
public class Print {
    private final static Logger LOG = Logger.getLogger(FileReaderDemo.class);

    public static void main(String[] args) {
        // 目录
        File dataDir = new File("E:/资源库资源/20091111");
        // 存放目录及其子目录下的所有文件对象
        List<File> myfile = new ArrayList<File>();
        // 开始遍历
        listDirectory(dataDir, myfile);

        System.out.println("目录下包含 " + myfile.size() + "个文件：");
        for (File file : myfile) {
            LOG.info(file.getAbsolutePath());
        }
    }

    /**
     * 遍历目录及其子目录下的所有文件并保存
     * 
     * @param path 目录全路径
     * @param myfile 列表：保存文件对象
     */
    public static void listDirectory(File path, List<File> myfile) {
        if (!path.exists()) {
            LOG.info("文件名称不存在!");
        } else {
            if (path.isFile()) {
                myfile.add(path);
            } else {
                File[] files = path.listFiles();
                for (int i = 0; i < files.length; i++) {
                    listDirectory(files[i], myfile);
                }
            }
        }
    }

}
