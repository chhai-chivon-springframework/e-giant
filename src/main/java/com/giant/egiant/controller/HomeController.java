package com.giant.egiant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author by chhai.chivon  on 11/27/2017.
 */
@Controller
public class HomeController {
    //https://github.com/Nasruddin/spring-boot-jwt-auth
    //https://github.com/Nasruddin/spring-boot-samples
    @RequestMapping(value = "/" , method = RequestMethod.GET)
    protected String index(ModelMap modelMap) {
        modelMap.put("key","value");
        return "abc";
    }
}
