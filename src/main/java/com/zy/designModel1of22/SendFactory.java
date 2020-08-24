package com.zy.designModel1of22;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel1</li>
 * <li>创建时间 : 2020/8/21 17:13</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class SendFactory {

    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
