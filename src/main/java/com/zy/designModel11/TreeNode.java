package com.zy.designModel11;

import java.util.Enumeration;
import java.util.Vector;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel11</li>
 * <li>创建时间 : 2020/8/24 14:48</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class TreeNode {

    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<>();

    public TreeNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    //添加孩子
    public void add(TreeNode node){
        children.add(node);
    }

    //删除孩子节点
    public void remove(TreeNode node){
        children.remove(node);
    }

    //获取孩子节点
    public Enumeration<TreeNode> getChildren(){
        return children.elements();
    }
}
