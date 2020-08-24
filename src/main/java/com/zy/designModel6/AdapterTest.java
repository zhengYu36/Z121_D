package com.zy.designModel6;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel6</li>
 * <li>创建时间 : 2020/8/24 11:42</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 关于适配器模式
 * 有对象适配  方法适配  接口适配
 *
 * @author zhengyu
 */
public class AdapterTest {

    public static void main(String[] args) {
        //类适配
       /* Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();*/

       //对象适配
        Sources sources = new Sources();
        Targetable targetable = new Wrapper(sources);
        targetable.method1();
        targetable.method2();
    }
}
