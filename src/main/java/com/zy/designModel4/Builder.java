package com.zy.designModel4;

import java.util.ArrayList;
import java.util.List;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel4</li>
 * <li>创建时间 : 2020/8/24 11:20</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class Builder {

    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }
}
