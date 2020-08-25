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
public class Test {

    public static void main(String[] args) {
        //计算 9+ 2-8
        int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9,2)),8)));
        System.out.println(result);
    }
}
