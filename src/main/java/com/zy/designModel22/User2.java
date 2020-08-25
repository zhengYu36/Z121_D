package com.zy.designModel22;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel22</li>
 * <li>创建时间 : 2020/8/25 10:25</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class User2 extends User {

    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe");
    }
}
