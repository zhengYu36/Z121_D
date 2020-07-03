package com.zy.demo.tree;

/**
 * <ul>
 * <li>文件包名 : com.zy.demo.tree</li>
 * <li>创建时间 : 2019/11/6 14:34</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public interface Tree {
    //find node
    Node find(int key);

    //insert node
    boolean insert(int data);

    //delete node
    boolean delete(int key);
}
