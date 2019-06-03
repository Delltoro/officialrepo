package com.pwr.controller;

import com.pwr.service.AdvertisementService;
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
public class AdvertisementController {

    @RequestMapping(method = RequestMethod.GET , value = "/add_TennisAdv")
    public ModelAndView showTennisForm(Model model, HttpServletResponse res, HttpServletRequest req) {
        ModelAndView mv = new ModelAndView();
        Principal principal = req.getUserPrincipal();
        model.addAttribute("discipline" ,2);
        model.addAttribute("user" ,principal.getName());
        mv.setViewName("addAdv");
        return mv;
    }

    @RequestMapping(method = RequestMethod.GET , value = "/add_tableTennisAdv")
    public ModelAndView showTableTennisForm(Model model, HttpServletResponse res, HttpServletRequest req) {
        ModelAndView mv = new ModelAndView();
        Principal principal = req.getUserPrincipal();
        model.addAttribute("discipline" ,1);
        model.addAttribute("user" ,principal.getName());
        mv.setViewName("addAdv");
        return mv;
    }

    @RequestMapping(method = RequestMethod.GET , value = "/add_BadmintonAdv")
    public ModelAndView showBadmintonForm(Model model, HttpServletResponse res, HttpServletRequest req) {
        ModelAndView mv = new ModelAndView();
        Principal principal = req.getUserPrincipal();
        model.addAttribute("discipline" ,3);
        model.addAttribute("user" ,principal.getName());
        mv.setViewName("addAdv");
        return mv;
    }

    @RequestMapping(method = RequestMethod.GET , value = "/addAdver")
    public ModelAndView showBadmintonForm(HttpServletResponse res, HttpServletRequest req) {
        AdvertisementService regServ = new AdvertisementService();
        regServ.addAdvertisement(res,req);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }
}
