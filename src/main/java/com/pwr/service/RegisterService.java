package com.pwr.service;
import com.pwr.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterService {

    public void addUser(HttpServletResponse response , HttpServletRequest request) {
    Configuration conf = new Configuration().configure().addAnnotatedClass(User.class);
    SessionFactory sf = conf.buildSessionFactory();
    Session session = sf.openSession();
    String firstname = request.getParameter("fname");
    String lastname = request.getParameter("lname");
    String uname = request.getParameter("uname");
    String pass  = request.getParameter("pass");
    String mail  = request.getParameter("mail");

    User user = new User(pass,uname,firstname,lastname,mail);
    Transaction tx = session.beginTransaction();

        session.save(user);
        tx.commit();

    }


}
