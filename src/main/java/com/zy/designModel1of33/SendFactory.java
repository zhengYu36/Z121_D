package com.zy.designModel1of33;

import com.zy.designModel1of22.MailSender;
import com.zy.designModel1of22.Sender;
import com.zy.designModel1of22.SmsSender;

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

    public static com.zy.designModel1of22.Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
