package com.zy.designModel17;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel17</li>
 * <li>创建时间 : 2020/8/24 16:50</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
