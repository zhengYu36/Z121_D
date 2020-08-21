package com.zy.springsource.flow;

/**
 * <ul>
 * <li>文件包名 : com.zy.springsource.flow</li>
 * <li>创建时间 : 2020/8/21 11:42</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class BeanDemo2 implements BeanDemo {
    @Override
    public String getBean() {
        System.out.println("BeanDmo2");
        return "Demo2";
    }
}
