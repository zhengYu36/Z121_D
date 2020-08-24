package com.zy.designModel15;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel15</li>
 * <li>创建时间 : 2020/8/24 16:20</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("update self");
        notifyObservers();
    }
}
