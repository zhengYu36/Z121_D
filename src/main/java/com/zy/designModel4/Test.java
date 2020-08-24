package com.zy.designModel4;

import com.zy.designModel2.Provider;
import com.zy.designModel2.SendMailFactory;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel2</li>
 * <li>创建时间 : 2020/8/21 17:33</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 建造者模式
 *
 * @author zhengyu
 */
public class Test {

    public static void main(String[] args) {

        Builder builder = new Builder();
        builder.produceMailSender(10);

    }
}
