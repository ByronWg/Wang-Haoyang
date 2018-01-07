/**
 * Project Name:Wang-Haoyang
 * File Name:Copy.java
 * Package Name:hw20180107
 * Date:2018年1月7日下午7:24:03
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

/**
 * Description:   <br/>
 * Date:     2018年1月7日 下午7:24:03 <br/>
 * @author   WangHaoyang
 * @version
 * @see
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

    public static void main(String[] args) throws IOException {
        String src_file = "D:/java/java.doc";
        String des_file = "D:/java/java_copy.doc";

        copyFile(src_file, des_file);

        System.out.println("OK!");
    }

    public static void copyFile(String src, String des) throws IOException {
        BufferedInputStream inBuff = null;
        BufferedOutputStream outBuff = null;

        try {
            // 新建文件输入流并对它进行缓冲
            inBuff = new BufferedInputStream(new FileInputStream(src));

            // 新建文件输出流并对它进行缓冲
            outBuff = new BufferedOutputStream(new FileOutputStream(des));

            // 缓冲数组
            byte[] b = new byte[1024 * 5];
            int len;
            while ((len = inBuff.read(b)) != -1) {
                outBuff.write(b, 0, len);
            }
            // 刷新此缓冲的输出流
            outBuff.flush();
        } finally {
            // 关闭流
            if (inBuff != null)
                inBuff.close();
            if (outBuff != null)
                outBuff.close();
        }

    }
}
