package com.zy.controller;

import com.zy.entity.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <ul>
 * <li>文件包名 : com.zy.controller</li>
 * <li>创建时间 : 2020/6/23 16:55</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
@Configuration
@RestController
@RequestMapping(value = "/user2")
public class User2Controller extends BaseController {

    @RequestMapping("/query")
    public User sayHi(@RequestParam("name")String name){
        User user = new User();
        user.setName(name);
        return user;
    }

}
