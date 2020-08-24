package com.zy.designModel5;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel5</li>
 * <li>创建时间 : 2020/8/24 11:27</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 原形模式
 * 这个就需要了解下关于深拷贝和浅拷贝
 * 深拷贝可以通过流的方式来实现
 *
 * @author zhengyu
 */
public class Prototype implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }
}
