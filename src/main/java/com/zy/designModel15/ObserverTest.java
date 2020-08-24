package com.zy.designModel15;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel15</li>
 * <li>创建时间 : 2020/8/24 16:21</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject subject = new MySubject();
        subject.add(new Observer1());
        subject.add(new Observer2());

        subject.operation();
    }
}
