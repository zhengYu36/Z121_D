package com.zy.designModel18;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel18</li>
 * <li>创建时间 : 2020/8/24 16:56</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class MyCommand implements Commond {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
