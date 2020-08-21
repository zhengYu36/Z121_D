package com.zy.test;

import com.zy.demo.Demo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <ul>
 * <li>文件包名 : com.zy.test</li>
 * <li>创建时间 : 2020/8/21 10:25</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 关于spring源码 如何去寻找的方式，在这个堆栈里面
 * 这个方式我有需要去多了解一下哈，感觉很不错
 * <p>
 * 现在具体的走向流程我大体明白了，在  日记 "(重)关于spring源码该如何分析" 中，可以去看一下
 *
 * @author zhengyu
 */
public class SpringSource {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Demo.class);

        Demo person = (Demo) context.getBean("demo");

        System.out.println(person);

    }

}
