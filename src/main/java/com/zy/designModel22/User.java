package com.zy.designModel22;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel22</li>
 * <li>创建时间 : 2020/8/25 10:21</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public abstract class User {

    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
