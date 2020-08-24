package com.zy.designModel6;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel6</li>
 * <li>创建时间 : 2020/8/24 14:00</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：  接口适配器测试
 *
 * @author zhengyu
 */
public class WrapperTest {

    public static void main(String[] args) {
        Sourceable sub1 = new SourceSub1();
        sub1.method1();
        sub1.method2();
    }
}
