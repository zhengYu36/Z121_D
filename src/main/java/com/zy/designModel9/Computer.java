package com.zy.designModel9;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel9</li>
 * <li>创建时间 : 2020/8/24 14:19</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class Computer {

    private CPU cpu;
    private Memory memory;
    private Desk desk;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.desk = new Desk();
    }

    public void startup(){
        System.out.println("start the computer!");
        cpu.startup();
        memory.startup();
        desk.startup();
        System.out.println("start computer finished!");
    }

    public void shutdown(){
        System.out.println("begin to close the computer!");
        cpu.shutdown();
        memory.shutdown();
        desk.shutdown();
        System.out.println("computer shutdown");
    }
}
