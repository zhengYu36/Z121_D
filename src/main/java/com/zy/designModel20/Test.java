package com.zy.designModel20;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel20</li>
 * <li>创建时间 : 2020/8/25 10:05</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 状态模式
 *
 * @author zhengyu
 */
public class Test {

    public static void main(String[] args) {

        State state = new State();
        Context context = new Context(state);

        //设置第一种状态
        state.setValue("state1");
        context.method();

        //设置第二种状态
        state.setValue("state2");
        context.method();
    }
}
