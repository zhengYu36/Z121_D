package com.zy.demo;

import org.apache.ibatis.session.SqlSession;
import org.springframework.util.Base64Utils;

import java.util.Base64;

/**
 * <ul>
 * <li>文件包名 : com.zy.demo</li>
 * <li>创建时间 : 2020/8/27 10:41</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class Demo3 {

    public static void main(String[] args) {

        String str="严";
        byte[] bytes = str.getBytes();

        //base64 就是把其他编码转换为ascii码可以识别的方式
        // 这样是在图片传输的过程中来使用的，不然没法使用

        byte[] encode = Base64Utils.encode(str.getBytes());
        System.out.println(new String(encode));


    }
}
