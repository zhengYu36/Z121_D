package com.zy.designModel21;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel21</li>
 * <li>创建时间 : 2020/8/25 10:15</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class MySubject implements Subject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
