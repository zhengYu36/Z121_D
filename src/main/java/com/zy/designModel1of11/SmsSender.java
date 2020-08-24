package com.zy.designModel1of11;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel1</li>
 * <li>创建时间 : 2020/8/21 17:12</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender");
    }
}
