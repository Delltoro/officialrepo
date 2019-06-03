package com.pwr.controller;
import com.pwr.service.RegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class RegisterController {

    @RequestMapping(method = RequestMethod.POST, value = "register")
    public ModelAndView register(HttpServletRequest req , HttpServletResponse res) {

        RegisterService regServ = new RegisterService();
        regServ.addUser(res,req);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("registerSuccessfully");
        return mv;
    }

    @RequestMapping(method = RequestMethod.GET, value = "register")
    public ModelAndView showRegisterPage(HttpServletRequest req, HttpServletResponse res){

        ModelAndView mv = new ModelAndView();
        mv.setViewName("register");
        return mv;
    }


}
