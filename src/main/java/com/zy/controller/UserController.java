package com.zy.controller;

import com.zy.entity.MHandleProphasePlan;
import com.zy.entity.User;
import com.zy.requestparam.vo.UserParamVo;
import com.zy.service.UserService;
import com.zy.utils.SpringBeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

/**
 * <ul>
 * <li>文件包名 : com.zy.controller</li>
 * <li>创建时间 : 2019/10/18 10:39</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */

@Controller
@RequestMapping("user/")
public class UserController extends BaseController{

    @Autowired
    UserService userService;


    @RequestMapping("/queryList")
    public String queryList(HttpServletRequest request, HttpServletResponse response) throws Exception{
        //去调取查询user表里面的数据信息
        List<User> users = userService.querList(null);
        System.out.println("users is:" + users.size());

        //从spring容器获取bean,否则无法注入
        Object obj = SpringBeanUtil.getBeanByName("dataSource");
        System.out.println("obj is:"+obj);

        return "ok";
    }

    @RequestMapping("/update")
    public void update(User user) {
        //更新操作
        userService.update(user);
    }


    @RequestMapping(value = "/save")
    @ResponseBody
    public String save(@RequestBody String json, Integer port) throws IOException {

        System.out.println("json value is:"+json);
        return "ok";
    }


    /**
     * <ul>
     * <li>生成时间： 2019/10/30 11:26</li>
     * <li>方法说明：</li>
     * <li>开发人员：zhengyu</li>
     * </ul>
     *
     * @param user
     * @param bErrors
     * @return java.lang.Object
     */
    @RequestMapping("/valid")
    public Object validEntity(@Valid UserParamVo user, BindingResult bErrors) throws Exception {

        if (bErrors.hasErrors()) {
            List<ObjectError> ObjectErrorList = bErrors.getAllErrors();
            StringBuffer message = new StringBuffer();
            for (ObjectError objectError : ObjectErrorList) {
                message.append(objectError.getObjectName() + ":" + objectError.getDefaultMessage());
                message.append("\n");
            }
            System.out.println("valid result is:\n" + message);

        }
        return "ok";
    }


    @RequestMapping(value = "/saveInfo")
    public String save(@RequestBody MHandleProphasePlan json) throws IOException {
        System.out.println("json value is:"+json);
        return "ok";
    }

}
