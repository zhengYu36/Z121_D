package com.zy.demo;

/**
 * <ul>
 * <li>文件包名 : com.zy.demo</li>
 * <li>创建时间 : 2019/11/6 11:39</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class RecursionDemo {

    //递归阶乘
    public static int getFactorial(int n) {
        if (n >= 0) {

            if (n == 0) {
                return 1;
            } else {
                return n * getFactorial(n - 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(-2));
    }
}
