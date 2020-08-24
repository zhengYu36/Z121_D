package com.zy.designModel18;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel18</li>
 * <li>创建时间 : 2020/8/24 16:58</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class Invoker {

    private Commond command;

    public Invoker(Commond command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }

}
