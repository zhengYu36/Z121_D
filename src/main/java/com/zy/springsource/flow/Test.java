package com.zy.springsource.flow;

/**
 * <ul>
 * <li>文件包名 : com.zy.springsource.flow</li>
 * <li>创建时间 : 2020/8/21 11:43</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 测试主类
 *
 * @author zhengyu
 */
public class Test {

    public static void main(String[] args) {

        //其实这个还是有设计模式的影子，突然觉得设计模式还是需要很重点的学习和了解哈
        //这里我最终访问到的就是BeanDemo3
        ZyImp2 zyImp2 = new ZyImp2();
        zyImp2.getBean();
        System.out.println("测试结束");

    }

}
