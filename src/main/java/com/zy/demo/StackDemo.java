package com.zy.demo;

/**
 * <ul>
 * <li>文件包名 : com.zy.demo</li>
 * <li>创建时间 : 2019/11/4 14:24</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 栈处理操作 如果最开始我就知道java 可以这样,就不会那么痛苦了
 * 这里虽然是用的数组来存储数据,但是其思想是栈的思想
 * <p>
 * 这里maxSize 是确定的,只是top是不确定的,是可以随时变动的格式
 * 我这里只是好感慨,在大学阶段是用c来学这些东西,导致自己好痛苦
 * 但是现在感觉这些东西还是挺那个啥的,还是挺简单的,感觉都不一样了法
 * 唉,如果当初有这种技术心态就完全不一样了.
 *
 * @author zhengyu
 */
public class StackDemo {

    private int[] array;
    private int maxSize;
    private int top;

    //数据初始化
    public StackDemo(int size) {
        this.maxSize = size;
        this.array = new int[size];
        this.top = -1;
    }

    public static void main(String[] args) {

        //注意这里 a++和 a-- 等的区别,非常重要的概念
        StackDemo stackDemo = new StackDemo(9);
        stackDemo.push(1);
        stackDemo.push(2);
        stackDemo.push(3);

        System.out.println(stackDemo.peek());
        while (!stackDemo.isEmpty()) {
            //出栈
            System.out.println(stackDemo.pop());
        }

        //判断该栈是否为空
        System.out.println(stackDemo.isEmpty());
    }

    //压栈
    public void push(int value) {
        if (top < maxSize - 1) {
            array[++top] = value;
        }
    }

    //出栈
    public int pop() {
        return array[top--];
    }

    //访问栈顶数据
    public int peek() {
        return array[top];
    }

    //判断栈是否为空
    public boolean isEmpty() {
        return (top == -1);
    }

    //判断栈是否满了
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
