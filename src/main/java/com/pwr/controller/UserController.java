package com.pwr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @RequestMapping("addAdver")
    public void addAdvertisement(HttpServletRequest req , HttpServletResponse res) {

    }
}
