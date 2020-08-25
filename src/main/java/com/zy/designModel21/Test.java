package com.zy.designModel21;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel21</li>
 * <li>创建时间 : 2020/8/25 10:16</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 访问者模式
 *
 * @author zhengyu
 */
public class Test {

    public static void main(String[] args) {
        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);

    }
}
