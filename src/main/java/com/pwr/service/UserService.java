package com.pwr.service;

import com.pwr.repository.UserRepositoryImpl;
import com.pwr.model.Advertisement;
import com.pwr.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;


public class UserService {

    public void addAdvertisement(HttpServletResponse response , HttpServletRequest request) {
        Configuration conf = new Configuration().configure().addAnnotatedClass(User.class).addAnnotatedClass(Advertisement.class);
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
       // EntityManager entityManager = new EntityManager() {


      //  UserRepositoryImpl impl = new UserRepositoryImpl(entityManager);

        // Advertisement parametrs
        String discipline = request.getParameter("disciplineJSP");
        String description = request.getParameter("descriptionJSP");
        String city = request.getParameter("cityJSP");
        String cityRegion = request.getParameter("cityRegionJSP");
        int    experience  =   Integer.parseInt(request.getParameter("experienceJSP"));
        boolean wantSparring = Boolean.getBoolean(request.getParameter("wantSparringJSP"));
        boolean wantTraining = Boolean.getBoolean(request.getParameter("wantTrainingJSP"));
        Principal principal = request.getUserPrincipal();
        String name = principal.getName();
        User user = new User();

        Advertisement adv = new Advertisement(user,discipline,description,city,cityRegion,experience,wantSparring,wantTraining);

        Transaction tx = session.beginTransaction();

        session.save(adv);
        tx.commit();

    }


}
