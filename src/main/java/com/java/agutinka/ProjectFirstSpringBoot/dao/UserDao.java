package com.java.agutinka.ProjectFirstSpringBoot.dao;



import com.java.agutinka.ProjectFirstSpringBoot.models.User;

import java.util.List;

public interface UserDao {
    List<User> index();
    User show(int id);
    void save(User user);
    void update(int id, User user);
    void delete(int id);
}