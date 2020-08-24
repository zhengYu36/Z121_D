package com.zy.designModel1of11;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel1</li>
 * <li>创建时间 : 2020/8/21 17:15</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 工厂模式
 *
 * @author zhengyu
 */
public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.send();
    }
}
