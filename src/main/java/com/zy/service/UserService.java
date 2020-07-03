package com.zy.service;

import com.zy.dao.UserDao;
import com.zy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <ul>
 * <li>文件包名 : com.zy.service</li>
 * <li>创建时间 : 2019/10/18 10:39</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    @Autowired
    TaskServices taskServices;

    public List<User> querList(User user) {
        List<User> users = userDao.queryList(user);

        List<User> users1 = userDao.queryList2(user);
        users1.forEach(i->{
            byte[] blobD = i.getBlobD();
            String str = new String(blobD);
            System.out.println(str);
        });
        System.out.println("user1 is:"+users1);

        return users;
    }

    //@Transactional
    @RequestMapping("xxxxxdfd")
    public void update(User user) {
        //更新第一个
       /* User i = userDao.update(user);
        System.out.println("i result is:" + i);
        User delete = userDao.delete(user.getUserId());
        System.out.println("delete is:" + delete);*/

       //测试异步方法
        System.out.println("step 1");
        say1();
        System.out.println("step 2");
        taskServices.say2();
        System.out.println("step 3");
    }

    public void say1(){
        System.out.println("function is say1");
    }


}
