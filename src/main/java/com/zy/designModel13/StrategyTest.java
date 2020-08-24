package com.zy.designModel13;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel13</li>
 * <li>创建时间 : 2020/8/24 15:22</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 策略模式
 *
 * @author zhengyu
 */
public class StrategyTest {

    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int calculates = cal.calculates(exp);
        System.out.println(calculates);
    }
}
