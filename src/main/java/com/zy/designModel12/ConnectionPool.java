package com.zy.designModel12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel12</li>
 * <li>创建时间 : 2020/8/24 15:00</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 享元模式
 *
 * 表示出来其实大部分就是线程池的技术
 *
 * @author zhengyu
 */
public class ConnectionPool {

    private static ConnectionPool instance = null;
    Connection conn = null;
    private Vector<Connection> pool;
    //公有属性
    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "root";
    private String driverClassName = "com.mysql.jdbc.Driver";
    private int poolSize = 100;

    //做一些初始工作
    private ConnectionPool() {

        pool = new Vector<>(poolSize);

        for (int i = 0; i < poolSize; i++) {
            try {
                Class.forName(driverClassName);
                conn = DriverManager.getConnection(url, username, password);
                pool.add(conn);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    //返回链接到连接池
    public synchronized void release() {
        pool.add(conn);
    }

    //返回连接池中的一个链接
    public synchronized Connection getConnection() {

        if(pool.size() > 0){
            Connection conn = pool.get(0);
            pool.remove(conn);
            return  conn;
        }else {
            return null;
        }
    }

}
