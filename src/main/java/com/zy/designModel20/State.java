package com.zy.designModel20;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel20</li>
 * <li>创建时间 : 2020/8/25 10:02</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class State {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1(){
        System.out.println("execute the first opt!");
    }

    public void method2(){
        System.out.println("execute the second opt!");
    }
}
