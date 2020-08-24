package com.zy.designModel3;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel3</li>
 * <li>创建时间 : 2020/8/24 11:10</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 在进来的时候就创建
 *
 * @author zhengyu
 */
public class SingletonNew {

    //防止被实例化
    private SingletonNew() {
    }

    //获取实例
    public static SingletonNew getInstance() {
        return SingletonFactory.instance;
    }

    //用一个内部类来维护
    private static class SingletonFactory {
        private static SingletonNew instance = new SingletonNew();
    }

}
