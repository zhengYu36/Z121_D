package com.zy.demo;

import lombok.Data;

/**
 * <ul>
 * <li>文件包名 : com.zy.demo</li>
 * <li>创建时间 : 2019/10/25 14:39</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
@Data
public class TestDataAnno {

    private String name;
    private int gae;

    public String getName() {
        if(this.name == null){
            this.name = "郑宇";
        }
        return this.name;
    }

}
