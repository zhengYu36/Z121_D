package com.zy.designModel19;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel19</li>
 * <li>创建时间 : 2020/8/25 9:55</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 备忘录模式就是用一个临时中间类来保存变量，可以重新恢复等
 *
 * @author zhengyu
 */
public class Test {

    public static void main(String[] args) {

        //创建原始类
        Original original = new Original("egg");

        //创建备忘录
        Storage storage = new Storage(original.createMemento());

        //修改原始类的状态
        System.out.println("初始状态为 "+original.getValue());
        original.setValue("niu");
        System.out.println("修改后的状态为 "+original.getValue());

        //回到原始类的状态
        original.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态为 "+original.getValue());

    }
}
