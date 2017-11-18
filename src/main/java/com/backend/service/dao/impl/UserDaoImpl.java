package com.backend.service.dao.impl;

import com.backend.service.dao.UserDao;
import com.backend.service.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Created by Ankit Bhatia on 12/17/16.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    protected EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public User findById(Long id) {
        Query query = entityManager.createNamedQuery(User.FIND_BY_ID);
        query.setParameter("id", id);
        User user = (User) query.getSingleResult();
        return user;
    }
}
