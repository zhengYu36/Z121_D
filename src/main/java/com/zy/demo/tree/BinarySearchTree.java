package com.zy.demo.tree;

/**
 * <ul>
 * <li>文件包名 : com.zy.demo.tree</li>
 * <li>创建时间 : 2019/11/6 14:36</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class BinarySearchTree implements Tree {

    //表示根节点
    private Node root;

    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();
        bt.insert(50);
        bt.insert(20);
        bt.insert(80);
        bt.insert(10);
        bt.insert(30);
        bt.find(20).dispaly();
        bt.find(22).dispaly();
        bt.find(10).dispaly();
        //删除一下
        bt.delete(80);
        bt.find(80).dispaly();
        bt.find(10).dispaly();
    }

    @Override
    public Node find(int key) {
        Node current = root;
        while (current != null) {
            if (current.data > key) { //search left
                current = current.leftNode;
            } else if (current.data < key) { //search right
                current = current.rightNode;
            } else { // return oneself
                return current;
            }
        }
        // no search tree data
        return null;
    }

    //插入树
    @Override
    public boolean insert(int data) {
        Node node = new Node(data);
        if (root == null) {
            root = node;
            return true;
        } else {
            Node current = root;
            Node parentNode = null;
            while (current != null) {
                parentNode = current;
                if (current.data > data) {
                    current = current.leftNode;
                    if (current == null) {
                        parentNode.leftNode = node;
                        return true;
                    }
                } else {
                    current = current.rightNode;
                    if (current == null) {
                        parentNode.rightNode = node;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //这里删除采用的是假删除,目前这样来看就最方便了
    @Override
    public boolean delete(int key) {
        Node node = find(key);
        if (node != null) {
            //不为空,则删除数据
            node.deleteFlag = true;
            return true;
        }
        return false;
    }
}
