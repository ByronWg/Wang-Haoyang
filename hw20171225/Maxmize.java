import java.util.Scanner;

/**
 * Project Name:Wang-Haoyang
 * File Name:Maxmize.java
 * Package Name:
 * Date:2017年12月25日下午5:25:27
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午5:25:27 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @see
 */
public class Maxmize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int b = scanner.nextInt();

        Maxmize mx = new Maxmize();
        System.out.println(mx.max(a, b));

    }

    int max(int a, int b) {
        if (a > b) {

            return a;
        } else {

            return b;
        }

    }

}