package com.zy.designModel23;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel23</li>
 * <li>创建时间 : 2020/8/25 10:30</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class Plus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1() +context.getNum2();
    }
}
