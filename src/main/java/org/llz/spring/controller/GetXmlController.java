package org.llz.spring.controller;

import org.llz.spring.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *获取XML控制器
 */
@Controller
public class GetXmlController {
    @RequestMapping(value = "/getXml", produces = "application/xml; charset=utf-8")
    public @ResponseBody
    List<User> getXml() {
        List<User> users = new ArrayList<User>();

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

