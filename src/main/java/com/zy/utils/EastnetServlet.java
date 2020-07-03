package com.zy.utils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class EastnetServlet extends HttpServlet {

    public EastnetServlet() {
        super();
    }


    @Override
    public void destroy() {
        super.destroy();
    }

    /**
     * 确认请求来自于微信服务器
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("接口测试开始！！！");
        //微信加密签名
        String signature = request.getParameter("signature");
        //时间戳
        String timestamp = request.getParameter("timestamp");
        //随机数
        String nonce = request.getParameter("nonce");
        //随机字符串
        String echostr = request.getParameter("echostr");

        PrintWriter out = response.getWriter();
        //通过校验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败
        if (SignUtil.checkSignature(signature, timestamp, nonce)) {
            out.print(echostr);
        }
        out.close();
        out = null;
//			response.encodeRedirectURL("success.jsp");

    }

    @Override
    public void init() throws ServletException {
        // Put your code here
    }

}
