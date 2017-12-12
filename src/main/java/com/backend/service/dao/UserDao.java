package com.backend.service.dao;

import com.backend.service.entity.User;

/**
 * Created by Ankit Bhatia on 12/17/16.
 */
public interface UserDao {
    User findById(Long id);

    User create(User user);

    User update(User user);
}
