package com.zy.springsource.flow;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * <ul>
 * <li>文件包名 : com.zy.springsource.flow</li>
 * <li>创建时间 : 2020/8/21 13:58</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class ZyImp2 extends ZyImp {

    BeanDemo3 beanFactory = new BeanDemo3();

    @Override
    public BeanDemo getBeanFactory() throws IllegalStateException {
        return this.beanFactory;
    }

}
