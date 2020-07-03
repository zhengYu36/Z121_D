package com.zy.demo;

/**
 * <ul>
 * <li>文件包名 : com.zy.demo</li>
 * <li>创建时间 : 2019/11/1 10:12</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class DictTest {
    public static void main(String[] args) {
        //这里就是获取code
        System.out.println(DictEntry.Type.one.getCode());

        //根据code获取对应的说明
        System.out.println(DictEntry.Type.getNameByCode(1));
    }
}
