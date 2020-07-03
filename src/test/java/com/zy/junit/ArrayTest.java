package com.zy.junit;

import com.zy.demo.tree.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * <ul>
 * <li>文件包名 : com.zy.junit</li>
 * <li>创建时间 : 2019/11/1 17:05</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class ArrayTest {

    //进行字符反转
    @Test
    public void test1() {
        List<Node> list = new ArrayList<Node>() {
            {
                add(new Node(12));
                add(new Node(22));
                add(new Node(44));
            }
        };

    }
}
