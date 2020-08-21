package com.zy.springsource.flow;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * <ul>
 * <li>文件包名 : com.zy.springsource.flow</li>
 * <li>创建时间 : 2020/8/21 11:45</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public abstract class ZyImp implements ZyBemo{

    //获取factory
    public abstract BeanDemo getBeanFactory() throws IllegalStateException;

    //获取信息哈
    public Object getBeanInfo(String name) throws BeansException {
        return getBeanFactory().getBean();
    }

    @Override
    public String getBean() {
        return getBeanFactory().getBean();
    }
}
