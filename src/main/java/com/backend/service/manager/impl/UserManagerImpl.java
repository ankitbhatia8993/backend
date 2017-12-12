package com.backend.service.manager.impl;

import com.backend.service.dao.UserDao;
import com.backend.service.entity.User;
import com.backend.service.entry.UserEntry;
import com.backend.service.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Ankit Bhatia on 12/17/16.
 */
@Component("userManager")
public class UserManagerImpl implements UserManager {

    private UserDao userDao;

    @Autowired
    @Qualifier("userDao")
    public void setDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserEntry findById(Long id) {
        User user = userDao.findById(id);
        return convertToEntry(user);
    }

    public UserEntry update(UserEntry userEntry) {
        return convertToEntry(userDao.update(convertToEntity(userEntry)));
    }

    public UserEntry create(UserEntry userEntry) {
        return convertToEntry(userDao.create(convertToEntity(userEntry)));
    }

    private UserEntry convertToEntry(User entity) {
        UserEntry entry = new UserEntry();
        entry.setId(entity.getId());
        entry.setFirstName(entity.getFirstName());
        entry.setLastName(entity.getLastName());
        entry.setEmail(entity.getEmail());
        entry.setGender(entity.getGender());
        return entry;
    }

    private User convertToEntity(UserEntry entry) {
        User entity = new User();
        entity.setId(entry.getId());
        entity.setFirstName(entry.getFirstName());
        entity.setLastName(entry.getLastName());
        entity.setEmail(entry.getEmail());
        entity.setGender(entry.getGender());
        return entity;
    }
}
