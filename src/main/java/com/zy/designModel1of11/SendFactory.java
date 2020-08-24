package com.zy.designModel1of11;

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

    public Sender produce(String type){
        Sender sender = null;
        if("mail".equals(type)){
            sender =  new MailSender();
        }else if("sms".equals(type)){
            sender = new SmsSender();
        }

        return sender;
    }
}
