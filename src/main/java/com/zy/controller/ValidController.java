package com.zy.controller;


import com.zy.utils.AesException;
import com.zy.utils.WXPublicUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * <ul>
 * <li>文件包名 : com.zy.controller</li>
 * <li>创建时间 : 2019/10/25 16:41</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 关于微信验证
 *
 * @author zhengyu
 */
@Controller
public class ValidController {

    @RequestMapping("/wxpublic/verify_wx_token")
    @ResponseBody
    public String verifyWXToken(HttpServletRequest request) throws AesException {
        String msgSignature = request.getParameter("signature");
        String msgTimestamp = request.getParameter("timestamp");
        String msgNonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");
        if (WXPublicUtils.verifyUrl(msgSignature, msgTimestamp, msgNonce)) {
            return echostr;
        }
        return null;
    }
}
