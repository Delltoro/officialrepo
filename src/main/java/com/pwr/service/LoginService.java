package com.pwr.service;
import com.pwr.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


public class LoginService {

    public User getUser(HttpServletRequest req , HttpServletResponse res) {
        Configuration conf = new Configuration().configure().addAnnotatedClass(User.class);
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        User user = new User();
        Transaction tx = session.beginTransaction();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> criteria = builder.createQuery(User.class);
        criteria.from(User.class);
        List<User> users = session.createQuery(criteria).getResultList();
        for(User user1 : users) {
            if(user1.getUsername()==req.getParameter("username") && user1.getPassword()==req.getParameter("password"));
            {
                session.close();
                return user1;
            }
        }

        session.close();
        return null;
    }



}
