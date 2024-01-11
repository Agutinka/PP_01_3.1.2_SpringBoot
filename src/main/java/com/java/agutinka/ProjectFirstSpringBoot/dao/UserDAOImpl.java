package com.java.agutinka.ProjectFirstSpringBoot.dao;

import com.java.agutinka.ProjectFirstSpringBoot.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> index() {
        return entityManager.createQuery("select user from User user", User.class)
                .getResultList();
    }

    @Override
    public User show(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
        entityManager.flush();
    }

    @Override
    public void update(int id, User updatedUser) {
        User userToBeUpdated = entityManager.find(User.class, id);
        if (userToBeUpdated != null) {
            userToBeUpdated.setName(updatedUser.getName());
            userToBeUpdated.setAge(updatedUser.getAge());
        }
    }

    @Override
    public void delete(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
}