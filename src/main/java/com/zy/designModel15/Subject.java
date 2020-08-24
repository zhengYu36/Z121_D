package com.zy.designModel15;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel15</li>
 * <li>创建时间 : 2020/8/24 16:15</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public interface Subject {

    //添加观察者
    public void add(Observer observer);

    //删除
    public void del(Observer observer);

    //通知
    public void notifyObservers();

    //自身操作
    public void operation();
}
