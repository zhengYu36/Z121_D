package com.zy.designModel16;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel16</li>
 * <li>创建时间 : 2020/8/24 16:31</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public interface Iterator {

    //前移
    public Object previous();

    //后移
    public Object next();

    //是否有下一个值
    public boolean hasNext();

    //获取第一个元素
    public Object first();
}
