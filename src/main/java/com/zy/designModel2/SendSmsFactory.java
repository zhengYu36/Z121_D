package com.zy.designModel2;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel2</li>
 * <li>创建时间 : 2020/8/21 17:32</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class SendSmsFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }

}
