package com.zy.realms;

import com.zy.dao.UserDao;
import com.zy.entity.User;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

/**
 * 注意下相关逻辑
 * 这里一般情况下是获取到该用户了，
 * 该用户有相关的角色，角色会去绑定相关行为
 * 就是这样来的哈
 */
public class MyRealm extends AuthorizingRealm {

    @Autowired
    UserDao userDao;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        Object principal = principals.getPrimaryPrincipal();
        System.out.println("RealmForDouble授权中---->用户：" + principal);
        SimpleAuthorizationInfo info = null;
        Set<String> roles = new HashSet<>();
        if ("admin".equals(principal)) {
            roles.add("admin");
        }
        if ("guest".equals(principal)) {
            roles.add("guest");
        }
        info = new SimpleAuthorizationInfo(roles);
        return info;
    }

    //    认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        System.out.println("RealmForDouble认证中---->用户：" + token.getPrincipal());

        UsernamePasswordToken upToken = (UsernamePasswordToken) token;

        //获取用户信息
        User user = userDao.selectByName(token.getPrincipal().toString());

        //String password = "123456";// 假设这是从数据库中查询到的用户密码
        //数据是1234
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(upToken.getUsername(), user.getUserPassword(), this.getName());

        return info;
    }
}