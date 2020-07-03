package com.zy.demo;

/**
 * <ul>
 * <li>文件包名 : com.zy.demo</li>
 * <li>创建时间 : 2019/11/5 10:46</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class QueueDemo {

    private Object[] queArray;
    //队列总大小
    private int maxSize;
    //前端
    private int front;
    //后端
    private int rear;
    //队列中的实际数量
    private int nItems;

    public QueueDemo(int size) {
        this.queArray = new Object[size];
        this.maxSize = size;
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public static void main(String[] args) {
        QueueDemo queueDemo = new QueueDemo(5);
        queueDemo.insert(3);
        queueDemo.insert(2);
        queueDemo.insert(5);
        System.out.println(queueDemo.peekFront());
        while (!queueDemo.isEmpty()) {
            System.out.println(queueDemo.remove());
        }
        System.out.println(queueDemo.isEmpty());
    }

    //队列新增数据
    public void insert(int value) {
        if (isFull()) {
            System.out.println("队列已满!!!");
        } else {
            //如果队列到了尾部,则重新指向前面
            if (rear == maxSize - 1) {
                rear = -1;
            }

            queArray[++rear] = value;
            nItems++;
        }
    }

    //删除数据
    public Object remove() {
        Object obj = null;
        if (isEmpty()) {
            System.out.println("队列为空!!!");
        } else {
            obj = queArray[front];
            queArray[front] = null;
            front++;
            if (front == maxSize) {
                front = 0;
            }
            nItems--;
        }

        return obj;
    }

    //队列是否满了
    public boolean isFull() {
        return (nItems == maxSize);
    }

    //队列是否为空
    public boolean isEmpty() {
        return (nItems == 0);
    }

    //查看队头数据
    public Object peekFront() {
        return queArray[front];
    }

    //返回队列的大小
    public int getSize() {
        return nItems;
    }
}
