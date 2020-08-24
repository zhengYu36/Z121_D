package com.zy.designModel7;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel7</li>
 * <li>创建时间 : 2020/8/24 14:06</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source) {
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before Decorator");
        source.method();
        System.out.println("after Decorator");
    }
}
