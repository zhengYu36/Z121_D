package com.zy.designModel17;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel17</li>
 * <li>创建时间 : 2020/8/24 16:51</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class MyHandler extends AbstractHandler implements Handler  {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name+"deal!");
        if(getHandler() != null){
            getHandler().operator();
        }
    }
}
