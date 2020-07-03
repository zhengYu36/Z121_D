package com.zy.controller;

import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;

/**
 * <ul>
 * <li>文件包名 : com.zy.controller</li>
 * <li>创建时间 : 2020/4/29 11:41</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class BaseController extends MultiActionController {

    @Override
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {

        System.out.println("initBinder start...");
        super.initBinder(request, binder);
    }
}
