package com.zy.designModel17;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel17</li>
 * <li>创建时间 : 2020/8/24 16:54</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class Test {

    public static void main(String[] args) {

        MyHandler h1 = new MyHandler("h1");
        MyHandler h2 = new MyHandler("h2");
        MyHandler h3 = new MyHandler("h3");

        h1.setHandler(h2);
        h2.setHandler(h3);

        h1.operator();
    }
}
