package com.zy.designModel16;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel16</li>
 * <li>创建时间 : 2020/8/24 16:33</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class MyIterator implements Iterator {

    private Collection collection;
    private int pos = -1;

    public MyIterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public Object previous() {
        if(pos >0){
            pos--;
        }
        return collection.get(pos);
    }

    @Override
    public Object next() {
        if(pos<collection.size()-1){
            pos++;
        }
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        if(pos<collection.size()-1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object first() {
        pos = 0;
        return collection.get(pos);
    }
}
