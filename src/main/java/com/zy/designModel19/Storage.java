package com.zy.designModel19;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel19</li>
 * <li>创建时间 : 2020/8/25 9:55</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class Storage {

    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
