package com.zy.designModel6;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel6</li>
 * <li>创建时间 : 2020/8/24 11:41</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class Adapter extends Sources implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method2");
    }
}
