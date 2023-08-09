package org.llz.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * 登录控制器
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session) {
        //将从登录表单获取的用户名写入会话
        session.setAttribute("username", username);
        //判断是否登陆成功
        if (username.equals("admin") && password.equals("123456")) {
            return "success";//返回逻辑视图名
        } else {
            //返回逻辑视图名
            return "failure";
        }
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("toLogin")
    public String login1() {
/*        返回逻辑视图名称，优先级比view-controller视图控制器高
        如果这边改成login1，找不到login1.jsp 则会读取view-controller的login.jsp*/
        return "login";
    }


}

