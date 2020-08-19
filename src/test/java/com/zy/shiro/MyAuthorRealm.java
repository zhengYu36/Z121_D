package com.zy.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.HashSet;
import java.util.Set;

/**
 * <ul>
 * <li>文件包名 : com.zy.shiro</li>
 * <li>创建时间 : 2020/8/19 14:56</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 关于授权验证
 * 授权包含了认证和授权了
 * 你想嘛，肯定需要手首先判断是否登录了才能往后走撒
 *
 * @author zhengyu
 */
public class MyAuthorRealm extends AuthorizingRealm {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //获取授权用户
        Object primaryPrincipal = principals.getPrimaryPrincipal();
        System.out.println("授权用户:" + primaryPrincipal);
        //设置角色
        SimpleAuthorizationInfo info = null;
        Set<String> roles = new HashSet<>();
        Set<String> perms = new HashSet<>();;
        if ("admin".equals(primaryPrincipal)) {
            //用户角色
            roles.add("admin");
        }
        if ("guest".equals(primaryPrincipal)) {
            roles.add("guest");
            //用户具体行为，一般情况下，行为是绑定到角色上面的
            perms.add("see");
        }
        //设置角色
        info = new SimpleAuthorizationInfo(roles);
        //设置具体的行为
        info.setStringPermissions(perms);
        System.out.println("授权判断完成!");
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("RealmForDouble认证中---->用户：" + token.getPrincipal());
        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        String password = "123456";// 假设这是从数据库中查询到的用户密码
        // 创建一个SimpleAuthenticationInfo，第一个参数是用户名，第二个是验证密码，第三个是当前realm的className
        // 验证密码会与用户提交的密码进行比对
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(upToken.getUsername(), password, this.getName());
        return info;
    }
}
