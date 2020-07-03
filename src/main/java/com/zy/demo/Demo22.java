package com.zy.demo;


import com.zy.entity.User;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <ul>
 * <li>文件包名 : com.demo</li>
 * <li>创建时间 : 2020/4/20 11:19</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */


public class Demo22 {
    public static void main(String[] args)throws Exception {
        List<User> list = Arrays.asList(
                // name，age
                new User("张三", 11),
                new User("王五", 20),
                new User("王五", 91),
                new User("张三", 8),
                new User("李四", 44),
                new User("李四", 44),
                new User("李四", 44)
        );



        List<String> strlist = Arrays.asList("java", "springboot", "HTML5","nodejs","CSS3");
        Map<Boolean, List<String>> result = strlist.stream().collect(Collectors.partitioningBy(s->s.length()>4));
        System.out.println(result);


        Object a = 12;
        Object tt = "123";

    }
}
