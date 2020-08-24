package com.zy.designModel13;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel13</li>
 * <li>创建时间 : 2020/8/24 15:19</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class Plus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculates(String exp) {
        int arrayInt[] = split(exp, "\\+");
        return arrayInt[0] + arrayInt[1];
    }
}
