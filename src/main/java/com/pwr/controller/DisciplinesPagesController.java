package com.pwr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@Controller
public class DisciplinesPagesController {

    @RequestMapping(method = RequestMethod.GET , value = "/table_tennis")
    public ModelAndView showTableTennisPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("tableTennis");
        return mv;
    }

    @RequestMapping(method = RequestMethod.GET , value = "/tennis")
    public ModelAndView showTennisPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("tennis");
        return mv;
    }

    @RequestMapping(method = RequestMethod.GET , value = "/badminton")
    public ModelAndView showBadmintonPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("badminton");
        return mv;
    }
}
