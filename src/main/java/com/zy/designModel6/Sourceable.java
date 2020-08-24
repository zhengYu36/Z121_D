package com.zy.designModel6;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel6</li>
 * <li>创建时间 : 2020/8/24 13:57</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 关于接口适配器模式
 * 很多时候一个接口的方法我们只需要实现几个，不需要全部实现
 * 所以我们首先通过一个抽象类，然后在继承它的方式
 *
 * @author zhengyu
 */
public interface Sourceable {

    public void method1();
    public void method2();

}
