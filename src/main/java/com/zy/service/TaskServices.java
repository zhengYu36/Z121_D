package com.zy.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * <ul>
 * <li>文件包名 : com.zy.service</li>
 * <li>创建时间 : 2019/10/21 11:33</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
@Service
public class TaskServices {

    @Async
    public void say2(){
        try{
            Thread.sleep(3000L);
            System.out.println("AsyncMethod function is say2");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
