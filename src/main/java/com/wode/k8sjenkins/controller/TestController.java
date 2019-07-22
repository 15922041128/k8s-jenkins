package com.wode.k8sjenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by konamikce on 2019/7/19.
 */
@Controller
public class TestController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("in controller");
        return "hello";
    }
}
