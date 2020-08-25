package com.zy.demo;


import com.mysql.jdbc.StringUtils;

import java.io.*;

/**
 * <ul>
 * <li>文件包名 : com.zy.demo</li>
 * <li>创建时间 : 2020/8/25 11:13</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： volatile 和 关于对象锁 类锁， 方法锁的区别和使用
 *
 * @author zhengyu
 */
public class VolatileDemo {

    //创建一个共享变量
    private static volatile boolean flag = true;
    private static Object obj = new Object();

    public static void main(String[] args) throws Exception {

        new Thread(()->{
            while (flag){
                synchronized (obj){

                }
            }
        }).start();

        Thread.sleep(3000);

        new Thread(()->{
            flag = false;
            System.out.println("线程修改了变量， flag 为 false");
        }).start();


    }
}
