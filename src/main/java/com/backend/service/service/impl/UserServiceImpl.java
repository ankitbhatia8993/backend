package com.backend.service.service.impl;

import com.backend.service.entry.UserEntry;
import com.backend.service.manager.UserManager;
import com.backend.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Ankit Bhatia on 12/17/16.
 */
@Component("userService")
public class UserServiceImpl implements UserService {

    private UserManager manager;

    @Autowired
    @Qualifier("userManager")
    public void setManager(UserManager manager) {
        this.manager = manager;
    }

    public UserEntry findById(Long id) {
        return manager.findById(id);
    }
}
