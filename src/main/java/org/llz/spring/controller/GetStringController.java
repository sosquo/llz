package org.llz.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GetStringController {

    @RequestMapping(value = "/getString", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String getStr() {
        return "<h1>Spring MVC 美丽雅！</h1>";
    }
}
