import java.util.Scanner;

/**
 * Project Name:Wang-Haoyang
 * File Name:Vip.java
 * Package Name:
 * Date:2017年12月25日下午5:39:28
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午5:39:28 <br/>
 * 
 * @author WangHaoyang
 * @version
 * @param <dollar>
 * @see
 */
public class Vip<dollar> {
    public static void main(String[] args) {
        Vip v = new Vip();
        v.money();
    }// 建立新vip，调用做好的方法

    double money() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输出您的消费金额：");
        int dollar = scanner.nextInt();
        System.out.println("1.至尊级\n2.钻石级\n3.铂金级\n4.黄金级\n5.白银级");
        System.out.println("请输入您的会员等级：");
        int i = scanner.nextInt();// 金额、等级分别输出出来，再调用switch函数
        switch (i) {

        case 1:
            System.out.println(dollar * 0.75);
            break;
        case 2:
            System.out.println(dollar * 0.8);
            break;
        case 3:
            System.out.println(dollar * 0.85);
            break;
        case 4:
            System.out.println(dollar * 0.9);
            break;
        case 5:
            System.out.println(dollar * 0.95);
            break;

        }
        return i;// 返回求出的值

    }
}// finish。。。