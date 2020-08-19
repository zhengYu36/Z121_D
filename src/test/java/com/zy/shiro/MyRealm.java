package com.zy.shiro;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.*;
import org.apache.shiro.realm.AuthenticatingRealm;

/**
 * <ul>
 * <li>文件包名 : com.zy.shiro</li>
 * <li>创建时间 : 2020/8/19 14:48</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
@Slf4j
public class MyRealm extends AuthenticatingRealm {
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        log.info("用户为:" + token.getPrincipal());
        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        String password = "123456";// 假设这是从数据库中查询到的用户密码
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(upToken.getPrincipal(), password, this.getName());
        return info;
    }
}
