package com.zy.designModel10;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel10</li>
 * <li>创建时间 : 2020/8/24 14:41</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class MyBridge extends Bridge {

    @Override
    public void method() {
        getSourceable().method();
    }
}
