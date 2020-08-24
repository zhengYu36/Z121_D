package com.zy.designModel1of33;

import com.zy.designModel1of22.Sender;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel1</li>
 * <li>创建时间 : 2020/8/21 17:15</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 静态工厂方法模式，
 * 将多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
 *
 * @author zhengyu
 */
public class FactoryTest {

    public static void main(String[] args) {
        //通过静态方法直接调用
        Sender sender = SendFactory.produceMail();
        sender.send();
    }
}
