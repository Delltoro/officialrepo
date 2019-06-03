package com.pwr.controller;

import com.pwr.model.Advertisement;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.pwr.service.AdvertisementService;

import javax.jws.WebParam;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Controller
public class DisciplinesPagesController {

     AdvertisementService advertisementService = new AdvertisementService();
    List<Advertisement> listAdvertisement = new ArrayList<Advertisement>();



    @RequestMapping(method = RequestMethod.GET , value = "/table_tennis")
    public ModelAndView showTableTennisPage() {
        ModelAndView mv = new ModelAndView();
/*
        //mv.addObject("advertisements", advertisementService.findAllInTableTennis());
        listAdvertisement = advertisementService.findAllInTableTennis();
        if(listAdvertisement != null)
            mv.addObject("advertisements", listAdvertisement);
  */
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
