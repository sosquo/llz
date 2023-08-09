package org.llz.spring.controller;

import org.llz.spring.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 功能：获取JSON控制器
 */
@Controller
public class GetJsonController {

    @RequestMapping(value = "/getJson", produces = "application/json; charset=utf-8")
    @ResponseBody
    public User getJson() {
        User user = new User();
        user.setId(1);
        user.setUsername("萌萌哒");
        user.setPassword("12345");
        user.setTelephone("15889895678");
        user.setRegisterTime(new Date());
        user.setPopedom(1);
        return user;
    }

    @RequestMapping(value = "/getJsonArray", produces = "application/json; charset=utf-8")
    @ResponseBody
    public List<User> getJsonArray() {
        List<User> users = new ArrayList<>();

        User user = new User();
        user.setId(1);
        user.setUsername("萌萌哒");
        user.setPassword("12345");
        user.setTelephone("15889895678");
        user.setRegisterTime(new Date());
        user.setPopedom(1);
        users.add(user);

        user = new User();
        user.setId(2);
        user.setUsername("李文霞");
        user.setPassword("45678");
        user.setTelephone("13978783456");
        user.setRegisterTime(new Date());
        user.setPopedom(1);
        users.add(user);

        user = new User();
        user.setId(3);
        user.setUsername("郑智化");
        user.setPassword("88888");
        user.setTelephone("15890903456");
        user.setRegisterTime(new Date());
        user.setPopedom(1);
        users.add(user);

        return users;
    }
}
