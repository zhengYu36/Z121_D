package com.zy.designModel22;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel22</li>
 * <li>创建时间 : 2020/8/25 10:26</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 中介者模式
 *
 * @author zhengyu
 */
public class Test {

    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
