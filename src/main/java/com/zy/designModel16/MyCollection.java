package com.zy.designModel16;


/**
 * <ul>
 * <li>文件包名 : com.zy.designModel16</li>
 * <li>创建时间 : 2020/8/24 16:32</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class MyCollection implements Collection {

    public String  string[] = {"A","B","C","D","E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
