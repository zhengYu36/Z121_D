package com.zy.controller;

import com.zy.entity.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Controller
@RequestMapping("user2/")
public class User2Controller extends BaseController {

    @RequestMapping("/query")
    public User sayHi(@RequestParam("name")String name){
        User user = new User();
        user.setName(name);
        user.setName("xiaoyuge99999");
        return user;
    }

}
