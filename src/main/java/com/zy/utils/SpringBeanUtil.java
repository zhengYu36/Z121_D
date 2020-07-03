package com.zy.utils;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by zy on 2018/1/2.
 */
public final class SpringBeanUtil implements ApplicationContextAware {

    //获取web容器上下文
    private static ApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();

    /**
     * 违背了 Spring 依赖注入思想
     *
     * @param beanId
     * @return
     */
    public static Object getBeanByName(String beanId) throws Exception {
        if (StringUtils.isEmpty(beanId)) {
            throw new Exception("beanId is null");
        }
        return wac.getBean(beanId);

    }

    /**
     * 违背spring的ioc解耦思想。
     */
    public static <T> T getBeanByType(Class clazz) {
        if (clazz == null) {
            return null;
        }
        return (T) wac.getBean(clazz);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        wac = applicationContext;
    }
}
