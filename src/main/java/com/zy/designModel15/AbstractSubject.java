package com.zy.designModel15;

import java.util.Enumeration;
import java.util.Vector;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel15</li>
 * <li>创建时间 : 2020/8/24 16:17</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class AbstractSubject implements Subject {

    private Vector<Observer> vector = new Vector<>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            enumeration.nextElement().update();
        }
    }

    @Override
    public void operation() {

    }
}
