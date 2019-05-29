package com.pwr.repository;

import com.pwr.model.User;

public interface UserRepository {

    User getUserById(String id);
}
