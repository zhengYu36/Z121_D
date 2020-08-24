package com.zy.designModel11;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel11</li>
 * <li>创建时间 : 2020/8/24 14:52</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class Tree {

    TreeNode root = null;

    public Tree(String name) {
        this.root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree finished");
        nodeB.getChildren().nextElement();
    }

}
