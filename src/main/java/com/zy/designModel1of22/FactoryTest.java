package com.zy.designModel1of22;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel1</li>
 * <li>创建时间 : 2020/8/21 17:15</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 多个工厂模式
 * 是对普通工厂模式的改进
 * 不通过输入字符串，而通过选择具体的
 * 产品
 *
 * @author zhengyu
 */
public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.send();
    }
}
