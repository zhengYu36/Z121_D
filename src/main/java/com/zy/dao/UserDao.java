package com.zy.dao;

import com.zy.entity.User;

import java.util.List;

/**
 * <ul>
 * <li>文件包名 : com.zy.dao</li>
 * <li>创建时间 : 2019/10/18 10:40</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */

public interface UserDao {

    List<User> queryList(User user);

    List<User> queryList2(User user);

    User insert(User user);

    User update(User user);

    User delete(Integer id);

    User selectById(Integer id);

    User selectByName(String name);
}
