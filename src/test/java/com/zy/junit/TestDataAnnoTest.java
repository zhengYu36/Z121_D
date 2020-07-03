package com.zy.junit;

import com.zy.demo.TestDataAnno;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * <ul>
 * <li>文件包名 : com.zy.junit</li>
 * <li>创建时间 : 2019/10/25 14:51</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class TestDataAnnoTest {

    @Test
    public void getSet(){
        TestDataAnno testDataAnno = new TestDataAnno();

        String name = testDataAnno.getName();
        System.out.println(name);

    }
}