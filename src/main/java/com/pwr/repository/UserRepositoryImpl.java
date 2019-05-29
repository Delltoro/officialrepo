package com.pwr.repository;

import com.pwr.model.User;
import javax.persistence.EntityManager;

public class UserRepositoryImpl implements UserRepository {

    private EntityManager em;

    public UserRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public User getUserById(String id) {
        return em.find(User.class,id);
    }
}
