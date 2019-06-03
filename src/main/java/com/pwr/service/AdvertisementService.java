package com.pwr.service;


import com.pwr.model.Advertisement;
import com.pwr.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Service
public class AdvertisementService {

    public void addAdvertisement(HttpServletResponse response , HttpServletRequest request) {
        Configuration conf = new Configuration().configure().addAnnotatedClass(User.class).addAnnotatedClass(Advertisement.class);
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        //int disc = Integer.parseInt(request.getParameter("disciplineJSP"));
        int disc = 1;
        String desc = request.getParameter("descriptionJSP");
        String city = request.getParameter("cityJSP");
        String cityRegion = request.getParameter("cityRegionJSP");
        //int experience = Integer.parseInt(request.getParameter("experienceJSP"));
        int experience = 1;
        boolean wantSparring  = Boolean.getBoolean(request.getParameter("wantSparringJSP"));
        boolean wantTraining  = Boolean.getBoolean(request.getParameter("wantTrainingJSP"));
        String username = (request.getParameter("username"));
        Transaction tx = session.beginTransaction();
        String hql = "FROM User where username=:userr";
        Query query = session.createQuery(hql);
        query.setParameter("userr",username);
        List<User> list = query.list();

        Advertisement adv = new Advertisement(list.get(0),disc,desc,city,cityRegion,experience,wantSparring,wantTraining);


        session.save(adv);
        tx.commit();

    }

}
