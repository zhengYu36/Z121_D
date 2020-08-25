package com.zy.designModel22;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel22</li>
 * <li>创建时间 : 2020/8/25 10:24</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class User1 extends User {

    public User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe");
    }
}
