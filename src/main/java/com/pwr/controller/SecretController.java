package com.pwr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;

@Controller
@RequestMapping("")
public class SecretController {

    @RequestMapping(method = RequestMethod.GET , value = "/secret")
    public ModelAndView showSecret(Model model, HttpServletResponse res, HttpServletRequest req) {
        Principal principal = req.getUserPrincipal();
        ModelAndView mv = new ModelAndView();
        model.addAttribute("name",principal.getName());
        mv.setViewName("addAdv");
        return mv;
    }
}
