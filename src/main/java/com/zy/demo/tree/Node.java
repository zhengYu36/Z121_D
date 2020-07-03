package com.zy.demo.tree;

/**
 * <ul>
 * <li>文件包名 : com.zy.demo.tree</li>
 * <li>创建时间 : 2019/11/6 14:31</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class Node {

    //node data
    int data;

    //left node
    Node leftNode;

    //right node
    Node rightNode;

    //delete flag ,default false
    boolean deleteFlag = false;

    public Node(int data) {
        this.data = data;
    }

    public void dispaly() {
        if (!this.deleteFlag) {
            System.out.println(data);
        }else{
            System.out.println("数据不存在,或是已被删除!");
        }
    }
}
