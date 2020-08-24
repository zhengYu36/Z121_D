package com.zy.designModel16;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel16</li>
 * <li>创建时间 : 2020/8/24 16:37</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 就是说 a++ 或 a--都不影响自身
 * 只是影响要结束的这个对象
 *
 * @author zhengyu
 */
public class Test {

    public static void main(String[] args) {
  /*      int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);*/

        Collection collection = new MyCollection();
        Iterator it = (Iterator) collection.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
