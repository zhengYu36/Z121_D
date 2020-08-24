package com.zy.designModel7;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel7</li>
 * <li>创建时间 : 2020/8/24 14:08</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 装饰器类
 *
 * @author zhengyu
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Sourceable sourceable = new Source();
        Sourceable obj = new Decorator(sourceable);
        obj.method();
    }
}
