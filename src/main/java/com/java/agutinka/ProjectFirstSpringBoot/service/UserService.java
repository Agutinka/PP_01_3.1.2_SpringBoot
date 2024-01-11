package com.java.agutinka.ProjectFirstSpringBoot.service;



import com.java.agutinka.ProjectFirstSpringBoot.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(int id);

    void saveUser(User user);

    void updateUser(int id, User user);

    void deleteUser(int id);
}
