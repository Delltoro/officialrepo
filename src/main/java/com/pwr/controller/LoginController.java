package com.pwr.controller;
import com.pwr.model.User;
import com.pwr.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET , value = "/custom_login")
    public String showLogin() {
        return "login";
    }




}
