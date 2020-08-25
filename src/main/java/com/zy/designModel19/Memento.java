package com.zy.designModel19;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel19</li>
 * <li>创建时间 : 2020/8/25 9:52</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class Memento {
    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
