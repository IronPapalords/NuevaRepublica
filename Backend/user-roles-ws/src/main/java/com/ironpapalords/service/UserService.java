package com.ironpapalords.service;

import java.util.List;

import com.ironpapalords.model.User;
import com.ironpapalords.model.UserDTO;

public interface UserService {
    User save(UserDTO user);
    List<User> findAll();
    User findOne(String username);
}
