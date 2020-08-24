package com.zy.designModel2;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel2</li>
 * <li>创建时间 : 2020/8/21 17:33</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 抽象工厂模式
 *
 * @author zhengyu
 */
public class Test {

    public static void main(String[] args) {

        Provider provider = new SendMailFactory();
        Sender produce = provider.produce();
        produce.send();
    }
}
