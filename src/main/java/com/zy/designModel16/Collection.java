package com.zy.designModel16;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel16</li>
 * <li>创建时间 : 2020/8/24 16:30</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public interface Collection {

    public Iterator iterator();

    //获得集合元素
    public Object get(int i);

    //取得集合的大小
    public int size();

}
