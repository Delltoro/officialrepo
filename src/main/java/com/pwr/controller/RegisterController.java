package com.pwr.controller;
import com.pwr.service.RegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class RegisterController {

    @RequestMapping("register")
    public ModelAndView login(HttpServletRequest req , HttpServletResponse res) {

        RegisterService regServ = new RegisterService();
        regServ.addUser(res,req);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("registerSuccessfully");
        return mv;
    }
}
