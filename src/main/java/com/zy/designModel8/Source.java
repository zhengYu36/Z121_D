package com.zy.designModel8;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel8</li>
 * <li>创建时间 : 2020/8/24 14:12</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("this original method!");
    }
}
