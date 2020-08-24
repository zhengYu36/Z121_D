package com.zy.designModel9;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel9</li>
 * <li>创建时间 : 2020/8/24 14:23</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 外观模式
 * 是为了减少类之间的依赖，就行spring一样
 * 不过spring很多都是放到配置文件里面的
 *
 * @author zhengyu
 */
public class User {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        System.out.println("=====================");
        computer.shutdown();
    }
}
