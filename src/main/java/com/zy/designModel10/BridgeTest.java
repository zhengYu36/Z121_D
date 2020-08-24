package com.zy.designModel10;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel10</li>
 * <li>创建时间 : 2020/8/24 14:42</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 桥接模式
 *
 * @author zhengyu
 */
public class BridgeTest {

    public static void main(String[] args) {
        Bridge bridge = new MyBridge();

        //调用第一个对象
        Sourceable sub1 = new SourceSub1();
        bridge.setSourceable(sub1);
        bridge.method();

        //调用第二个对象
        Sourceable sub2 = new SourceSub2();
        bridge.setSourceable(sub2);
        bridge.method();
    }
}
