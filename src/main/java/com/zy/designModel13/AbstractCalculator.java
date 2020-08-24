package com.zy.designModel13;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel13</li>
 * <li>创建时间 : 2020/8/24 15:18</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public abstract class AbstractCalculator {

    public int[] split(String exp, String opt) {
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
