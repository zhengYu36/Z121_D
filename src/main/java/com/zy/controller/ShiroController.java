package com.zy.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <ul>
 * <li>文件包名 : com.zy.controller</li>
 * <li>创建时间 : 2020/8/19 16:05</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
@Controller
@RequestMapping("/shiro")
public class ShiroController {

    //登录
    @RequestMapping("/login")
    public String login(String username, String password) {
        System.out.println(username + ":" + password);
        Subject currentUser = SecurityUtils.getSubject();
        if (!currentUser.isAuthenticated()) {
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            token.setRememberMe(true);
            try {
                currentUser.login(token);
            } catch (AuthenticationException ae) {
                System.out.println("登录失败: " + ae.getMessage());
            }
        }
        return "redirect:/admin.jsp";
    }

    //登出
    @RequestMapping("/logout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        System.out.println("退出成功");
        return "redirect:/login.jsp";
    }
}
